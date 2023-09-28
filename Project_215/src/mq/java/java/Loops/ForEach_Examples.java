package mq.java.Loops;

public class ForEach_Examples {

	public static void main(String[] args) 
	{
		
		//Runtime Single dimensional array
		String browsers[]= {"chrome","firefox","edge","safari"};
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		//Reading numeric value using foreach loop
		int num[]= {100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		//Runtime Double dimensional array
		String info[][]= 
			{
					{"OnePlus","64GB"},
					{"Iphone","128GB"},
					{"Vivo","256GB"},
			};
		
		//Reading double dimension values into Single dimensional array using for loop
		for (String[] strings : info) 
		{
			System.out.println(strings[0]+"   "+strings[1]);
		}
		
	}

}
