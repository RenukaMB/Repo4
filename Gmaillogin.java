package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmaillogin 
{
public static void main(String org[]) throws InterruptedException
{
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("renukagowdajs@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("renurenurenu16");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@type=’submit’ OR @name=’buttonSubmit’]"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
				

}
}