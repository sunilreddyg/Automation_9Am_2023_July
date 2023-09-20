package pageobjects.withoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRM_Loginpage 
{
	WebDriver driver;
	
	public HRM_Loginpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public static By username=By.xpath("//input[@name='username']");
	public static By password=By.cssSelector("input[name='password']");
	public static By login=By.xpath("//button[@type='submit']");
	public static By forgotpassword=By.xpath("//p[contains(.,'Forgot your password?')]");
	public static By loc_invalidCredentials=By.xpath("//p[contains(.,'Invalid credentials')]");
	public static By header=By.xpath("//h5[contains(.,'Login')]");
	
	
	
	public void userlogin(String UID,String PWD)
	{
		
		driver.findElement(username).sendKeys(UID);
		driver.findElement(password).sendKeys(PWD);
		driver.findElement(login).click();
	}
	
	public boolean verifyLoginpageDisplayed()
	{
		boolean flag=false;
	
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(username));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean verifyErrorDisplayed()
	{
		boolean flag=false;
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(loc_invalidCredentials));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public String readusername()
	{
		return driver.findElement(username).getAttribute("value");
		
	}
	
	
}
