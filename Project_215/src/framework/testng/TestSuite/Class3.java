package framework.testng.TestSuite;


import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class3 
{
	@Test
	public void tc007()
	{
		Reporter.log("tcoo7 executed");
	}
	
	@Test
	public void tc008()
	{
		Reporter.log("tcoo8 executed");
	}
	
	
	@Test
	public void tc009()
	{
		Reporter.log("tcoo9 executed");
	}
	
	@BeforeSuite
	public void AllPrecondition()
	{
		System.out.println("Set Up Inititated");
	}
	
	@BeforeClass
	public void ClassPreCondition()
	{
		System.out.println("ClassC Started");
	}
	
}
