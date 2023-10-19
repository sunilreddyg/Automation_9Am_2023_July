package framework.testng.CrossBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import oops.Inheritance.webdriver.Common_Reusable_Actions;

public class CrossBrowser_Test extends Common_Reusable_Actions
{
	
	@Test(priority=0)
	@Parameters("browsername")  //Parameter from suite file
	public void SetupBrowser(String browser)
	{
		LaunchBrowser(browser);
	}
	
	
	@Test(priority=1)
	@Parameters("Application_url")   //Parameter from suite file
	public void loadApp(String url) throws Exception
	{
		load_webpage(url);
		set_explicitwait_time(20);
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid, String Apwd)
	{
		Type_text("//input[@id='email']", Auid);
		Type_text("//input[@id='pass']", Apwd);
		
	}
	
	@AfterClass
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		close_browser();
	}
	

}
