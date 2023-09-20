package pageobjects.withoutpagefactory;

import org.junit.Test;

public class Run_Pages extends TestBase
{

	//@Test
	public void test1() 
	{
		SetupChrome();
		Testcase1 test=new Testcase1(driver);
		test.VerifyInvalidlogin();
	}
	
	@Test
	public void test2() 
	{
		SetupChrome();
		Testcase1 test=new Testcase1(driver);
		test.VerifyValidLogin();
	}
	

}
