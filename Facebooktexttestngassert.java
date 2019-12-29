package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class Facebooktexttestngassert
{


	public static void main(String org[]) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//Thread.sleep(5000);
		//String watermark1; 
		
		//watermark1=driver.findElement(By.xpath("//div[@class='_5iyx']")).getText();
		//System.out.println(watermark1);;
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='_5iyx']")).getText(),"Facebook helps you12334 connect and share with the people in your life.","Erro info : Tetxt values are not matching");
driver.switchTo().alert().accept();// for positive response..
driver.switchTo().alert().dismiss();// for negative response..
	}
}
