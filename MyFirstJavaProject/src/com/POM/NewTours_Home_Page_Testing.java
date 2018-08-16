package com.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Home_Page_Testing 

{
// initiate firefox driver as a global variable
	
	FirefoxDriver  driver;
	
	@BeforeTest
	public void setup()
	{
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	}
	
@Test

public void Homepage()

{
// Here we are calling Welcome_Mercury_Tours java class where we have all the home page related elements and its business logics
	

	
	Welcome_Mercury_Tours WMT = PageFactory.initElements(driver, Welcome_Mercury_Tours.class);
// WMT is having driver info and as well as Welcome_Mercury_Tours java class information (which includes all methods written
// in that class
// make sure we have an extension as ".class"
	
	WMT.Signon();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
	WMT.Register();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
	WMT.Support();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	

	WMT.Signin("tutorial", "tutorial");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
	
	//WMT.TourTipsText();
	String str = WMT.TourTipsText.getText();
	
	
	System.out.println(str);
	System.out.println();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
	
	// Trying to get text of Aruba heading block area
/*	
	String strAruba = WMT.Aruba.getText();
	
	System.out.println(strAruba);
	System.out.println();
	
*/	
	
// Getting text info from Destinations tab/title
	
	String dest = WMT.Destinations.getText();
	
	System.out.println(dest);
	System.out.println();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	
// Getting text info for both Specials and DollarAmount
	
String	special =WMT.Specials.getText();
String	amount  =WMT.DollarAmount.getText();

System.out.println(special +" ---- "+ amount);

driver.navigate().back();

// Trying to display Aruba text and Specials info.

String AruSpc=WMT.ArubaSpecial.getText();

System.out.println(AruSpc);
System.out.println();



		    
	
	
	
	
	
}

	
	
	
	
	
}