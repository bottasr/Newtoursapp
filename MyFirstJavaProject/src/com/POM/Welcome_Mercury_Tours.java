package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_Mercury_Tours {

// POM stands for Page Object Model Framework
//In POM, each web page is consider as one Java class, which contains all elements and also entire web page and 
// business logics / functionality included

// go to http://newtours.demoaut.com/ home page
// In this script we are identifying each element and its business functionality
// <a href="mercurysignon.php">SIGN-ON</a> 
// ***********  Its a link Type Element ******** and we are linkText
	
@FindBy(linkText = "SIGN-ON")
WebElement Signon;

// creating method for Signon button/link
	
public void Signon ()
{
	Signon.click();
	
}
	
// <a href="mercuryregister.php">REGISTER</a>

@FindBy(linkText = "REGISTER")
	WebElement Register;

// Create Method

public void Register()
{
	Register.click();
	
}
	
//<a href="mercuryunderconst.php">SUPPORT</a>
@FindBy(linkText = "SUPPORT")
WebElement Support;

// create method
public void Support()
{ 
	Support.click();
}

// <input type="text" size="10" name="userName">
@FindBy(name = "userName" )
WebElement UserName;
//<input type="password" size="10" name="password">
@FindBy(name = "password" )
WebElement Password;
//<input width="58" type="image" border="0" height="17" alt="Sign-In" src="/images/btn_signin.gif" value="Login" name="login">
@FindBy(name = "login" )
WebElement Signin;

public void Signin( String Uname, String PWD)
{
UserName.sendKeys(Uname);
Password.sendKeys(PWD);
Signin.click();

}

// Validating text which is displaying on Home page
// html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font
@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")
WebElement TourTipsText;

public void TourTipsText()

{
	TourTipsText.getText();
}
	
/* I am not getting this text
// ARUBA image/text - trying to retrieve
//html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/p[1]/img

@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/p[1]/img")

WebElement Aruba;

public void Aruba()
{
Aruba.getText();
}

*/

//Destinations
//html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font


@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font")
WebElement Destinations;

// create method
public void Destinations()
{
Destinations.getText();

}

// Getting information from Special area
//xpath = html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font

@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font")
WebElement Specials;

// Getting $ amount from Specials Area
// For the Atlanta to Las Vegas - display dollar amount 
//html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/div/font/b

@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/div/font/b")
WebElement DollarAmount;

// Like wise write same thing to all other specials
// In this example i wrote the info for only one special

public void DollarAmount()

{
Specials.getText();
DollarAmount.getText();

}

// xpath  = html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]
// for the entire ARUBA and Specials


@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]")
WebElement ArubaSpecial;

public void ArubaSpec()
{
ArubaSpecial.getText();

}





}
