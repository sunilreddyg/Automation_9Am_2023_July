package webdriver.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Remote_Origin_Error {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Launching chrome browser using chrome options
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
