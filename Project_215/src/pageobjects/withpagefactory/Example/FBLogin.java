package pageobjects.withpagefactory.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBLogin 
{
	//Object Declartion using Pageobjects
	public By CreateAccount=By.xpath("//a[contains(.,'Create new account')]");
	
	//Object Declaration for PageFactory class
	@FindBy(id="email") 
	public WebElement loginemail;
	
	@FindBy(xpath="//input[@data-testid='royal_pass']")
	public WebElement loginpassword;
	
	@FindBy(xpath = "//button[contains(@name,'login')]")
	public WebElement loginbutton;
	
	//Old method to declare page object
	@FindBy(how=How.LINK_TEXT,using="Forgotten password?") 
	public WebElement forgotpassword;
	
	public void  clickforgotpassworlink()
	{
		forgotpassword.click();
	}

}
