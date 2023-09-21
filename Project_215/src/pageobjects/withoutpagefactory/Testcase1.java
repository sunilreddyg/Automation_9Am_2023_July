package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class Testcase1 
{
	WebDriver driver;
	HRM_Loginpage login;
	AccountPage account;
	
	public Testcase1(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_Loginpage(driver);
		account=new AccountPage(driver);
	}
	
	String ValidUID="Admin";
	String InvalidPWD="admin123456";
	public void VerifyInvalidlogin()
	{
		if(login.verifyLoginpageDisplayed())
		{
			login.userlogin(ValidUID, InvalidPWD);
			if(login.verifyErrorDisplayed())
			{
				System.out.println("Testpass, Error displayed");
			}
			else
				System.out.println("Testfail Error not displayed");
		}
	}
	
	String ValidPWD="admin123";
	public void VerifyValidLogin()
	{
		if(login.verifyLoginpageDisplayed())
		{
			login.userlogin(ValidUID, ValidPWD);
			if(account.verifyloginSuccessful())
				System.out.println("Testpass, login successful");
			else
				System.out.println("Testfail, Login failed");
		}
	}
	
	
	
	

}
