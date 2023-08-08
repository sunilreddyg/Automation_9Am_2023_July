package mq.java.methods;

public class RobotA 
{
	//Reusable method
	public void start() 
	{
		System.out.println("Robot is ON");
		
	}
	
	//Reusable method
	public void walk()
	{
		System.out.println("Robot Started walking");
	}
	
	//Reusable Method
	public static void standby() 
	{
		System.out.println("Robot is in StandBy");
	}
	

	public static void main(String[] args) 
	{
		new RobotA().start();
		new RobotA().walk();
		standby();
	}
	
}
