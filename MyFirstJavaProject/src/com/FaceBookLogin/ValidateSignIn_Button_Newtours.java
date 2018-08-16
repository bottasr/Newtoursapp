package com.FaceBookLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateSignIn_Button_Newtours {

	public static void main(String[] args) 
	
	{
	
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("http://newtours.demoaut.com");
		
//<a href="mercurysignon.php?osCsid=1e8e04c4fb7a8dde74786b82bc07a927">SIGN-ON</a>
		
//<a href="mercuryregister.php?osCsid=1e8e04c4fb7a8dde74786b82bc07a927">REGISTER</a>

		driver.findElementByLinkText("REGISTER").click();
		
		//WebElement register = driver.findElementByLinkText("REGISTER");
		//		register.click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
			
		
		
		
	}

}
