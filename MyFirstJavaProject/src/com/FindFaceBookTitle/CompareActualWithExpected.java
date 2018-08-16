package com.FindFaceBookTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareActualWithExpected {

	public static void main(String[] args) 
	
	
	{
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https:/Google.com");
	 
	 String ActualTitle = driver.getTitle();
	 String ExpectedTitle = "Google";
	
	 // To display expected Title and Actual Titles on Console
	 // we coded below statements
	 
	 
	 System.out.println("ActualTitle is:"  +  ActualTitle);
	 System.out.println("ExpectedTitle is:"  +  ExpectedTitle);

	 
	 
	 // Here Java is coming in Selenium Test Script

	 if (ActualTitle.equals(ExpectedTitle))
	 
	 { System.out.println("Title Matched -- PASS");
		
	} else
	{
		System.out.println("Title Not Matched -- FAIL");
	}

	 
  driver.close();
	 
		
		
		
		
		
		
	}

}
