package webdriver.Interactions.Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		WebElement Firstname=driver.findElement(By.name("firstname"));
		new Actions(driver)
		.sendKeys(Firstname, "Sachin")
		.sendKeys(Keys.TAB)
		.sendKeys("Tendulkar")
		.sendKeys(Keys.TAB)
		.sendKeys("sachin@gmail.com")
		.pause(4000)
		.sendKeys(Keys.TAB)
		.sendKeys("sachin@gmail.com")
		.perform();

	}

}
