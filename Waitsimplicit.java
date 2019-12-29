package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsimplicit
{
	public static void main(String org[])
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//a[@data-cli_action='accept']")).click();
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushAlert()']")).click();
		driver.switchTo().alert().accept();	
		WebDriverWait wait=new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushConfirm()']")));
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushConfirm()']")).click();
		driver.switchTo().alert().dismiss();	
        driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; promptConfirm()']")).click();
        driver.switchTo().alert().accept();	

}
}