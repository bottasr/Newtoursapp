package com.FaceBookLogin;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hwpf.model.SectionDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.myfirstprogram.Ifelseif;

public class ValidateDemoaut {

	public static void main(String[] args) 
	
	{

		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		//<input type="text" size="10" name="userName">
		
		driver.findElementByName("userName").sendKeys("tutorial");
		
		//<input type="password" size="10" name="password">
		
		//driver.findElement(By.className("password")).sendKeys("tutorial"); NOT SUPPOSE TO USE
		
		driver.findElementByName("password").sendKeys("tutorial");
		
		//<input width="58" type="image" border="0" height="17" alt="Sign-In" 
		//src="/images/btn_signin.gif?osCsid=79f3aae522a6894e2b26b616c06d7729" 
		//value="Login" name="login">
		
		driver.findElementByName("login").click();
		
		String Expected_Title = "Find";
		String Actual_Title = driver.getTitle();
		System.out.println(Expected_Title);
		System.out.println(Actual_Title);
				
		driver.close();
		
		
		if (Actual_Title.contains(Expected_Title)) {
			System.out.println("Title Passed and Print the result  : " + Actual_Title);
		} else {

			System.out.println("Title Failed and Print the resule  : " + Expected_Title);
		}
		
		
	}

}
