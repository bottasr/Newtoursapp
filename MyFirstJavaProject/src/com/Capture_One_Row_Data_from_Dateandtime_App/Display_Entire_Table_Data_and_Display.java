package com.Capture_One_Row_Data_from_Dateandtime_App;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Display_Entire_Table_Data_and_Display {

	public static void main(String[] args) 
	
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");
		
//Capture the few rows data
// html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]
//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[2]/td[1]
//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[1]
// Total There are 36 rows in eitire table
// html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[8]
// Total There are 6 columns in eitire table
// when u observe above x-paths, we noticed that tr and td is changing and all other info
		//is unique

// We can code this in two ways - 

	//String  Part1="html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[";
	//String	Part2	="]/td[1]";
	
	
	// total 36 rows, and i am displaying all 36 rows, 1st column data
	for (int i = 1; i <=36; i++)
	
	{
	//String Display = driver.findElementByXPath(Part1 + i +  Part2).getText();
	
String Display= driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+ i +"]/td[1]").getText();		
		
		
	//System.out.println(i + "" + Display);
	System.out.println(i + " " +Display);

System.out.println();

		
		
	}
			

	
		
	}

}
