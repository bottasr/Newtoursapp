package com.Excel_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Display_All_Rows_AllCell_Data_fromExcel {

	public static void main(String[] args) throws IOException
	
	{
		
		// Display all rows and columns data from Excel to Selenium Console
		
		// 6 steps to remember
		
/*		
Step 1 - Identify the Excel file using selenium script
Step -2 Identify the workbook
step 3 - Identify the sheet

4. Identify the row
5. Identify the cell form the above finding row
6. Featch the data from Identified cell to console

Note that we will have to paste the excel sheet (Currently working) sheet in same Package where selenium script 
running script stored

7.Identify  total number of rows for particular sheet
8. identify no. cells for a particular row.


*/
	
//step1
		FileInputStream File = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\Selenium\\Display_Total_Rows_Cells.xlsx");
		
//step2
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		
//Step3		
	XSSFSheet Sheet = Workbook.getSheet("Display_All_Rows_Columns");


// Sheet4 Feaching the   Total Row count  ,,  Its a method
			int LastRowCount=Sheet.getLastRowNum();
			
			
		for (int i = 0; i < LastRowCount; i++) 
		
		{
		Row r	=Sheet.getRow(i);
		// it goes to every row and find the No.of cells 
	 
		int CellCount=r.getLastCellNum();// Identify the cell count of the Row
			for (int j = 0; j < CellCount; j++) {
				
			Cell	c=r.getCell(j);
				
			String data=c.getStringCellValue();
			
			System.out.print(data + " ");
			
			
				
				
			}
			System.out.println();
		}
			
			
	
	

		
		
		
		
		
	}

}
