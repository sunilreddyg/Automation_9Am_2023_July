package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop {

	public static void main(String[] args) throws Exception 
	{
		
		//Print Numbers from 1 to 10
		int i=0;
		while(i <= 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//Print Number from 20 to 10
		int j=20;
		while(j >= 10)
		{
			System.out.println(j);
			j=j-1;
		}
		
		
		
		//Example:--> Manage Explicitwait using While Loop
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("info@gmail.com");
		

		WebElement RetypeObj = null;
		try {
			RetypeObj=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		int count=0;
		while(!RetypeObj.isDisplayed())
		{
			
	
			Thread.sleep(1000);
			count=count+1;
			if(count==100)
			{
				System.out.println("NotVisible after 100 seconds timeout");
				break;
			}
			
		}
		System.out.println("Object Visible at Webpage");
		
		
		
		
	}

}
