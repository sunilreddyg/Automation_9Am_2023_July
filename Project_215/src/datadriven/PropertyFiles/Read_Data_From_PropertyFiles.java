package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("src\\datadriven\\PropertyFiles\\Input.properties");
		System.out.println("File is Located");
		
		//Create object for properties class
		Properties obj=new Properties();
		//loading input file data to properties
		obj.load(fi);
		
		
		//Get any value using keyname
		String UID=obj.getProperty("username");
		String PWD=obj.getProperty("password");
		
		System.out.println(UID+"   "+PWD);
		
		
		//Calling Reusable method to read data
		String url=Read_propertyFiles.getProperty("HRM.url");
		System.out.println(url);
		
		String chrome=Read_propertyFiles.getProperty("chromedriver");
		String chromepath=Read_propertyFiles.getProperty("chromedriver.path");
		System.setProperty(chrome, chromepath);
		
	}

}
