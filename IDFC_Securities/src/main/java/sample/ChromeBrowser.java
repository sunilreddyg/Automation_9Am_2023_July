package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		//Follow when your are using selenium version 4.5 below
		
		/*
		 * Note:--> required Chromedriver.exe file to download
		 * 			and need to setup environment variable before launch..
		 */
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down a page until receive Browsers
		 * 		=> Click  to open list of browser drivers
		 * 		=> under Chrome browser click on documentation link
		 * 		=> Check what version of chrome browser is installed
		 * 	
		 * 					Open ChromeBrowser --> click on settings
		 * 					---> Help Menu----> About google chrome
		 * 		=> Click on chromedriver version w.r.t chrome browser version
		 * 		=> Select required operating system and click  on download
		 * 		=> After download unzip file to backup location
		 * 		=> After unzip you receive chromedriver.exe file then set up
		 * 			environment variable for chromedriver.exe file..
		 * 
		 */
		
		//Setting runtime environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver.exe");
		
		//launching chrome browser and storing browser int Webdriver Interface
		WebDriver driver=new ChromeDriver();
				
		//loading webpage into automation browser window
		driver.get("http://facebook.com");
		
		
		
		
		

	}

}
