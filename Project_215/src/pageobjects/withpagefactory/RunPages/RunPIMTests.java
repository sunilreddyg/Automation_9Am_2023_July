package pageobjects.withpagefactory.RunPages;

import static org.junit.Assert.*;

import org.junit.Test;

import pageobjects.withoutpagefactory.TestBase;
import pageobjects.withpagefactory.Testcases.PIM_Tests;

public class RunPIMTests extends TestBase
{

	@Test
	public void test() 
	{
		SetupChrome();
		PIM_Tests test=new PIM_Tests(driver);
		test.creatingemployeewithfirstnameempty();
	}

}
