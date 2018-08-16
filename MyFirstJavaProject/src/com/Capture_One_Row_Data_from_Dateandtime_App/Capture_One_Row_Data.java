package com.Capture_One_Row_Data_from_Dateandtime_App;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_One_Row_Data {

	public static void main(String[] args) 
	
	{
//Capture One row of data from below app and display on the screen
//https://www.timeanddate.com/worldclock/
		
   FirefoxDriver driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.get("https://www.timeanddate.com/worldclock/");
  
      System.out.println(driver.getCurrentUrl());
   
   // Inspect Element properties using firebug
   // <a href="/worldclock/ghana/accra">Accra</a>
   // here we can use X-Path method 
      // we are taking 1st row 1st column x-path 
   
  // whenever we use get.text - we have to create variable to store the value 
  //of the get.text and the variable datatpe if string
      
      
      String FirstRow =driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a").getText();
      
          
      System.out.println(FirstRow);
   
      // Display 1st Row 2nd column data
      // X-path - .//*[@id='p0']
       
      
      String SecondColumn=driver.findElementByXPath(".//*[@id='p0']").getText();
      
      System.out.println(SecondColumn);
      

      
      
      
		

      
      
      
      
      
      
      
      
      
      
      
		
		
		
	}

}
