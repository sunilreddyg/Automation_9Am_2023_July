package framework.testng.dataprovider;

import org.testng.annotations.Test;

public class Read_From_Diff_Class 
{
	
	@Test(dataProvider="MobilePrices",dataProviderClass=InputData.class)
	public void verifyPrices(String Mobile,Double price)
	{
		if(price > 50000)
			System.out.println(Mobile);
	}

}
