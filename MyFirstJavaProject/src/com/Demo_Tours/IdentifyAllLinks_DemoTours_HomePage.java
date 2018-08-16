package com.Demo_Tours;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Imported Manually by looking into google
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyAllLinks_DemoTours_HomePage {

	public static void main(String[] args) 
	
	{
	
		//First Identify all links on Newtours.demoaut.com
		//Print the Title Names of links
		//Print the list of links
		//
		
		FirefoxDriver driver = new FirefoxDriver ();
	driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		// Identify Link Type Elements 
		// Navigate to Web App. click on Firebug and inspect any Link Element - and Copy the source code
// <a href="mercurysignon.php?osCsid=7aba298b4f0e51a06491fe9f6d404054">SIGN-ON</a>
		// We identify "Link" based on the tag written with "<a href= ......
		
		List<WebElement>Links=driver.findElementsByTagName("a");
		
		// Links is a Array, It pulled all Links and kept it in a Array called "Links"
		
		// How to display the NUMBER of Links found by script on the screen
		// How to display the Link NAMES found by script on the screen
		// 
		
		int LinkCount = Links.size();
		System.out.println("Total Links Found in Demo Home Page : " + LinkCount);
		
		
		for (int i = 0; i < Links.size(); i++) {
		//write some statements here
			
	// to get Link Names, use below statement
	// I is a Index and it stores all values.
			
			
	String LinkName = Links.get(i).getText();
	
	//System.out.println(i + "\n"+  LinkName);
	// "\n" - LinkName moving to 2nd line i.e breaking line
	System.out.println(i + ". "+  LinkName);

	// Clicking on each link, all links are stored in Array called Links,
	// we are using index to start from '0' (Zero -  index starts with zero), to max no. of 
	//links found on Demo home page
	//
	
	Links.get(i).click();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	
	
	
	//We are getting error message
	//Element not found in the cache - perhaps the page has changed since it was looked up
	//Command duration or timeout: 1.38 seconds
	
	// When the page goes to 1st link (Click), App goes to 1st page (In this case its a Home Page.
	//The Array List becomes Zero. Thats the reason, we declare Array again.
	
	Links=driver.findElementsByTagName("a");
	
	
	
	
	
		}
		

		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
