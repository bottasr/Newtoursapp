package com.FindFaceBookTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class VerifyFaceBookTitle {

	public static void main(String[] args) 
	
	{
		
	// writing test script to Identify title on FaceBook application / WebSite using Firefox Browser
	// Defining FireFox browser
		
	
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("http://Facebook.com");
		
		// invoked firefox browser from the above get matchod.  (get is a method in selenium)
		// get method is navigating url
		// here driver is an Object.
		// all elements from this page refer with object called 'driver'
		
		String ActualTitle	= driver.getTitle();
	
		// ActualTitle is a variable and its DataType is String 
		// we are getting FaceBook title from getTitle method and stroning it in variable called 
		// ActualTitle and its datatype is string
		
		// now we are displaying output.  
		System.out.println(ActualTitle);
		
		// you can see the result in Console
		
		
		// close is a method, we use to close the web browser.
		
		driver.close();
		
			
		
		
	}

}
