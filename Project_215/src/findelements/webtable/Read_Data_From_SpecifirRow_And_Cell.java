package findelements.webtable;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_SpecifirRow_And_Cell 
{
	
	
	

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.investing.com/equities/icici-bank-ltd-historical-data");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		
		WebElement Table=driver.findElement(By.xpath("//table[@class='common-table medium js-table']"));
		
		//Finding list of rows under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Target Required row
		WebElement SelectedRow=rows.get(3);
		
		//Finding list of cell under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));

		String Date=cells.get(0).getText();
		String High=cells.get(3).getText();
		String volume=cells.get(5).getText();
		
		System.out.println(Date+"  "+High+"   "+volume);
	}

}
