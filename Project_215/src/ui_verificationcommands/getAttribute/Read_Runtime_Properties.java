package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Runtime_Properties 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(15000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		Thread.sleep(3000);
		
		//Read Runtime Property for Roundtrip object
		String RoundtripClass=Roundtrip.getAttribute("class");
		if(RoundtripClass.contains("selected"))
		{
			System.out.println("RoundTrip is Selected");
			WebElement DoubleSeatFares=driver.findElement(By.xpath("//p[contains(.,'Double Seat  Fares')]"));
			if(DoubleSeatFares.getAttribute("class").contains("disabled"))
				System.out.println("Testpass, On Roundtrip selection Double seat fare was disabled");
			else
				System.out.println("Testfail, On Rountrip selection double seat fare was enabled");
		}
		else
		{
			System.out.println("Roundtrip is not selected");
		}
	}

}
