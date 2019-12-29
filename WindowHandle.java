package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class WindowHandle 
{
	public static void main(String[] org) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
		String windowhandle =driver.getWindowHandle();
		System.out.println(windowhandle);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'ACCEPT')]")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		Thread.sleep(4000);
		/*
		 * String winHandle02 = driver.getWindowHandle();
		 * driver.switchTo().window(winHandle02);
		 */

		for (String handle : driver.getWindowHandles()) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			}
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		String main=driver.getTitle();
		System.out.println(main);
		driver.close();
		driver.quit();


	}
}