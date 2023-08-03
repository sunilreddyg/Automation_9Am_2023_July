package mq.java.methods.staticmethods;

public class Run_MouseMethods 
{

	public static void main(String[] args) 
	{
		new Mouse().active();
		
		//Calling Static methods From different class
		//We Must Add Class Name Before methodname
		Mouse.LeftClick();
		Mouse.RightClick();
		Mouse.MiddleClick();

	}

}
