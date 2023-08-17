package objectidentification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Test 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Manage until expected object load into htmlsource
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Login Script
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		
	}

}
