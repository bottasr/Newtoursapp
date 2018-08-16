package com.Excel_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Operation {

	public static void main(String[] args) throws IOException 
	
	{
	
	// Here i am doing excel read operation
	// step -1
	// Identify Excel file on your system by selenium script
	// Use FileInputStream
		
		FileInputStream File = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\Selenium\\Book1.xlsx");
		
		// Add throws declaration and add import java.io.FileInputStream
		
	// Identify WorkBook in a file
	// Use XSSFWorkBook
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
	// Identify Particular Sheet in a Workbook (Normally we have more than one sheets in Excel/Work book
	// Specify the Particular sheet
		
	XSSFSheet Sheet = Workbook.getSheet("Sheet1");
	
	
	// Identify Particular Row in a sheet
	// Also Import Row from Apache.pio..... etc...
	
			Row	r=Sheet.getRow(0);
				
	// Identify Particular Cell in a row
	// Also Import Row from Apache.pio..... etc...
			
		Cell	c=r.getCell(0);
		
		
	// Of the Row of the cell to get the data
	// For example, 0th (Zero)th row of 0th (Zero)th Cell data to dispay
	
		String data=c.getStringCellValue();
		
		System.out.println(data);
		
		
		
		
		
		
		


		
		
	}

}
