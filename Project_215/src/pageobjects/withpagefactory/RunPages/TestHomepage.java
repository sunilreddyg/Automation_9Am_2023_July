package pageobjects.withpagefactory.RunPages;

import org.junit.Test;
import pageobjects.withoutpagefactory.TestBase;
import pageobjects.withpagefactory.Pages.HomePageHRM;

public class TestHomepage extends TestBase
{

	@Test
	public void test() 
	{
		SetupChrome();
		HomePageHRM home=new HomePageHRM(driver);
		home.userlogin("Admin", "admin123");
	}

}
