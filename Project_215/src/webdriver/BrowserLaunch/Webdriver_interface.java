package webdriver.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_interface {

	public static void main(String[] args) 
	{
		
		/*
		 * Webdriver:-->
		 * 			WebDricer is a interface class it is designed
		 * 			to automate all browser instances
		 */
		
		
		
		
		//launching chrome browser and storing browser int Webdriver Interface
		WebDriver driver=new ChromeDriver();
		
		//loading webpage into automation browser window
		driver.get("http://facebook.com");
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//Reading page title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//Closing browser window
		driver.close();
		

	}

}
