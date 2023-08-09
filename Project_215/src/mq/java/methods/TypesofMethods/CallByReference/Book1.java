package mq.java.methods.TypesofMethods.CallByReference;

public class Book1 
{
	//Global variables
	String name="Java";
	double price=1500.00;
	
	public void printDetails()
	{
		System.out.println("BookName is ---> "+name);
		System.out.print("Book Price is ---> "+price);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	

}
