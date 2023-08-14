package webdriver.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("darshan");
		driver.findElement(By.name("pass")).sendKeys("Hello");
		driver.findElement(By.name("login")).click();
		
		/*
		 * FindElement:-->
		 *      It is a Webdriver class method using to find
		 *      single object at webpage
		 *      
		 *  By:-->
		 *  	By is a locator builder class it contains	
		 *  	set of identifiers like [id,name,class,tagname,xpath--etc]
		 *  	to recognize objets at webpage with unique identity
		 *  
		 *  Sendkeys:-->
		 *  	It is action method usefull to type text
		 *  	into editbox and pass group of keyboard keys to any 
		 *  	selected object.
		 *  
		 *  Click:-->
		 *  	It is a action method perform left click 
		 *  	action on selected object..
		 */
		
		
		
	}

}
