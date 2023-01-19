package hardcodedTestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickQuickCreate
{
public static void main(String[] args) throws InterruptedException
{
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
		WebElement list = driver.findElement(By.id("qccombo"));
		 Select select = new Select(list);
		 select.selectByValue("Events");
		 driver.findElement(By.name("subject")).sendKeys("Thilak");
		WebElement list2 = driver.findElement(By.name("eventstatus"));	
		Select select2 = new Select(list2);
		select2.selectByValue("Held");
		
		//date picker
       
		
		
		
		WebElement list3 = driver.findElement(By.name("activitytype"));
		Select select3 = new Select(list3);
		select3.selectByValue("Meeting");
		
		driver.findElement(By.xpath("//input[@value='T']")).click();
		
		WebElement list4 = driver.findElement(By.name("assigned_group_id"));
		Select select4 = new Select(list4);
		select4.selectByValue("2");
		
		
		
}

}
