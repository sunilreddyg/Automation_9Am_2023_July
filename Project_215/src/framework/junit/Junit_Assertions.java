package framework.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Junit_Assertions {

	@Test
	public void test1() 
	{
		Assert.assertEquals("Gmail", "Gmail");
		System.out.println("Text maching");
	}
	
	@Test
	public void test2() 
	{
		Assert.assertEquals(10, 30-10);
		System.out.println("Value matching");
	}
	
	@Test
	public void test3() 
	{
		Assert.assertTrue(10 > 5);
		System.out.println("Testpass");
	}
	
	@Test
	public void test4() 
	{
		Assert.assertTrue(10 < 5);
		System.out.println("Testpass");
	}
	
	@Test
	public void test5() 
	{
		Assert.assertEquals("Test Found ","H0","Hi");
		System.out.println("Testpass");
	}

}
