package datadriven.Notepad_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_Using_Scanner 
{

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("src\\Datadriven\\Notepad_File\\input.txt");
		Scanner sc=new Scanner(fr);
		System.out.println("File located");
		
		
	
		String Header=sc.next();
		String Hline[]=Header.split(",");
		System.out.println(Hline[0]+"  "+Hline[1]);
		
		
		
		
		while(sc.hasNext())
		{
			String Line=sc.next();
			String Rline[]=Line.split(",");
			System.out.println(Rline[0]+"  "+Rline[1]);
		}
		
		
		
		
		
		//Reading data from Console
		//Create object for Scanner
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your username");
		String UID=sc1.nextLine();
		System.out.println(UID);
		
		System.out.println("Enter Start Number");
		int Snum=sc1.nextInt();
		System.out.println("Enter End Number");
		int Enum=sc1.nextInt();
		
		for (int i = Snum; i <= Enum; i++) 
		{
			System.out.println(i);
		}

	}

}
