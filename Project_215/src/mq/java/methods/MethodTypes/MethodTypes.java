package mq.java.methods.MethodTypes;

public class MethodTypes 
{
	//Void type method
	public void method1()
	{
		String name="WebDriver";
	}
	
	
	/*
	 * => other than void all method types return value
	 * => For other method types we should write return keyword
	 * => return keyword should be writen at end of the method
	 * => Return value should match with method type
	 * => Finally value return to the methodname
	 * 
	 * 
	 */
	
	//String return method
	public String method2()
	{
		String name="Selenium";
		return name;
	}
	
	//integer return method
	public int method3()
	{
		return 100;
	}
	
	//Add method
	public int add(int x, int y)
	{
		return x+y;
	}
	
	//boolean return method
	public boolean method4()
	{
		return true;
	}
	
	//double return method
	public double method5()
	{
		return 100;
	}

	
	//double return method
	public char method6()
	{
		return 'A';
	}

	public static void main(String[] args) 
	{
		MethodTypes obj=new MethodTypes();

		//Calling void method
		obj.method1();
		//Calling String return method
		String toolname=obj.method2();
		System.out.println(toolname);
		
		//Calling Integer return method
		int val=obj.method3();
		System.out.println(val+100);
		
		//Calling integer return method
		int total=obj.add(10, 30);
		System.out.println(total);
		
		//calling boolean return method
		boolean flag=obj.method4();
		System.out.println(flag);
		
		//Calling double return method
		double price=obj.method5();
		System.out.println(price);
		
	}

}
