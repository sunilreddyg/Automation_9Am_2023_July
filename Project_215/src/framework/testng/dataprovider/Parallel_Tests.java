package framework.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parallel_Tests 
{
	@Test(dataProvider = "dp1",threadPoolSize=3,invocationCount=2)
	public void testMethod(int number)
	{
	    Long id = Thread.currentThread().getId();
	    System.out.println("HELLO :  " + id);
	}


	@DataProvider(parallel=true)
	public Object[][] dp1() 
	{
	  return new Object[][] 
		{
	      new Object[] { 100 },
	      new Object[] { 200 },
	      new Object[] { 300 },
	      new Object[] { 400 },
	      new Object[] { 500 },
	      new Object[] { 600 },
	      new Object[] { 700 },
	      new Object[] { 800 }

	     };
	}

}
