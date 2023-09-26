package mq.java.Loops;

import java.util.Scanner;

public class ForLoop_Examples {

	public static void main(String[] args) {
		
		//Print Numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print numbers from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print Number Using Scanner Program
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Start  number:--> ");
		int StartNum=sc.nextInt();
		
		System.out.println("Enter End Number:--->");
		int endnum=sc.nextInt();
	
		for (int i =StartNum; i <= endnum; i++) 
		{
			System.out.println(i);
		}
		

	}

}
