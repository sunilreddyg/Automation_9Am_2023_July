package miniproject;

import org.junit.Test;

public class RunTestCases extends TestBase
{
	public RunTestCases() 
	{
		setupchrome();
		loginvalid();
	}

	@Test
	public void Changeinfo_ContactNum() 
	{
		ClickonElement(MenuTabsMyinfo);
		ClickonElement(Contactdetails);
		Cleartext(mobilenum);
		typetext(mobilenum, Ipmobile);
	}

}
