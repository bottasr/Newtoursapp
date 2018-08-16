package com.HelloSignIn_Amazon_Mouse_Hover_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Validate_HelloSignIn_Amazon_Mouse_Hover_Operation {

	public static void main(String[] args)
	
	{
	
		// we are automation mouse hover / key board operations using 
		// Actions Class in Selenium
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://Amazon.in");
		
		System.out.println(driver.getCurrentUrl());
		
//<span class="nav-line-1">Hello. Sign in</span>		
		
		//WebElement HelloSign=driver.findElementByClassName("nav-line-1");
		//WebElement HelloSign=driver.findElement(By.id("nav-link-yourAccount"));
		WebElement HelloSign=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]/span"));
																													
		// Actions - Class in selenium
		// act - object
		Actions act = new Actions(driver);
		
		act.moveToElement(HelloSign).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='nav_prefetch_yourorders']/span")).click();
		System.out.println(driver.getCurrentUrl());
		
		
//		driver.close();
		
		
	}

}
