package hardcodedTestScripts;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webUtility.Methodslaunchingvtiger.WebDriverUtility;

public class Organisations
{
	public static void main(String[] args) throws InterruptedException
{		
		PropertiesFileUtility property=new PropertiesFileUtility();
		ExcelUtility excel=new ExcelUtility();
		WebDriverUtility web=new WebDriverUtility();
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
//		Thread.sleep(2000);
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
//		driver.findElement(By.name("accountname")).sendKeys("Acc4");
//		driver.findElement(By.name("button")).click();
//		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	    List<WebElement> listorg= driver.findElements(By.xpath("//a[@title='Organizations']"));
	    int count=0;
	    for (int i = 0; i < listorg.size(); i++) 
	    {
			if (listorg.get(i).getText().equals("Acc4"))
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

//Thread.sleep(5000);
//System.out.println("------------------------------------------------------------------------------------------------------");
//System.out.println("The Organisations Names");
//System.out.println("------------------------------------------------------------------------------------------------------");
//List<WebElement>organisations=driver.findElements(By.xpath("//a[@title='Organizations']"));
//for (int i = 1; i <organisations.size(); i++) 
//{
//	System.out.println(organisations.get(i).getText());
//}
//System.out.println("------------------------------------------------------------------------------------------------------");


