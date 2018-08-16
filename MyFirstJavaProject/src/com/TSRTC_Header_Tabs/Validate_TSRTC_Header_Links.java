package com.TSRTC_Header_Tabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Validate_TSRTC_Header_Links {

	public static void main(String[] args) 
	
	{
	
		// Navigate to TSRTC App
		// Identify Header Tab
		// Inspect all Elements which are "LINK" Type
		// Display number of Links
		// Display Link Names
		// Click on Each Link
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in/oprs-web/");
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
		
/*
 
<a class="selectedtabcopy" title="Home" target="_top" href="/oprs-web/guest/home.do?h=1"> Home</a>
<a class="tabcopy" title="Vajra Booking" target="_top" href="/oprs-web/guest/home/miniBus.do?h=1">Vajra Booking</a>
<a class="tabcopy" title="Link Ticket" target="_top" href="/oprs-web/guest/link/home.do?h=1">Link Ticket</a>
<a class="tabcopy" title="My Ticket" target="_top" href="/oprs-web/ticket/waitlist.do">My Ticket</a>
<a class="tabcopy" title="Cancel Tickets" target="_top" href="/oprs-web/guest/ticket/cancel.do">Cancel Tickets</a>
<a class="tabcopy" title="Cancelled Services" target="_top" href="/oprs-web/services/cancel.do">Cancelled Services</a>
<a class="tabcopy" title="About Us" target="_top" href="/oprs-web/home/aboutus.do">About Us</a>
<a class="tabcopy" title="Driver Info" target="_top" href="/oprs-web/services/driverInfo.do">Driver Info</a>
 
 	
 */
		// Identify Header Bar
		// class="menu-wrap"
		
	WebElement	HeaderBar=driver.findElementByClassName("menu-wrap");
			
		
		
		List<WebElement>Links= HeaderBar.findElements(By.tagName("a"));
					
			
// display Total links found on Header
// display Link Names
			 
			 int TotalLinks = Links.size();
			 System.out.println("Total number of Links in TSRTC Header Block is: " + TotalLinks);
			
		for (int i = 0; i< Links.size(); i++) 
			 
			
			{
			// geting link name, stored in LinkName Variable
				String LinkName = Links.get(i).getText();
				System.out.println("Header Block Link names :" +LinkName);
				
					
			

		// Find each link and do "click' operation
		// I am stored all Links in Array called - Links
		
//		Links.get(i).click();
		
		Links.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		

		
		
		// Navigate Back to Home Page
		driver.navigate().back();
		// Implecitly Automation script wait for 10 seconds to load browser
		Sleeper.sleepTightInSeconds(10);  
		// Array value becomes zero when another page opens
		// to get things back in Array, we use below statements
		HeaderBar= driver.findElementByClassName("menu-wrap");
		Links = HeaderBar.findElements(By.tagName("a"));
			
			}	
			
		driver.close();
		
		
		
		
	}

}
