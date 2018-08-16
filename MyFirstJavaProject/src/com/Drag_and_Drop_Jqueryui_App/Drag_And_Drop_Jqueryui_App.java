package com.Drag_and_Drop_Jqueryui_App;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Jqueryui_App {

	public static void main(String[] args) 
	
	{
	// Here we are testing mouse hover and key board operatons
	// here we are testing Drag and Drop operations
		
	 FirefoxDriver driver = new FirefoxDriver ();
	 driver.manage().window().maximize();
	 
	 driver.get("http://jqueryui.com/droppable/");
	
	 
	 System.out.println(driver.getCurrentUrl());
	 // 
	 //Inspect the demo elemnt and we found that its written in frame, first we need 
	 //to go to frame and then go to element in that frame
	 //<iframe class="demo-frame" src="/resources/demos/droppable/default.html">
	 // iframe class = demo_frame
	 // we need to switch to particular frame of a page
	 // beacuse the elements are created within the frame
	 // to identify the frame 
	 
	driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	
	// now inspect the properties of the element of which you need to "drag"
	//<div id="draggable" class="ui-widget-content ui-draggable 
	//ui-draggable-handle" style="position: relative;">
	 
	WebElement drag = driver.findElement(By.id("draggable"));
	
	//// now inspect the properties of the "drop" element 
	//<div id="droppable" class="ui-widget-header ui-droppable">
	
	WebElement drop = driver.findElement(By.id("droppable"));
	
	
	// Create Actions class. 
	//Import Actions Class from import org.openqa.selenium.interactions.Actions;
	// Actions class is inbuilt class in selenium and we use this 
	// operation to perform mouse and key board related operations
	
	Actions act = new Actions(driver);
	
	// Actions class will go with Build and Perform key word. 
	//Click() wont work with Actions Class
	
	act.dragAndDrop(drag, drop).build().perform();;
	
	System.out.println(driver.getCurrentUrl());
	
	//driver.close();	
		
	}

	
	
}
