package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewTours_HomePage_LinksTesting {

		public static void main(String[] args) 
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
		
			List<WebElement>links=driver.findElements(By.tagName("a"));
			int linksCount=links.size();
	System.out.println("Total number of links on NewTours HomePage is:"
			              +linksCount);
		
		for(int k=0;k<links.size();k++)
		{
			String linkName=links.get(k).getText();
			System.out.println(k+" "+linkName);
			
			links.get(k).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			// Navigating back to the Home page
			driver.navigate().back();
			
			// when performed click Operation on an index of an Array
			// the page gets refreshed and the information stored in the 
			// Array is going to be lost or cleared off 
			// and so is the reason we need to recreated the Array again
			// to store back all the elements
			links=driver.findElements(By.tagName("a"));
			
		}
		driver.close();

		}

	
}