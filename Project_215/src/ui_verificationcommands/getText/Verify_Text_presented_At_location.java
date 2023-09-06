package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_presented_At_location {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		//Sending blank text to email editbox
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		
		try {
			WebElement ErrorLocation=driver.findElement(By.xpath("//div[@id='usernameError']"));
			System.out.println("Element Located at webpage");
			String Error=ErrorLocation.getText();
			if(!Error.isEmpty())
			{
				System.out.println("Location Contains Text");
				String ExpError="Enter a valid email address, phone number, or Skype name.";
				if(Error.equals(ExpError))
					System.out.println("Testpass, Error Presented");
				else
					System.out.println("Testfail, Error not presented");
			}
			else
			{
				System.out.println("Location Return Empty");
			}
		} catch (Exception e) {
			System.out.println("Element Not Located at webpage");
			e.printStackTrace();
		}
	}

}
