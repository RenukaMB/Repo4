package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popups {
	public static void main(String org[]) throws InterruptedException
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-cli_action='accept']")).click();
		Thread.sleep(5000);

	driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushAlert()']")).click();
	Thread.sleep(5000);

	driver.switchTo().alert().accept();	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushConfirm()']")).click();
	Thread.sleep(5000);

	driver.switchTo().alert().dismiss();	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; promptConfirm()']")).click();
	Thread.sleep(5000);

	driver.switchTo().alert().accept();
}
}