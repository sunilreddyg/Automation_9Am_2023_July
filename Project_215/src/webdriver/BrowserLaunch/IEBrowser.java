package webdriver.BrowserLaunch;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		
		//Launching ie browser 
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
		//loading webpage into automation browser window
		ie.get("http://facebook.com");
		
		//Get Page Title from automation window
		String PageTitle=ie.getTitle();
		System.out.println(PageTitle);
		
		//Close browser window
		ie.close();

	}

}
