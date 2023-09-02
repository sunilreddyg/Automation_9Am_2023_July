package switch_commands.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewWindow {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	 
	    //Get Mainwindow ID
	    String MainwindowID=driver.getWindowHandle();
	   
	    
	    //Create Tab using 
	    WebDriver metawindow=driver.switchTo().newWindow(WindowType.TAB);
	    metawindow.get("https://about.meta.com/");
	    System.out.println(metawindow.getTitle());
	    
	    //Switch back to main window
	    driver.switchTo().window(MainwindowID);
	    System.out.println("Insta title is --> "+driver.getTitle());
	    
	    
	    //Create New Window
	    WebDriver Blogwindow=driver.switchTo().newWindow(WindowType.WINDOW);
	    Blogwindow.get("https://about.instagram.com/en_US/blog");
	    System.out.println(Blogwindow.getTitle());
	    
	    //Close Current window
	    Blogwindow.close();
	    
	    //Switch back to main window
	    driver.switchTo().window(MainwindowID);
	    System.out.println("Insta title is --> "+driver.getTitle());
	    
	    //CLose all windows
	    driver.quit();
	}

}
