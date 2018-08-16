package com.NavigateToBackHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate_BackHome_Page {

	public static void main(String[] args) 
	
	{
	
//Req: "Back Home" element in Valiadte Demo app
// Navigation: Launch Demo App -> click on Register -> Click on Vacation -> Click on "Back Home" button

		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("http://newtours.demoaut.com");

//  REGISTER link code
//		<a href="mercuryregister.php">REGISTER</a>
		// in the above code, we are not seeing ID, Name, Class 
		// a stands for Ancor and Href is an atttribute for that Ancor tag.
		// Since we are seeing Ancor tag along with Href, we should consider Element type  
		// Link Type. We will use LinkText 
	// we can use either one of these statements
	//driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElementByLinkText("REGISTER").click();
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println();
	  
// Vacations link code
	    //<a href="mercuryunderconst.php">Vacations</a>
	    
	WebElement vacation = driver.findElementByLinkText("Vacations");
		vacation.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		/*
		  Click on "Back Home" page code
// <img width="118" border="0" height="23" src="/images/forms/home.gif">	
in the above code, we are not seeing ID, Name, Class and <a Href ... > as well
 a stands for Ancor and Href is an atttribute for that Ancor tag.  Its not a Link.
 Since we are seeing <img....>, The path of the Element Type we use as - X-Path
		// its a Absolute x-path, because it</HTML
		// if <//HTML starts with two // (slashes), its called Relative X-path.
 To find X-path, Open FireFox -> go to Google -> find FirePath for firefox browser
 Click and install "FirePath" and restart the browser.
 Open Firefox, click on 'FireBug' button, observe that you will find 
"FirePath" along with "FireBug"
		
*/    
// Open Firebug, navigate to "Back Home" button, click on "Firepath"
// Click on "Inspect" icon and now click on "Back Home" button, 
// Now copy the X-Path 
// html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		
		//driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img").click();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
				
		driver.close();
		


	}

}
