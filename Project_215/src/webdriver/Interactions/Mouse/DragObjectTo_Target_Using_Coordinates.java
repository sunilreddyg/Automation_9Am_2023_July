package webdriver.Interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragObjectTo_Target_Using_Coordinates {

	public static void main(String[] args) {
		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/photo-manager.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
				
		WebElement img1=driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));

		//Create object for Actions class
		Actions action=new Actions(driver);
		action.dragAndDropBy(img1, 600, 200).perform();
		
	}

}
