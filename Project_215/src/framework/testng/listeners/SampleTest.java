package framework.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest 
{
	  @Test(retryAnalyzer = Rerun.class)
	  public void test2() 
	  {
	    Assert.fail();
	  }


}
