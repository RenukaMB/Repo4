package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass {
	public static void main(String arg[]) 
			throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJAR\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		Thread.sleep(5000);
		String watermark1; //need to craete srting with any variable name for water mark and we can display a text in console
		// water marks nothing but text display inside the text box.... like email or phone inside enter email,,,
		watermark1=driver.findElement(By.xpath("//div[text()='Email or phone']")).getText();// getText() method is used fetch the text and display it in console
		//assigning a xpath to watermark variable 
		//need to use println method to print ,,,
		System.out.println(watermark1);
		String watermark2;
		Thread.sleep(5000);
		watermark2=driver.findElement(By.xpath("//span[text()='Next']")).getText();// its for Next buttton...
		System.out.println(watermark2);
		String watermark3;
		watermark3=driver.findElement(By.xpath("//span[text()='Sign in']")).getText();// its for Sign in ...
		System.out.println(watermark3);
		
		// driver.findElement(By.xpath("//div[text()='Email or phone']")).sendKeys("9148841812"); 
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("renurenurenu16");
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(500);
	}

}

@Test
public void verify()
{
	//String text;
//text=driver.findElement(By.xpath("//div[@class='page-title']")).getText();
//System.out.println(text);
Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']")).getText(), "THIS IS DEMO SITE FOR   ","erro info:text values are not matching");
Assert.assertEquals(driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).getText(), "MOBILE","erro info:text values are not matching");
driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();	
//driver.findElement(By.xpath("//div[@class='toolbar']/div[@class='sorter']/preceding::select[@onchange='setLocation(this.value)' and @title='Sort By']")).click();	

Select dropdown= new Select(driver.findElement(By.xpath("//div[@class='toolbar']/div[@class='sorter']/preceding::select[@onchange='setLocation(this.value)' and @title='Sort By']")));
 dropdown.selectByVisibleText("Name");
}
@Test
public void compare()
{	String text1;
	driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();	
	
text1=driver.findElement(By.xpath("//div[@class='price-box']/preceding::span[contains(text(),'$100.00')]")).getText();
System.out.println(text1);	
driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile/sony-xperia.html']")).click();	

String text2;
text2=driver.findElement(By.xpath("//span[@class='price']")).getText();
System.out.println(text2);	
System.out.println(text1.equals(text2));

}
@Test
public void cart()
{
	driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();	
	//driver.findElement(By.xpath("//button[@onclick=\"setLocation('http://live.guru99.com/index.php/checkout/cart/add/uenc/aHR0cDovL2xpdmUuZ3VydTk5LmNvbS9pbmRleC5waHAvbW9iaWxlLmh0bWw,/product/1/form_key/lOBLq5TubmOuuSQh/')\"]")).click();	
	driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile/sony-xperia.html']")).click();	
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("000");
	driver.findElement(By.xpath("//div[@class='add-to-cart-buttons']")).click();
	driver.findElement(By.xpath("//input[@type='text' and @value='1']")).sendKeys("000");
	driver.findElement(By.xpath("//button[@type='submit' and @title='Update']")).click();

	driver.findElement(By.xpath("//button[@type='submit' and @ title='Empty Cart']")).click();
	
}