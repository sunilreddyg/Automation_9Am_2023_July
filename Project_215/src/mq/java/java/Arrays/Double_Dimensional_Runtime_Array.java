package mq.java.Arrays;

public class Double_Dimensional_Runtime_Array {

	public static void main(String[] args) 
	{
		
		//Declaration of runtime double dimensional array..
		String info[][]= 
			{
					{"OnePlus","64GB"},
					{"Iphone","128GB"},
					{"Vivo","256GB"},
			};
		
		String Mobile=info[1][0];
		System.out.println(Mobile);
		
		
		//Printing all mobile name using array
		for (int i = 0; i < info.length; i++) 
		{
			System.out.println(info[i][0]);
		}
		
		
		
		
		
		
		//Storing differnet data type value into Object Array
		Object Products[][]=
			{
				new Object[] {"Iphone",true},
				new Object[] {"Samung",false},
			};
		
		//Print statemetn by default cast object to Datatype
		System.out.println(Products[0][0]);
		
		//Casting Object value to string datatype
		String FirstProduct=(String) Products[0][0];
		System.out.println(FirstProduct);
		

	}

}
