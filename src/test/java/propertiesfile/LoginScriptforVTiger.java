package propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptforVTiger {

	public static void main(String[] args) throws IOException, InterruptedException
	{
	FileInputStream fis=new FileInputStream("./src/test/resources/commonData.Properties");
	Properties p=new Properties();
	p.load(fis);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(p.getProperty("timeouts"))));
	
	driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
	Thread.sleep(5000);
	driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
	Thread.sleep(5000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	if (driver.getTitle().contains("Track")) 
	{
		System.out.println("pass");
	}
	else
		
	{
		System.out.println("fail");
		
		
		
	}
	driver.quit();
	}
	
	

	}


