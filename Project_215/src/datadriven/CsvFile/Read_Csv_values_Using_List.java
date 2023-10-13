package datadriven.CsvFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class Read_Csv_values_Using_List 
{

	public static void main(String[] args) throws IOException {
	
		//Target File location
		FileReader fr=new FileReader("src\\Datadriven\\CsvFile\\input.csv");
		System.out.println("File located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		List<String[]> list=reader.readAll();
		list.remove(0);
		
		for (String[] Eachrecord : list) 
		{
			System.out.println(Eachrecord[0]+"   "+Eachrecord[1]);
		}
		

	}

}
