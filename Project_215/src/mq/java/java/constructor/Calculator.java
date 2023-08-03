package mq.java.constructor;

public class Calculator 
{
	//Global variables
	int a=0;
	int b=0;

	//Constructor
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}

	//Instant method
	public void add()
	{
		System.out.println(a+b);
	}
	
	//Instant method
	public void mul()
	{
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) 
	{
		new Calculator(12, 60).add();
		new Calculator(2, 4).mul();

	}

}
