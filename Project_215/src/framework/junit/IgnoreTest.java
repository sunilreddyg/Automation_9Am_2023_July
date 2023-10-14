package framework.junit;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest 
{
	
	@Test
	public void tc001()
	{
		System.out.println("Test1 Executed");
	}
	
	@Ignore
	public void tc002()
	{
		System.out.println("Test2 Executed");
	}
	
	@Test
	public void tc003()
	{
		System.out.println("Test3 Executed");
	}
}
