package framework.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_AfterMethod {

	@Before //Invoke every @Test annoation before
	public void setUp() throws Exception 
	{
		System.out.println("TestPreCondition");
	}

	@After  //invoke after every at test annoation
	public void tearDown() throws Exception 
	{
		System.out.println("Test Postcondition");
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
