
package com.DataBase_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class User_Registration_Using_Data_Base {

// Database testing
// Taking test data from database and insert same data in newtours.demoaut.com registration page
// Result
// New user should be created successfully
/*
here we used mysql is a database 
database name = test
table name = register
when you install mysql on your computer, while installing you should note port number: 
user name: and password

we need all above details to connect database from selenium

NOTE: IF IT'S ORACLE OR SQL, WE WILL NEED PORT NUMBER OF IP ADDRESS OF YOUR MACHINE, 
AND USER NAME AND PASSWORD

THERE ARE 5 STEPS USED BY THE JDBC 
1. register the driver class
2. create connection
3. create statement
4. execute SQL query
5. close jdbc connection

requirement to connect data from selenium

step 1:
install database (either sql or oracle or mysql)
note down port number, user name and password

step 2


create database
create table
insert test data into table

step 3
install mysql .jar files and them configure .jar files with your current project
same with oracle and sql server 
note : download related database jar files and configure them with your current selenium project


*/
	
	FirefoxDriver driver;

// download Annotations	
	@BeforeTest
	
	public void ApplicationLaunch()
	{
		driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
	}
	

// download Annotations	
	@Test(priority = 0)
	
	public  void Register()
	{
//<a href="mercuryregister.php?osCsid=096e86ecd826f4a5c430f102eb633dc7">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
				
	}
	
@Test(priority=1)
	public void UserRegistration() throws Throwable, IllegalAccessException, ClassNotFoundException
	{
	
	Sleeper.sleepTight(10);
	// connection is a java class
	
	Connection conn = null;
	
	String url = "jdbc:mysql://localhost:3306/";
	
// in the above statement, mysql - referes to mysql database and 3306 refers to srinivas sir PC
	// port number
	// in my case, find the port number and update in above statement
	
String DBName = "test";
// in the above statement, test is a database name created in srinivas sir system
// in my case, i need to update with the name of the database

String DBDriver = "com.mysql.jdbc.Driver";
// connecting to DB dynamically
// i need to update mysql with SQl or Oracle, based on what i have loaded in my PC

String UserName = "root";
//i need to update with my Database user name

String Password = "srini.qatraining@gmail.com";
//i need to update with my db password

Class.forName(DBDriver).newInstance();
// new instance is creating to a particular database connection

conn = DriverManager.getConnection(url+DBName, UserName, Password);

PreparedStatement psmt = conn.prepareStatement("select * from register");

// we might change the query based on the table name

ResultSet rs = psmt.executeQuery();

while(rs.next())
	
{
	



}








	
	
	
	
	
	
	
	}
	
	
	
	
	
}
