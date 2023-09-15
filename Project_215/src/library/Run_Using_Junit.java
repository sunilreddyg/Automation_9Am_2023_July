package library;

import org.junit.Test;

public class Run_Using_Junit extends CommonActions
{
	
	
	

	@Test
	public void test() 
	{
		setupchrome();
		System.out.println(driver.getTitle());
		typetext(CommonObjects.email, "Admin");
		sendkeystoTextbox(CommonObjects.password, "admin@123");
	}
	
	//@Test
	public void dropdowntest()
	{
		setupchrome();
		ClickonElement("//a[contains(.,'Sign Up')]");
		selectdropdownoption("//select[@id='day']", "24");
		selectdropdownoption("//select[@id='month']", "Dec");
		select_dropdown("//select[@id='year']", "index", "20");
	}

}
