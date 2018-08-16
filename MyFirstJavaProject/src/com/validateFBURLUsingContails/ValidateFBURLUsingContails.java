package com.validateFBURLUsingContails;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.myfirstprogram.Ifelseif;

public class ValidateFBURLUsingContails {

	public static void main(String[] args) 
	
	
	{
		
		FirefoxDriver driver = new FirefoxDriver(); // creating driver object
		driver.get("http://facebook.com");		// Navigating to FF url
		String Actual_URL = driver.getCurrentUrl(); // Storing FF url
		// String Expected_URL
		String Expected_URL = ("Expected URL : facebook.com");
System.out.println(Expected_URL);
		
		System.out.println("This is Actual URL -- : " + Actual_URL); // displaying Actual URL

	if (Actual_URL.contains(Expected_URL)) {
		System.out.println("Test Case Passed --- :  " + Actual_URL);
	} else {
System.out.println("Test Case Fail --- :  " + Expected_URL);
	}
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
