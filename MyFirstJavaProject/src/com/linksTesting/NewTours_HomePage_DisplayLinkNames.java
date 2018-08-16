package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_DisplayLinkNames {

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
	}
driver.close();
		
	}

}
