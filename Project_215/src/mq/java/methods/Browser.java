package mq.java.methods;

public class Browser 
{
	//Instant method
	public void openbrowser()
	{
		System.out.println("Browser Is UP");
	}
	
	//Instant method
	public void loadurl()
	{
		System.out.println("Application Is UP");
	}
	
	//Instant method
	public void SetupBrowser()
	{
		openbrowser();
		loadurl();
	}
	
	
	public void Enterusername()
	{
		System.out.println("Username entry done");
	}
	
	public void Enterpassword()
	{
		System.out.println("password entry done");
	}
	
	public void clickloginbutton()
	{
		System.out.println("Login Button Get Clicked");
	}
	
	//instant method
	public void login()
	{
		//With In class Any instant method can call directly
		//Without object creation
		Enterusername();
		Enterpassword();
		clickloginbutton();
	}
	
	public void Testlogin()
	{
		SetupBrowser();
		login();
	}
	
	

	public static void main(String[] args) 
	{	 
		new Browser().Testlogin();
	}

}
