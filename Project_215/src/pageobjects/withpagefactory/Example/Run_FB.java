package pageobjects.withpagefactory.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FB {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//To find @Findyby object we must use PageFactory Class
		FBLogin login=PageFactory.initElements(driver, FBLogin.class);
		login.loginemail.sendKeys("admin");
		login.loginpassword.sendKeys("admin");
		login.loginbutton.click();
		
		login.clickforgotpassworlink();
	}

}
