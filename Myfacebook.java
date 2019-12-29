package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class Myfacebook {
	
	
	public static void main(String org[]) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("renu");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gowda");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gowdassss@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("gowdassss@gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("gowda1234");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("22");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Mar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
		Assert.assertTrue(driver.findElement(By.xpath("//select[@name='birthday_year']")).isDisplayed(),"Error info : dropdowns doesnt displayed");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Assert.assertTrue(	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isEnabled(),"Error info: Radio button is not selected ");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();
		
		
		
		
	}


}
