package datadriven.CsvFile;


import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;



public class Read_Data_From_CsvFile {

	public static void main(String[] args) throws IOException 
	{
		
		//Target Csv File
		FileReader fr=new FileReader("src\\datadriven\\CsvFile\\input.csv");
		System.out.println("File Located");
		
		//Create object for Csv Reader
		CSVReader reader=new CSVReader(fr);
		
		String rec1[]=reader.readNext();
		System.out.println(rec1[0]+"    "+rec1[1]);
		
		String rec2[]=reader.readNext();
		System.out.println(rec2[0]+"    "+rec2[1]);
		
		
		//Reading all records under csv file
		String record[];
		while((record=reader.readNext())!=null)
		{
			System.out.println(record[0]+"   "+record[1]);
		}
		
		
		
		
		

	}

}
