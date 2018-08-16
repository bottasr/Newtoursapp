package com.NavigateToBackHomepage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindList_of_Links_In_DemoApp_HomePage {

	public static void main(String[] args)
		
	{
	
/* Here we are validating No.of Links on Home Page of http://newtours.demoaut.com app.
 we can also say: Find Elements of Type - LINKS on Home page of http://newtours.demoaut.com App.
 To find element type 'Link', the identification part is - <a Href ..... >
 <a href="mercurysignon.php">SIGN-ON</a>
 <a href="mercuryregister.php">REGISTER</a>
 <a href="mercuryunderconst.php">SUPPORT</a>
 Here 'a' Tag Name also - Ancor and Href is an Attribute.
 When you see a and Href - Its automatically element type is 'Link' or url
 

*/

		FirefoxDriver driver = new FirefoxDriver ();
		
		driver.get("http://newtours.demoaut.com");
		
		System.out.println(driver.getCurrentUrl());
		
		
	List<WebElement>Links =driver.findElements(By.tagName("a"));
	

	
/*	
	
	 since we are writing code to find multiple links, we are using selenium method called findElements
	 If it is one link, we can declare directly in code.
	 we are declaring 'Links' as Array, because we dont know how many Links are in Demo home page App
NOTE: List<WebElement> is a syntax for FIndElements(By.tagName()
	 observe that there are one error, to remove errors in code,please follow below steps
	 Import Java.util
	 Here List is a Java object and should be imported from Java.util
	 WebElement is selenium Element and should import from selenium
Note: from this we are storing Home page links in Array - called = Links

		
*/		
	// we are keeping the no. of links that found using above array 
	// keeping in LinksCount variable
	
	
	int Linkscount = Links.size();
	System.out.println("Total Number of Links in Home Page " + Linkscount);
	
	for (int i = 0; i < Links.size(); i++) 
	{
	
		//System.out.println(i);

	// declaring Variable LinkName and 
		// we are using above Variable to get LinkName's and we dont know how many links
		//we are using java statements here
		//String LinkName = Links.get(i).getText();
		 String LinkName = Links.get(i).getText();
		System.out.println(i +"    " + LinkName);
	
	
	}
	

	
	
	
	
	
	driver.close();
		
		
	}

}
