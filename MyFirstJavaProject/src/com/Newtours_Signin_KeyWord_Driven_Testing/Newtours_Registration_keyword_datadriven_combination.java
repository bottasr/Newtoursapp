package com.Newtours_Signin_KeyWord_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_Registration_keyword_datadriven_combination {
	
//FirefoxDriver driver;
ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivasa\\Downloads\\ChromeDriverforSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		 driver = new FirefoxDriver();
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
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\Srinivasa\\Desktop\\SeleniumProject\\MyFirstJavaProject\\WebElement.Properties");
		Properties pr = new Properties();
		pr.load(file2);
	//using clear method
		driver.findElement(By.name(pr.getProperty("FirstName"))).clear();
		driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
	//using clear method
		driver.findElement(By.name(pr.getProperty("LastName"))).clear();
		driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
		
		// Cannot get a STRING value from a NUMERIC cell -- Error
		
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phoneNumber=Long.toString(x);
		
		driver.findElement(By.name(pr.getProperty("PhoneNumber"))).clear();
		driver.findElement(By.name(pr.getProperty("PhoneNumber"))).sendKeys(phoneNumber);
		
		// <input id="userName"
		driver.findElement(By.id(pr.getProperty("Email"))).clear();
		driver.findElement(By.id(pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name(pr.getProperty("Address1"))).clear();
		driver.findElement(By.name(pr.getProperty("Address1"))).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name(pr.getProperty("City"))).clear();
		driver.findElement(By.name(pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
	
		//driver.findElement(By.name(pr.getProperty("State"))).clear();
		driver.findElement(By.name(pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String postalCode=Long.toString(y);
		
		driver.findElement(By.name(pr.getProperty("PostalCode"))).clear();
		driver.findElement(By.name(pr.getProperty("PostalCode"))).sendKeys(postalCode);
		//driver.findElement(By.name(pr.getProperty("Country"))).clear();
		driver.findElement(By.name(pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
		
		// <input id="email" 
		
		driver.findElement(By.id(pr.getProperty("UserName"))).clear();
		driver.findElement(By.id(pr.getProperty("UserName"))).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name(pr.getProperty("Password"))).clear();
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).clear();
		driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name(pr.getProperty("Register"))).click();
		
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
