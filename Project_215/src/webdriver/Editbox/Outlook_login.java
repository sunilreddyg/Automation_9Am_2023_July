package webdriver.Editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook_login 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set Up ChromeBrowser and Outlook Page
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clicking on sign in button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type username and Press Enter key
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		//Type password and press enter key
		driver.findElement(By.name("passwd"))
		.sendKeys("admin@123"+Keys.ENTER);
		
		//For submitting forms like registration and Login
		//driver.findElement(By.name("passwd")).submit();
		
	}

}
