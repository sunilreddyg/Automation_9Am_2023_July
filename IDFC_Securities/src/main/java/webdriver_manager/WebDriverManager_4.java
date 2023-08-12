package webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_4 {

	public static void main(String[] args) {
		
		//This line manage (i.e., download, setup, and maintenance)
		WebDriverManager.chromedriver().setup();
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");

	}

}
