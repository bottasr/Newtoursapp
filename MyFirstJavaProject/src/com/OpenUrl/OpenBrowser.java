package com.OpenUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.WinNT.LOGICAL_PROCESSOR_RELATIONSHIP;

public class OpenBrowser {

	public static void main(String[] args) 
	
	{
	
//	FirefoxDriver Vasu = new FirefoxDriver();
	//Vasu.get("http://google.com");

//	Vasu.navigate().to("www.hotmail.com");
		
	FirefoxDriver Hello = new FirefoxDriver ();
	
	//Hello.get("http://yahoo.com");
	
	//Hello.navigate().to("http://Mail.Google.com");
	Hello.navigate().to("http://hotmail.com");
	

	
	}

}
