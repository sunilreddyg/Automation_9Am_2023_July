package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws IOException {
		
		//Target file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("multiplerows");
		
		//Read row count in how many rows data exist
		int StartNum=sht.getFirstRowNum();   //Give row Index number where data started
		int EndNum=sht.getLastRowNum();      //Give row index numebr where data end
		
		for (int i = StartNum+1; i <= EndNum; i++) 
		{
			 String UID=sht.getRow(i).getCell(0).getStringCellValue();
			 String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(UID+"   "+PWD);
		}	

	}

}
