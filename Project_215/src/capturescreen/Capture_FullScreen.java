package capturescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_FullScreen {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    //Only seleium 4 have this feature
	    //Capture screen at selected location
	    
	    WebElement Footer=driver.findElement(By.xpath("(//ul[contains(@class,'6-i')])[2]"));
	    File src=Footer.getScreenshotAs(OutputType.FILE);
	    //Copty file to local folder
	    FileHandler.copy(src, new File("screens\\image3.png"));

	}

}
