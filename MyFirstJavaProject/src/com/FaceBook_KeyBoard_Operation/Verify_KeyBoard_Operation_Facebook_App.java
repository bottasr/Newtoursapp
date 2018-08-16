package com.FaceBook_KeyBoard_Operation;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Verify_KeyBoard_Operation_Facebook_App {

	public static void main(String[] args) 
	
	{
	// we are testing Key Board operations in Selenium script 
	// using Facebook.com App
		
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("http://facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		
		// To maximize the browser screen (Full page)
		driver.manage().window().maximize();
	
		// Open Facebook app and inspect Login tab propertis
		//<input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		// Here ID is the property of the element that we can take
		
		driver.findElement(By.id("email")).sendKeys("Hellooo");
		
		// Create Actions class since we are doing mouse / Key Board operations
		// Import Actions class as well
		
		Actions act = new Actions(driver);
		
		// choose from WebElement options
		 act.sendKeys(Keys.TAB).build().perform();
		
		//now the cursor is in password field
		// Enter passord in password field
		
		act.sendKeys("Hiiiiiii").build().perform();
		
		// perform ENTER key operation on "LOGIN" button using Key Board operation
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	
	
	}

}
