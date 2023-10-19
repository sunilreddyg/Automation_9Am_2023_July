package framework.testng.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider="dp",enabled=false)
  public void test(String name, String mobile) 
  {
	  
  }
  
  @Test(dataProvider="MobilePrices")
  public void verifyprices(String mobile,double price)
  {
	  if(price < 50000)
		  System.out.println(mobile);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"Sam","9030248851" },
      new Object[] {"Harika","854124541" },
      new Object[] {"Arjun","855222" },
    };
  }
  
  
  //To use dataprovider information in different class  declare method with static
  @DataProvider
  public static Object[][] MobilePrices()
  {
	  Object[][] data=
		  {
				  new Object[] {"Iphone",55550.00},
				  new Object[] {"Samsung",45550.00},
				  new Object[] {"Vivo",25550.00}
		  };
	  return data;
  }
  
}
