package genericlibraries;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.math3.ode.events.Action;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.ByteString.Output;

public class WebDriverUtility
{
	public WebDriver driver;
	/**
	 * This method is used to launch browser
	 * @param browser 
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser( String browser)
	{
		switch(browser) {
		case "chrome":
		driver=new ChromeDriver();
		break;
		case "firefox":
		driver=new FirefoxDriver();
		break;
		case "edge":
		driver=new EdgeDriver();
		break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		return driver;
		
	}

	/**
	 * This method is used to maximize browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to navigate to application
	 * @param
	 */
	public void navigattoApplication(String url) {
		driver.get(url);
	}
	/**
	 * This method is used to wait till web page is loaded
	 * @param time
	 */
	public void waittillPageLoad(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	/**
	 * This method is used to wait until the visi9bility of web element
	 * @param time
	 * @param element
	 */
	public void explilicitWait(long time, WebElement element) {
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to mouse hover on a element
	 * @param element
	 */
	public void mousehover(WebElement element) {
		Action a=new Action(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to select an element from dropdown based on index
	 * @param element
	 * @param index
	 */
	public void dropdown(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}
	/**
	 * This method is used to select an element from dropdown based on value
	 * @param value
	 * @param element
	 */
	public void dropdown(String value,WebElement element) {
		Select s=new Select(element);
		s.selectByValue(value);
		
	}
	/**
	 * This method is used to select an element from dropdown based on text
	 * @param element
	 * @param text
	 */
	public void dropdown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * This method is used to get parent window ID
	 * @return
	 */
	public String getParentWindowID() {
		return driver.getWindowHandle();
	}
	/**
	 * This method is used to handle child browser popup
	 */
	public void childBrowserPopUp() {
		Set<String>set=driver.getWindowHandles();
		for(String window:set) {
			driver.switchTo().window(window);
		}
	}
	/**
	 * This method is used to switch to frame based on index
	 * @param index
	 */
	public void switchtoFrame(String index) {
	driver.switchTo().frame(index);	
	}
	/**
	 * This method is used to switch to frame bases on element
	 * @param element
	 */
	public void switchtoframe(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * this method is used to handle alert popup by clicking 'ok'
	 */
	public void alertOk() {
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is used to hande alert popup by clicking
	 */
	public void alertCancel() {
		driver.switchTo().alert().dismiss();
	
}
public String getScreenshots(String Classname,JavaUtility javaUtil) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest =new File("Screeshot/"+classname+"_"+)
}
	
	
}

