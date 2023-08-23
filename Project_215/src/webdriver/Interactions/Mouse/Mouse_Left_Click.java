package webdriver.Interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Left_Click {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		WebElement Uplaod_And_Download=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Uplaod_And_Download.click();
		Thread.sleep(3000);
		
		//Using Mouse Interactions Performing click method..
		WebElement UploadBtn=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(UploadBtn).perform();
		
	}

}
