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

}
