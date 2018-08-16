package com.FindFaceBookTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyGoogleTitle {

	public static void main(String[] args)
	
	{
	
		// program to verify Title on th eGoogle home page using 'navigate' method
		
		FirefoxDriver driver = new FirefoxDriver ();
		
		//driver.get("https://google.com");

		driver.navigate().to("https://google.com");
		
		String ActualTitle = driver.getTitle();
		
		System.out.println(ActualTitle);
		
		driver.close();
		
		
	}

}
