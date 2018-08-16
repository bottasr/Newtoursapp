package com.FaceBookLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateGmailButton_GooglePage {

	public static void main(String[] args)
	
	{
	
	FirefoxDriver driver= new FirefoxDriver ();
	driver.get("http://google.com");

	//<a class="gb_P" href="https://mail.google.com/mail/?tab=wm" 
	//data-pid="23">Gmail</a>
	
	// driver.findElementByClassName("gb_P").click();

	WebElement gmail = driver.findElementByClassName("gb_P");
	gmail.click();
	
	
	driver.close();
	
	
	}

}
