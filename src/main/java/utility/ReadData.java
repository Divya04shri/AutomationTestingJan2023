package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	static XSSFWorkbook  workbook;
	public static String[][] testdata()
	{
		
	try
	{
	//we need to read excel
	FileInputStream file=new FileInputStream("E:\\DataSheet\\Untitled spreadsheet.xlsx");
	//ms excel file
	 workbook=new XSSFWorkbook(file);
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	XSSFSheet sheet=workbook.getSheet("ContactData");
	int rows=sheet.getLastRowNum();
	System.out.println(rows);
	int column=sheet.getRow(0).getLastCellNum();
	System.out.println(column);
	String data[][]=new String[rows][column];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<column;j++)
		{
			data[i][j]=sheet.getRow(i+1).getCell(j).toString();
		
		}
	}
	return data;
	}
}

