package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myname {
	public static void main(String arg[]) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// for all elements to wait 30 seconds means all driver elements

		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("renukagowdajs@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
        WebDriverWait wait=new WebDriverWait(driver,80);// its only for password to wait 80 seconds - if doesnt enterd a password within 80 seconds it as to display a error
        //message in console,, we use fluentwait to take its own time to download a particular task or thing to run- it will take it own time and excecute it will not 
        //send a error message...
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("renurenurenu16");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//*[@type=’submit’ OR @name=’buttonSubmit’]"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
				
	}

}