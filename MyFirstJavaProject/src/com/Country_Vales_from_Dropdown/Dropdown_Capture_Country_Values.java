package com.Country_Vales_from_Dropdown;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Capture_Country_Values {

	public static void main(String[] args) throws InterruptedException 
	
	{
		//App Name: http://newtours.demoaut.com
		// http://newtours.demoaut.com/mercuryregister.php  
		//Capture Country Values from DROPDOWN box.
		// Open App -> Click on Registration tab -> Goto Element "Country" dropdown box and 
		// findout number of Countries in 'Country' dropdown box
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(10000); 
		//Explict Wait time - Java Sleep time - written in Milli Seconds - its 10 sec time
		//driver.getCurrentUrl();

		
// find 'Registration' link properties and use Click option
//<a href="mercuryregister.php">REGISTER</a> 

		driver.findElementByLinkText("REGISTER").click();
//		System.out.println(driver.getCurrentUrl());

		
// Idetify Country dropdown box and fetch all list
// <select size="1" name="country">

		WebElement Country=driver.findElementByName("country");
// Capturing All the names in Country Names for Country Element
				List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
			
			
				System.out.println(CountryNames.size());
		
	for (int i = 0; i < CountryNames.size(); i++) 
	
	{
		
		String CountryList = CountryNames.get(i).getText();
		
		System.out.println(i +" "+ CountryList);
		
	}
				
			
	driver.close();
		
		

	}


}
