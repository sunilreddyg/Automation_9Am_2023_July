package framework.testng.dataprovider;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_to_DP 
{
	static String Filepath="D:\\24th_July_2023_9Am\\Project_215\\TestData\\DP.xlsx";
	static String sheetname="Sheet2";
	static XSSFWorkbook book;
	static XSSFSheet sht;
	
	@DataProvider
	public static String[][] GetData() throws Exception
	{
		FileInputStream fi=new FileInputStream(Filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		
		int Rcount=sht.getLastRowNum();
		int CellCount=sht.getRow(0).getLastCellNum();
		
		String data[][]=new String[Rcount+1][CellCount];
		for (int i = 0; i <= Rcount; i++) 
		{
			for (int j = 0; j < CellCount; j++) 
			{
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		return data;
		
	}
	
	
	@Test(dataProvider="GetData",enabled=false)
	public void GetUserData(String Name,String Degree,String email)
	{
		
	}
	
	@Test(dataProvider="GetData")
	public void Getconfig(String browser,String url)
	{
		
	}

}
