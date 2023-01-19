package hardcodedTestScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conacatchoosingorg
{
public static void main(String[] args) throws InterruptedException {
	
	 WebDriverManager.chromedriver().setup();
     ChromeOptions option=new ChromeOptions();
     option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Adam12");
	    driver.findElement(By.xpath("//img[@alt='Select']")).click();
	    Thread.sleep(3000);
	    
	    Set<String> windowhandles = driver.getWindowHandles();
	    System.out.println(windowhandles);
	    Iterator<String> iterator = windowhandles.iterator();
	    String parentwindow = iterator.next();
	    String childwindow = iterator.next();
	    driver.switchTo().window(childwindow);    
	    driver.findElement(By.xpath("//a[text()='Google']")).click();
	    driver.switchTo().window(parentwindow);
	    
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(3000);
		List<WebElement> listcontacts=driver.findElements(By.xpath("//a[@title='Contacts']"));
		 int count=0;
		    for (int i = 0; i <  listcontacts.size(); i++) 
		    {
				if ( listcontacts.get(i).getText().equals("Adam12"))
				{
					count++;
				}	
			}
		    if (count>0) 
		    {
		    	System.out.println("Test case is passed");
		    }
		    
		   else
		   {	
		        System.out.println("Test case is failed");  	
			} 
		
		
		    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		    driver.quit();	
		

}
	
	
	
	
}
