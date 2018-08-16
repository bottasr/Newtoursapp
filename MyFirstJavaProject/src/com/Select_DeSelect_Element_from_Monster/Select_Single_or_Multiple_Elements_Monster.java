package com.Select_DeSelect_Element_from_Monster;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Single_or_Multiple_Elements_Monster {

	public static void main(String[] args) 
	
	{
//Select or Deselect elements from list box.  Usually you can select more than one element from listbox
// In some cases we can able select ONLY one element from list. 
// Ex: Location-Chennai - only one location any person can able to select
// Ex: Industry - Software, Accounting, Banking Service etc... I can select all three or two or more 
// We are going to write Selenium scripts for the above examples.
		
// Web App - http://my.monsterindia.com/sponsered_popup.html

		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//<select class="border_grey1" size="4" style="width:196px;" name="currentloc">
		
		WebElement CurrentLocation=driver.findElementByClassName("border_grey1");

		
		
	// Import Select Class from import org.openqa.selenium.support.ui.Select;

		Select Selection= new Select(CurrentLocation);
		
		
	//use fire bug to inspect properties of vales in list box	
/*  In this example, take example Chenniai location, 
  	VisibleText = "Chennai", ByValue = "3", ByIndex = 
  	
	<option value=""> - Select - </option>
	<option value="1">Ahmedabad</option>
	<option value="2">Bengaluru / Bangalore</option>
	<option value="3">Chennai</option>
	<option value="4">Delhi</option>
	<option value="5">Gurgaon</option>
	<option value="6">Hyderabad / Secunderabad</option>
	<option value="7">Kolkata</option>
	<option value="8">Mumbai</option>	
		
*/ 	
	// Selection Class Object have 3 methods
	//	Selection.selectByIndex(6);
	//	Selection.selectByVisibleText("Chennai"); // Chennai
	//	Selection.selectByValue("4");  // -- 4 -- means Delhi
		
	//	Selection.selectByVisibleText("Bengaluru / Bangalore");	
		

		Selection.selectByIndex(6);
		
// ---- >   ---->
// Write a script to select multiple selections from ListBox - Industry Element

		// Identify Element 'Industry' and find out the properties - 
// <select id="id_industry" multiple="multiple" onchange="loadFA(this,document.POPUNDER.jobCategory,''); displayAllFunction();" size="4" name="industry">
		
			WebElement IndustryList=driver.findElement(By.id("id_industry"));
			
// In above statement, we found out Industry Element, In this element all the list is stored.
// Now Identify the list of elements in Industry Element
// uSING FIREBU i found below info.
/*

<option value="4">Automotive/ Ancillaries</option>
<option value="5">Banking/ Financial Services</option>
<option value="8">Bio Technology & Life Sciences</option>
<option value="74">Chemicals/Petrochemicals</option>
<option value="11">Construction & Engineering</option>
<option value="13">FMCG</option>


*/
			// Array created
			List<WebElement>IndusList=IndustryList.findElements(By.tagName("option"));
				
			int List=IndusList.size();
			System.out.println("Total no. of Industry's present :" + List);
			
			for (int i = 0; i < IndusList.size(); i++) 
			{
				
				
				String Name= IndusList.get(i).getText();
				
				System.out.println(i +"."+ Name);
							
//Now we r creating Select object
				/*

				<option value="4">Automotive/ Ancillaries</option>
				<option value="5">Banking/ Financial Services</option>
				<option value="8">Bio Technology & Life Sciences</option>
				<option value="74">Chemicals/Petrochemicals</option>
				<option value="11">Construction & Engineering</option>
				<option value="13">FMCG</option>


				*/
				
				Select Sel = new Select(IndustryList);
				
				Sel.selectByVisibleText("Construction & Engineering");
				Sel.selectByVisibleText("Chemicals/Petrochemicals");
				Sel.selectByValue("8");
				
				Sel.deselectByValue("8");
				
				
				
				
			}
			
			
			
		
		
		
/*
 				We also have 4 DeSelect methods 
		 
		 		Selection.deselectAll();
				Selection.deselectByIndex(6);
				Selection.deselectByValue("4");
				Selection.deselectByVisibleText("Delhi");
				
				
*/	
		
		
		
		
		
		
	}

}
