package switch_commands.Window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    
	    //get All Window ID's 
	    Set<String> AllWindowIds=driver.getWindowHandles();
	    
	    //Using Iterator Class Convert set of String into Iterator
	    Iterator<String> itr=AllWindowIds.iterator();
	    
	    //Read First Window ID
	    String Window1=itr.next();
	    String Window2=itr.next();
	    
	    //Switch to second window
	    driver.switchTo().window(Window2);
	    System.out.println("Meta Title is --> "+driver.getTitle());


	    //Switch to First window
	    driver.switchTo().window(Window1);
	    System.out.println("MainWindow title is --> "+driver.getTitle());
	    
	    
	    /*
	     * Note:--> Only use this program when two windows are opened.
	     * 			[
	     * 				Because Set is  a unorder collection of obejcts
	     * 				it change it's order when more than two iterations 
	     * 				available 
	     * 			]
	     */
	}

}
