package com.FindFaceBookTitle;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareTextUsingContainsJavaStatement {

	public static void main(String[] args) 
	
	{

		
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("https://facebook.com"); // Invoked FireFox Browser
		
		String ActualTitle = driver.getTitle(); 
		// Getting Title of facebook and stroning in variable called ActualTitle
		
		// System.out.println(ActualTitle);
		//displaying ActualTitle on Console -- Facebook – log in or sign up
		
		System.out.println("Actual Title is :" + ActualTitle);
		
		String ExpectedTitle = "Facebook";
		
		
		// Defined Expected Result in ExpectedTitle variable
		// contains is a java method
	
		
		if (ActualTitle.contains(ExpectedTitle))
	{
		System.out.println("Test Case PASSED");
	}	
	else 
	{
		System.out.println("Test Case Failed");

	}
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
	}

}
