package library;

import org.openqa.selenium.WebDriver;

public class RunMainTest 
{

	public static void main(String[] args) 
	{
		
		CommonActions action=new CommonActions();
		action.setupchrome();
		
		//Get BrowserControl From Repository class to current Class
		WebDriver driver;
		driver=action.getDriver();
		if(driver!=null)
		{
			System.out.println(driver.getTitle());
		}
		
		String ExpTitle="Facebook";
		if(action.VerifyPageTitle(ExpTitle))
		{
			System.out.println("Title Verified");
			action.typetext("//input[@id='email']", "admin");
		}
		else
			System.out.println("Title not verified");
		
		
	}

}
