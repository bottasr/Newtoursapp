package com.FaceBookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateFaceBookLogin {

	public static void main(String[] args) 
	
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://Facebook.com"); 
		
		//<input type="email" data-testid="royal_email" tabindex="1" 
		//id="email" name="email" class="inputtext">
		driver.findElement(By.id("email")).sendKeys("Hello..");
		
		//<input type="password" data-testid="royal_pass" 
		//tabindex="2" id="pass" name="pass" class="inputtext">
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		//<label id="loginbutton" class="uiButton uiButtonConfirm" for="u_0_2">
		//<input id="u_0_2" type="submit" data-testid="" tabindex="4" aria-label="Log In" value="Log In">
		
		
	
		


	}

}
