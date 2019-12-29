package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Configuration 
{
WebDriver driver;
@BeforeMethod
public void launchBrowser()
{
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// for all elements to wait 30 seconds means all driver elements
		driver.get("https://en-gb.facebook.com/login/");

}
	@AfterMethod
public void CloseBrowser() 
{
			driver.quit();
}
}
