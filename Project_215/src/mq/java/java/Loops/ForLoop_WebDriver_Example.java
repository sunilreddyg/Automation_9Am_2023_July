package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoop_WebDriver_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		String Footerlinks[][]= 
					{
							{"Sign Up","Sign up for Facebook | Facebook"},
							{"Log in","Log in to Facebook"},
							{"Messenger","Messenger"},
							{"Facebook Lite","Facebook Lite APK for Android"},
							{"Video","Facebook video | Facebook"},
							{"Places","Discover great places in every city | Facebook"},
							{"Games","Facebook"},
					};
		
		
		for (int i = 0; i < Footerlinks.length; i++) 
		{
			String[] strings = Footerlinks[i];
			String linkname=strings[0];
			String pagetitle=strings[1];
			driver.findElement(By.linkText(linkname)).click();
			
			if(driver.getTitle().contains(pagetitle))
			{
				System.out.println("Testpass:--> Title Verified");
			}
			else
			{
				System.out.println("Testfail:--> Title Not Verified");
			}
			
			
			//Get back to main page
			driver.navigate().back();
			
		}
		

	}

}
