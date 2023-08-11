package webdriver.BrowserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) 
	{
		//launching browser and storing browser into ChromeDriver class reference
		ChromeDriver chrome=new ChromeDriver();
		
		//loading webpage into automation browser window
		chrome.get("http://facebook.com");
		
		//Get Page Title from automation window
		String PageTitle=chrome.getTitle();
		System.out.println(PageTitle);
		
		//Close browser window
		chrome.close();
	}

}
