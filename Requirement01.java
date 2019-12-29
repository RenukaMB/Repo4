package newpackage;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Requirement01 extends Configuration
{
@Test
 public void Loginpage()
 
 {
	// System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
	// driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// for all elements to wait 30 seconds means all driver elements

	//driver.get("https://en-gb.facebook.com/login/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gowdassss@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gowda1234");
	driver.findElement(By.xpath("//button[@name='login']")).click();

 }
@Test
public void Zbck()
{ 
System.out.println("hello");	
}
}


