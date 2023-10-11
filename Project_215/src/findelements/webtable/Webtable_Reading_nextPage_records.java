package findelements.webtable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtable_Reading_nextPage_records 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/share-market-today/indices");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		By Next_btn=By.xpath("//a[contains(@id,'tblIdxMoment_next')]");
		while(true)
		{
			Thread.sleep(4000);
			WebElement Table=driver.findElement(By.id("tblIdxMoment"));
			List<WebElement> rows=Table.findElements(By.tagName("tr"));
			rows.remove(0);
			for (WebElement EachRow : rows) 
			{
				System.out.println(EachRow.getText());
			}
			
			
			try {
				new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.attributeContains(Next_btn, "class", "disabled"));
				break;
			} catch (Exception e) {
				driver.findElement(Next_btn).click();
			}
			
		}
		

	}

}
