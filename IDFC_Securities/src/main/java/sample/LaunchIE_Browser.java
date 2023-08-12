package sample;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download IEDriverServer.exe file
		 * 
		 * 		=>https://www.selenium.dev/downloads/
		 * 		=> Download latest version  under 
		 * 			"The Internet Explorer Driver Server"
		 * 		=> It will download zip format file
		 * 		=> Unzip file and set environment variable 
		 * 				before launching your IE browser..
		 * 		
		 */
		
	
		System.setProperty("webdriver.ie.driver", "D:\\browserdrivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		String pagetitle=ie.getTitle();
		System.out.println(pagetitle);
		
		

	}

}
