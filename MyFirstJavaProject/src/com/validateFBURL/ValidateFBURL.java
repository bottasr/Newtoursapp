package com.validateFBURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateFBURL {

	public static void main(String[] args) 
	
	{
	
		FirefoxDriver driver = new FirefoxDriver(); // creating driver object
		driver.get("http://facebook.com");		// Navigating to FF url
		String Actual_URL = driver.getCurrentUrl(); // Storing FF url
		// String Expected_URL
		String Expected_URL = ("http://www.facebook.com/");
		
		System.out.println("This is Actual URL -- : " + Actual_URL); // displaying Actual URL

		
		// adding extra steps to program to compare actual and expected 
		
		
		
		if (Actual_URL.equals(Expected_URL)) 
		
		{
			System.out.println("URL Test Case Passed  --- : " + Actual_URL);
			
		} else {
			System.out.println("Test Case Failed --- : " + Expected_URL);
		}
		
		
		
		driver.close(); // Closing the browser
		
		
	}

}


