package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_browser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * download geckodriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under firefox click on documentation link
		 * 		=> Find suitable driver version 
		 * 		=> click on geckodriver releases
		 * 		=>  Latest version   [0.30.0 ] Supports [> 78 firefox version]
		 *      =>  Under selected Selected version scroll down page until find Assets
		 *      =>  Download Zip format file w.r.t  Operating system and hotspot size
		 *      =>  After download unzip file to backup folder
		 *      => either set up environment variabe for geckodriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		  
		//setting runtime environment variable for geckodriver
		System.setProperty("webdriver.gecko.driver", "D:\\browserdrivers\\geckodriver.exe");
		
		//Launching firefox browser..
		WebDriver driver=new FirefoxDriver();
		
		//loading webpage into automation browser window
		driver.get("http://facebook.com");
				

	}

}
