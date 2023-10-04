package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Example 
{

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		//Default method to read all option tag elements from Dropdown element
		List<WebElement> AllOptions=new Select(Month).getOptions();
		
		for (WebElement EachOption : AllOptions) 
		{
			EachOption.click();
		}
		
		
		//Regular method to read group object from dropdown
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		List<WebElement> YearOptions=Year.findElements(By.tagName("option"));
		for (WebElement webElement : YearOptions) 
		{
			if(webElement.getText().equals("2002"))
					webElement.click();
		}
	}

}
