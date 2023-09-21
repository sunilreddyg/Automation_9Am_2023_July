package pageobjects.withoutpagefactory;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Run_Pages extends TestBase
{
	
	WebDriver driver;
	
	@Test
	public void test1() 
	{
		SetupChrome();
		Testcase1 tests=new Testcase1(driver);
		tests.VerifyInvalidlogin();
	}
	
	//@Test
	public void test2() 
	{
		SetupChrome();
		Testcase1 tests=new Testcase1(driver);
		tests.VerifyInvalidlogin();
	}
	

}
