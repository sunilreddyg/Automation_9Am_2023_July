package webdriver.Editbox;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Syntax_Example {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.name("firstname"))
		.sendKeys("Darshan"+Keys.TAB
				+"kumar"+Keys.TAB
				+"darshan@gmail.com");
		
		Thread.sleep(2000);
		
		
		//Selecting dropdown option using Keboard keys
		driver.findElement(By.id("day")).sendKeys("24");
		
		//Selecting dropdown option using arrow keys
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		//Selecting Radio button using keyboard shortcut
		driver.findElement(By.xpath("(//input[@type='radio'])[2]"))
		.sendKeys(Keys.SPACE);
		
		
		/*
		 * Note:-->
		 * 		For dropdown selection and checkbox and radio button
		 * 		selection selenium have separate commands..
		 */
		
		
	}

}
