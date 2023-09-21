package pageobjects.withoutpagefactory.keywords;

import org.junit.Test;

import pageobjects.withoutpagefactory.HRM_Loginpage;
import pageobjects.withoutpagefactory.TestBase;

public class RunWithKeywords extends TestBase
{
	PageObject_Keywords keywords;
	HRM_Loginpage login;
	public RunWithKeywords() 
	{
		SetupChrome();
		keywords=new PageObject_Keywords(driver);
		login=new HRM_Loginpage(driver);
	}

	@Test
	public void test() 
	{
		keywords.typetext(login.username, "Admin");
		keywords.typetext(login.password, "admin123");
		
	}

}
