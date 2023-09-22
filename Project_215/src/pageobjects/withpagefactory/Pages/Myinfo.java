package pageobjects.withpagefactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class Myinfo
{
	


	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement  Firstname;
	
	@FindBy(xpath = "//input[@name='middleName']")
	public WebElement  MiddleName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement  Surname;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement  Nickname;



}