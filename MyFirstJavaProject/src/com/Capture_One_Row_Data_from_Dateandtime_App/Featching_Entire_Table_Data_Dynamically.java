package com.Capture_One_Row_Data_from_Dateandtime_App;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Featching_Entire_Table_Data_Dynamically {

	public static void main(String[] args) 
	
	{

// Retrieve entire tabele data (all rows and columns DYNAMIC data)
// and display using selenium script
// App name: https://www.timeanddate.com/worldclock/
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");
		System.out.println(driver.getCurrentUrl());
		

// Since we are featching entire table data, inspect complete table information
// and take X-path of it.
//X-Path of the table - html/body/div[1]/div[9]/section[2]/div[1]/table

	WebElement Table=driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table");
				
// since its a dynamic table data, we will have use Arrays
// Row is represented by tr 
// Column is represented by td
// Lets find how many tr's (Rows) are there in this table
// How to identify the Row? - 
// Take one Row properties and find tr info.
// then Identify Column properties and find td info.
		
		List<WebElement>Rows = Table.findElements(By.tagName("tr"));
		
		
		for (int i = 0; i < Rows.size(); i++) 
		
		{
//Going to every tr and identifying all 'TD's in it.
			
	List<WebElement>cols=Rows.get(i).findElements(By.tagName("td"));
			
	// Getting data of all columns of the current Row
	
	for (int j = 0; j < cols.size(); j++) 
	
	{
		String	data=cols.get(j).getText();
		
	//System.out.print(data);  try this and see the result
	System.out.print(data +" ");
	
	// here observe that i removed "ln" from print command
	// It will write 1st Row data in same line
	}
		System.out.println();
		// After completing 2nd 'for' loop (i.e printing entire 1st Row data,and  going back to
		//1st 'for' loop, we are using 'println' to give break to 1st row data.
	
			
		
				
				
			
		}
		
		
		


	
	}

}
