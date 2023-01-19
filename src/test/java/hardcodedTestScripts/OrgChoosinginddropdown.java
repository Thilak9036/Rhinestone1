package hardcodedTestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrgChoosinginddropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("Apple");
		WebElement dropdown=driver.findElement(By.name("industry"));
		Select select1=new Select(dropdown);
		select1.selectByValue("Construction");
		WebElement dropdownacc=driver.findElement(By.name("accounttype"));
		Select select2=new Select(dropdownacc);
		select2.selectByValue("Investor");
		driver.findElement(By.name("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")).click();
		Thread.sleep(5000);
		 List<WebElement> listorg= driver.findElements(By.xpath("//*[@id=\"row_16\"]/td[3]/a"));
		 int count=0;
		 for (int i = 0; i < listorg.size(); i++) 
		 {
			 if (listorg.get(i).getText().equals("Apple"))
				 
			 {
				 
				count++;
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
			    
			
		}
	}
		
		
}

