package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass //Invoke before execution of first @Test annoation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class precondition");
	}

	@AfterClass //invoke after @Test annotation
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCOndition");
	}

	@Test
	public void xyz() 
	{
		System.out.println("test1 executed");
	}
	
	@Test
	public void abc() 
	{
		System.out.println("test2 executed");
	}

}
