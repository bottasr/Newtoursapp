package com.DataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NewTours_NewUserRegistartion_TestData {


FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=0)
	public void register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Test(priority=1)
	public void userRegistration() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\src\\ApplicationTestDataFiles\\UserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
		Row r=sheet.getRow(i);
		
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		// Cannot get a STRING value from a NUMERIC cell -- Error
		
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		
		// <input id="userName"
		
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String postalCode=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		
		// <input id="email" 
		
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName=r.getCell(9).getStringCellValue();
		
		String actual_registedText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(actual_registedText.contains(expected_UserName))
		{
			System.out.println("User Registed Successfully");
			r.createCell(12).setCellValue("User Registed Successfully");
		}
		else
		{
			System.out.println("User Registration Failed");
			r.createCell(12).setCellValue("User Registration Failed");
		}
		
		 	 
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\src\\ApplicationTestResultFiles\\NewUserRegistrationResultFile.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
		
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
