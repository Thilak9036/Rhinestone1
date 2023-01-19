package hardcodedTestScripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingLead 
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
			driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[4]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
			Thread.sleep(2000);
			WebElement lastname = driver.findElement(By.name("lastname"));
			lastname.sendKeys("Adam");
			driver.findElement(By.name("company")).sendKeys("Apples");
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			Thread.sleep(3000);  
		   WebElement edit = driver.findElement(By.xpath("//a[text()='edit']"));
		   edit.click();
		   driver.findElement(By.name("lastname")).clear();
		   Thread.sleep(3000);
		   driver.findElement(By.name("lastname")).sendKeys("Gokusan");
		   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			List<WebElement> lead=driver.findElements(By.xpath("//a[@title='Leads']"));
			int count=0;
		    for (int i = 0; i <  lead.size(); i++) 
		    {
				if ( lead.get(i).getText().equals("Gokusan1"))
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
