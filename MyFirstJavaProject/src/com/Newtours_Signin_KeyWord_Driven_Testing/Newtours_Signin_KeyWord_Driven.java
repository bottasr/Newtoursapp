package com.Newtours_Signin_KeyWord_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Newtours_Signin_KeyWord_Driven {

	
	FirefoxDriver driver;
	String url = "http://http://newtours.demoaut.com/";
	
	@BeforeTest
	public void Setup()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void  Login() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\WebElement.Properties");
		
// Java class = Properties
		Properties pr = new Properties();
		pr.load(file);
	
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();

	// "Flight Finder" text taken from confirmation page of user signin (after successful login)

		String Expected_Result = "Flight Finder";
//		String Actual_Result = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font"));
	String	Actual_Result = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font").getText();
// why i am getting it as string 
	//
	//
	//
		
		if (Actual_Result.contains(Expected_Result)) 
		{
			System.out.println("Login Successful --- PASS");
		} else {
			System.out.println("Login Failed ---- FAIL");
		}
	
		
	}	

@AfterTest
public void teardown()
{
	driver.close();
}
		

}
