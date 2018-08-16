package com.NavigateToBackHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Amazon_homepage_links {

	public static void main(String[] args) {
		
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://amazon.in");
			System.out.println(driver.getTitle());
			System.err.println(driver.getCurrentUrl());

// find all element type = Link
// How to find - we dont know how many liks are there

// find for one link
// <a class="nav-a" tabindex="22" href="/gp/goldbox/ref=nav_cs_gb">Today's Deals</a>
			
	WebElement Linkname =driver.findElementByLinkText("Today's Deals");
	
	// System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	
	//System.out.println(Linkname);
			
		//driver.findElementsByTagName("a");
			
	//=driver.getCurrentUrl();
	
	
	
			
			
			System.out.println();
			
			
			
			
		
			
		
		driver.close();
		
		
	}

}
