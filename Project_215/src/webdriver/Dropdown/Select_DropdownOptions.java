package webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropdownOptions 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting dropdown using visible text
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("15");
		
		//Selecting dropdown using value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("5");
		
		//selecting dropdown using index number
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(25);
		
		

	}

}
