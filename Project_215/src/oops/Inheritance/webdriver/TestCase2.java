package oops.Inheritance.webdriver;



public class TestCase2 extends TestBase
{
	
	public void Tc001()
	{
		setupbrowser();
		userlogin();
		capturescreen("Login_invalid");
	}



}
