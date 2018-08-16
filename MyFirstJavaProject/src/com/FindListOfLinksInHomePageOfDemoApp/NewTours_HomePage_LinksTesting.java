package com.FindListOfLinksInHomePageOfDemoApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksTesting 
{
	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
System.out.println("Total number of links on NewTours HomePage is:"
		              +linksCount);
	
	for(int k=0;k<links.size();k++)
	{
		String linkName=links.get(k).getText();
		System.out.println(k+" "+linkName);
		
		//String LinkAct= links.get(k).click();
		
		links.get(k).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
		// write operation on Excel
		
		// Identify file on your Selenium code
				FileInputStream File = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\src\\ApplicationTestDataFiles\\Demo_Links_InputFile.xlsx");

		// Identify Workbook
				XSSFWorkbook Workbook = new XSSFWorkbook(File);

		// Identify Sheet withn Workbook
				XSSFSheet Sheet = Workbook.getSheet("Sheet1");

				
//	Getting Element not found in the cache - perhaps the page has changed since it was looked up
// Command duration or timeout: 55 milliseconds

					Row r=Sheet.createRow(k);
					
					
					
					Cell c=r.createCell(0);
					
					
					
					String url=driver.getCurrentUrl();
					
					c.setCellValue(url);

/*
		// create row
				Row	r=Sheet.createRow(k);
		
		// create cell
				Cell c=r.createCell(0);
			
				String Linkirl=driver.getCurrentUrl();
				
				System.out.println(Linkirl);
		//inserting value in cell
			c.setCellValue(Linkirl);	
*/			
				
				
				
				
				FileOutputStream File1 = new FileOutputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\src\\com\\FindListOfLinksInHomePageOfDemoApp\\Demo_Links_OutPut_File.xlsx");
				
				Workbook.write(File1);
				
			
	//			driver.navigate().back();
	//			links=driver.findElements(By.tagName("a"));
					
		// when performed click Operation on an index of an Array
		// the page gets refreshed and the information stored in the 
		// Array is going to be lost or cleared off 
		// and so is the reason we need to recreated the Array again
		// to store back all the elements
		//links=driver.findElements(By.tagName("a"));
				
				
		

		
		
	}
	driver.close();

	}

}
