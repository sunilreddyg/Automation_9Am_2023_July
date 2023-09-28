package mq.java.Loops;

public class ForLoop_SamplePrograms {

	public static void main(String[] args) 
	{
		
		//Conduct Sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is :--> "+sum);
		
		
		//Reverse a string
		String name="WebDriver";
		
		//Converting Total String int character array
		char ch[]=name.toCharArray();
		System.out.println(ch.length);
		
		String str="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//Using String Builder reverse a string
		StringBuilder builder=new StringBuilder("linus");
		String rname=builder.reverse().toString();
		System.out.println(rname);
		
		//How to Find given number is prime number
		//How to Find given number is even number
		
		
		//Reading array value using for loop
		String browsers[]= {"chrome","firefox","edge","safari"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String browsername=browsers[i];
			if(browsername.equals("firefox"))
			{
				System.out.println(browsername);
				break;  //Jump Out of For loop
			}
		}
		
	}

}
