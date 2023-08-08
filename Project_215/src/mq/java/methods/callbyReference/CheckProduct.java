package mq.java.methods.callbyReference;

public class CheckProduct 
{
	//Method parameter using call by reference
	public void GetFirstProduct(Product1 obj)
	{
		obj.getProductPrice("iphone");
	}
	
	//Method parameter using call by reference
	public void GetSecondProduct(Product2 obj)
	{
		obj.getProductPrice("Samsung");
	}
	
	public static void main(String[] args) 
	{
		
		//Passing object as an argument..
		CheckProduct product=new CheckProduct();
		product.GetFirstProduct(new Product1());
		product.GetSecondProduct(new Product2());

	}

	
}
