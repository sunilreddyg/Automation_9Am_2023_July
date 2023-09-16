package miniproject;


public class TestBase extends CommonActions implements CommonObjects,CommonInputs
{

	
	public void loginvalid() 
	{
		if(VerifyPageTitle(Ippagetitle))
		{
			typetext(loginemail, Ipusenrame);
			typetext(loginpassword, Ippassword);
			ClickonElement(submitlogin);
		}
		else
			System.out.println("Hrm Page title notverified");
		Waitforvisible(dashboard);
		System.out.println("Object visible at webpage");
		
	}

}
