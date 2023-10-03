package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Target Single Dropdown 
		WebElement StateDrodpown=driver.findElement(By.id("customState"));
		
		//Finding list of oPtions under drodpown
		List<WebElement> list=StateDrodpown.findElements(By.tagName("option"));
		System.out.println("Option Count is :--> "+list.size());
		if(list.size() > 0)
		{
				//Read Each option from Collection
			    for (WebElement Eachoption : list) 
			    {
			    	//Reading OptionName
					System.out.println(Eachoption.getText());
					//Clicking on element
					Eachoption.click();
				}
		}
	}

}
