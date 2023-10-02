package mq.java.Loops;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_while {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Print Numbers from 1 to 10
		//True Condition
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i <= 10);
		
		
		//False Condition
		int j=20;
		do {
			System.out.println(j);
		} while (j < 10);
		
		
		
		//Reload webpage until Required title presented
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		boolean title_status=false;
		int count=0;
		do {
			
			driver.get("http://instagram.com");

			try {
				new WebDriverWait(driver, Duration.ofSeconds(50))
				.until(ExpectedConditions.titleContains("Instagram"));
				title_status=true;
				} catch (Exception e) {
					e.printStackTrace();
			    }
		
			count=count+1;
			if(count==30)
			{
				throw new Exception("Browser is Not Up");
			}
			
		} while (title_status==false);
		
		
		System.out.println("Page load successful, Expeted title loaded");
		


	}

}
