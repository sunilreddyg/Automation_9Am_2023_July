package mq.java.Variable;

public class VariableTypes 
{
	int x=200;   //GlobalVariable [Instant type]
	static String name="Iphone";  //GlobalVariable [static type]
	
	public void method1()
	{
		int a=100;			//Local variable
		System.out.println(a);
		System.out.println(x);
	}
	
	public void method2()
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		VariableTypes obj=new VariableTypes();
		//Calling Instant methods
		obj.method1();
		obj.method2();
		
		//calling Instant variable
		int val=obj.x;
		System.out.println(val);
		
		//Calling static global variable
		String mobile=VariableTypes.name;
		System.out.println(mobile);
		
		/*
		 * Note:--> All variables return value
		 */
	}
	
}
