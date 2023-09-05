package mq.java.conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Elseif:-->
		 * 		Multiple decision take place here..
		 */
		
		
		 int a=18;
		 
		if (a > 18) 
		{
			System.out.println("Valid");
		}
		else if ( a < 18) 
		{
			System.out.println("invalid");
		}
		else if (a==18) 
		{
			System.out.println("Valid With Condition");
		}
		
		
		 
		String browser="chrome";
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
			System.out.println("Browser name mismtached");
		
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
		}
	
		
	}

}
