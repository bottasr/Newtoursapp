package com.Login_Using_Excel_Read_Write_Demo_Tours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.myfirstprogram.ForLoop;

public class Demo_Tours_Login_Xecel_Read_Write 




{
// App name - http://www.newtours.demoaut.com
	
	FirefoxDriver driver;
	
	@BeforeTest
	
	public void Setup()
	{
		
	driver = new FirefoxDriver();
	driver.get("http://www.newtours.demoaut.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
		
	}
	
	
	@Test
	public void Login() throws IOException
	
	{
		
	FileInputStream file = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\src\\com\\Login_Using_Excel_Read_Write_Demo_Tours\\Display_Country_List.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet Sheet = workbook.getSheet("Sheet1");

// now script has to read the data from excel sheet and insert into login filed of web application
// and the get the data from password field and insert into password filed of web application
	
// for login field, get the data from 1st row of 1st cell and pass it to login field (app)
// for password field, get the data from 1st row of 2nd cell and pass it to password field (app)
// like wise for all userid/password combinations, we have to repeat the test

// 1st we need to get last row count from excel sheet
	
		int LastRow =Sheet.getLastRowNum();
		
		for (int i=1; i<LastRow; i++)

		{

//<input type="text" size="10" name="userName">

//<input type="password" size="10" name="password">
	
			
// get the row data 
			
	Row r = Sheet.getRow(i);
// enter login information into login field of web app.
	
	driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
			
// 	// enter password information into password field of web app.
	
	driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
	
	// observe that getcell is 0 for login and 1 for password, index starts with 0
	
//<input width="58" type="image" border="0" height="17" alt="Sign-In" src="/images/btn_signin.gif?osCsid=b0afff45b8485c6a05809085a1757ed7"
//value="Login" name="login">
	
	driver.findElement(By.name("login")).click();
			
// validation part
	String Expected_Title = "Find";
	String Actual_Title = driver.getTitle();
	
	if (Actual_Title.contains(Expected_Title)) {
		System.out.println("Test Case Passed" + Actual_Title);
// we see the above print in console
// to write the result in excel sheet, need to create a row
r.createCell(2).setCellValue("Title Matched --- PASS");	
		
	} else {
		System.out.println("Test Case Failed" + Expected_Title);
		// we see the above print in console
		// to write the result in excel sheet, need to create a row


r.createCell(2).setCellValue("Title not matched - Fail");	
		
FileOutputStream File1 = new FileOutputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\src\\com\\Login_Using_Excel_Read_Write_Demo_Tours\\Display_Country_List.xlsx");
workbook.write(File1);

//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


driver.navigate().back();


}
}

}	
	@AfterTest
	public void Teardown()
	{
		driver.close();
				
	}
	
}
