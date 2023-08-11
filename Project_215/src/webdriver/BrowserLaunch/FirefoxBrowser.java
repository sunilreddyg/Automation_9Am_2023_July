package webdriver.BrowserLaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		
		
		FirefoxDriver firefox=new FirefoxDriver();
		//loading webpage into automation browser window
		firefox.get("http://facebook.com");
		
		//Get Page Title from automation window
		String PageTitle=firefox.getTitle();
		System.out.println(PageTitle);
		
		//Close browser window
		firefox.close();
	}

}
