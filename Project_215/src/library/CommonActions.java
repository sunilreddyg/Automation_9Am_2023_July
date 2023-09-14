package library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions 
{
	
	protected WebDriver driver;
	String url="http://facebook.com";
	WebDriverWait wait;
	int windowHeight=1024;
	int  windowWidth=768;
	int timeinsec=100;
	/*
	 * Launch Browser [chrome,firefox,ie]
	 */
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;
			
		default:System.out.println("Browser Name mismatched");
			break;
		}
	}
	
	
	//Loading WebPage
	public void LoadPage(String url)
	{
		if(driver!=null)
		{
			driver.get(url);
		}
		else
			System.out.println("Browser launch failed");
	}
	
	
	//Manage Time and window
	public void implicttimeout(int timeinsec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinsec));
	}
	
	public void explicitwait(int timeinsec)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(timeinsec));
	}
	
	
	//Manage window
	public void managewindow(int width,int height)
	{
		driver.manage().window().setSize(new Dimension(width, height));
	}
	
	
	//SetupBrowser
	public void setupchrome()
	{
		launchBrowser("chrome");
		LoadPage(url);
		managewindow(windowWidth, windowHeight);
		implicttimeout(timeinsec);
		explicitwait(timeinsec);
	}
	
	//SetupBrowser
	public void setupfirefox()
	{
		launchBrowser("firefox");
		LoadPage(url);
		managewindow(windowWidth, windowHeight);
		implicttimeout(timeinsec);
		explicitwait(timeinsec);
	}
	
	
	//Get Browser Driver
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	//Verify PagetTitle
	public boolean VerifyPageTitle(String ExpTitle)
	{
		boolean flag=false;
		if(driver!=null)
		{
			try {
				wait.until(ExpectedConditions.titleContains(ExpTitle));
				System.out.println("Page title Verified :-->"+driver.getTitle());
				flag=true;
			} catch (Exception e) {
				System.out.println("Page Title Not Verified:--> "+driver.getTitle());
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("browser launch failed");
		}
		
		return flag;
	}
	
	
	//Send Text to Editbox/Textbox/Entrybox using default method
	public void typetext(String xpath,String input)
	{
		try {
			wait.until(ExpectedConditions.
					visibilityOfElementLocated(By.xpath(xpath))).sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Send Text to Editbox/Textbox/Entrybox using mouse action
	public void sendkeystoTextbox(String xpath,String input)
	{
		try {
			WebElement Element=wait.until(ExpectedConditions.
					visibilityOfElementLocated(By.xpath(xpath)));
			new Actions(driver).sendKeys(Element, input).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//ClickMethod
	public void ClickonElement(String xpath)
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
