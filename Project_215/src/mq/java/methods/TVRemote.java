package mq.java.methods;

public class TVRemote 
{
	
	//Reusable method
	public void turnon() 
	{
		System.out.println("turn on");
	}
	
	//Reusable method
	public void turnoff() 
	{
		System.out.println("turn off");
	}
	
	
	//Reusable method
	public void NextChannel()
	{
		System.out.println("NextChannel");
	}
	
	//Reusable method
	public void PreviousChannel()
	{
		System.out.println("PreviousChannel");
	}
	
	//Reusable method
	public void VolumeIncrease() 
	{
		System.out.println("VolumeIncrease");
	}
	
	//Reusable method
	public void DecreaseIncrease() 
	{
		System.out.println("DecreseVolume");
	}
		
	public static void main(String[] args) 
	{
		new TVRemote().turnon();
		new TVRemote().NextChannel();
		new TVRemote().VolumeIncrease();
		new TVRemote().turnoff();
	}
	
}
