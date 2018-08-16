package com.Capturing_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Capture_ScreenShot_Bing_HomePage {

	public static void main(String[] args) throws IOException 
	
	{
	
 //Capture the ScreenShot of www.Bing.com

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://bing.com");
		
//		System.out.println(driver.getCurrentUrl());

		// loading Bing web site 
		// its a selenium class
		Sleeper.sleepTight(20);
		
		// File is type of variable, thats the we r storing in File Type
		//File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File SrcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		// Create new folder under the Main folder
		// copy the folder path where new file and add one more \ (Backword slash) and 
		// add bing.png as a new screenshot name to create
		
		//FileUtils.copyFile(srcFile, new File("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\ScreenShot\\Bing.png"));
		
		// Add Throws Declaration and IO Exception
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\ScreenShot\\Bing3.png"));
		
	
		
		driver.close();
		
		
		
	}

}
