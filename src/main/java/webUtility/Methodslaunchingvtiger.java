package webUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methodslaunchingvtiger
{
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
	 * This method launches browser ,maximize it, navigate to aplliction and also provide implicitwait
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */

public WebDriver openApplication(String browser,String url,long time) {
	driver = launchBrowser(browser);
	maximizeBrowser();
	navigattoApplication(url);
	waittillPageLoad(time);
	return driver;
}
}
}