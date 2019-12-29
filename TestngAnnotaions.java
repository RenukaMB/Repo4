package newpackage;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestngAnnotaions  {

	@BeforeMethod
	void A1() {
	System.out.println("before method is executed");

	}

	@AfterMethod

	void A2() {
	System.out.println("after method is executed");
	}

	@Test
	void type() {
	System.out.println("test case is run");
	}

	@BeforeClass
void A3() {
	System.out.println("before class is executed");
	}
	@AfterClass
	void A4() {
	System.out.println("after class is executed");
	}
	@BeforeTest
	void A5() {
	System.out.println("before test is executed");

	}
	@AfterTest
	void A6() {
	System.out.println("after test is executed");

	}
	@BeforeSuite
	void A7() {
	System.out.println("before suite is executed");

	}
	@AfterSuite
	void A8()
	{
	System.out.println("after suite is executed");

	}

	}




