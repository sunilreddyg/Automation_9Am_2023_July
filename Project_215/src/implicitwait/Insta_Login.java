package implicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Login {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000); 
		driver.findElement(By.name("username")).sendKeys("9030248855");

		
		/*
		 * Thread.sleep(1000);
		 * 
		 * 			=> Java timeout it will hold
		 * 			  execution for specific time
		 * 
		 * 			=> When Thread is define with in script
		 * 				we must add throws exception to methodname
		 * 
		 * 			public void methodA()  throws Exception
		 * 			{
		 * 				Thread.sleep(2000);
		 * 			}
		 */
	}

}
