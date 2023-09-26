package mq.java.Arrays;

public class StaticArray 
{
	
	public static void main(String[] args) 
	{
		
		//Single Dimensional Static Array
		
		String names[]=new String[4];
		names[0]="chrome";
		names[1]="firefox";
		names[2]="safari";
		names[3]="opera";
		
		
		String ch=names[0];
		System.out.println(ch);
		
		
		//Group of integer values
		int num[]=new int[3];
		num[0]=100;
		num[1]=500;
		num[2]=200;
		
		int val=num[2];
		System.out.println(val);
		
		
		//How to Store Different type of value into array
		Object obj[]=new Object[4];
		obj[0]="OnePlus";
		obj[1]=true;
		obj[2]=150000.25;
		obj[3]=2;
		
		
		//System.out.println contains default casting feature
		System.out.println(obj[2]);
		
		//Inorder to Convert object Value to String we should add Casting feature
		String mobile=(String) obj[0];
		System.out.println(mobile);
		
		boolean flag=(boolean) obj[1];
		System.out.println(flag);
	}

}
