package pageobjects.withoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.withoutpagefactory.keywords.PageObject_Keywords;

public class HRM_Loginpage 
{
	WebDriver driver;
	PageObject_Keywords keywords;
	public HRM_Loginpage(WebDriver driver) 
	{
		this.driver=driver;
		keywords=new PageObject_Keywords(driver);
	}
	
	public  By username=By.xpath("//input[@name='username']");
	public  By password=By.cssSelector("input[name='password']");
	public  By login=By.xpath("//button[@type='submit']");
	public  By forgotpassword=By.xpath("//p[contains(.,'Forgot your password?')]");
	public  By loc_invalidCredentials=By.xpath("//p[contains(.,'Invalid credentials')]");
	public  By header=By.xpath("//h5[contains(.,'Login')]");
	
	
	
	public void userlogin(String UID,String PWD)
	{
		
		driver.findElement(username).sendKeys(UID);
		driver.findElement(password).sendKeys(PWD);
		driver.findElement(login).click();
	}
	
	public void hrmlogin(String UID,String PWD)
	{
		keywords.typetext(username, UID);
		keywords.typetext(password, PWD);
		keywords.ClickElemnet(login);
		
	}
	
	public boolean verifyLoginpageDisplayed()
	{
		boolean flag=false;
	
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(username));
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
