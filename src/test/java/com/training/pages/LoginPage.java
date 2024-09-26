package com.training.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.training.base.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(id="error")
	WebElement error;
	
	@FindBy(id="rememberUn")
	WebElement remember;
	
	@FindBy(id="userNavButton")
	WebElement usermenu;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement signout;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(id="un")
	WebElement username;
	
	@FindBy(id="username")
	WebElement wrongusername;
	
	@FindBy(id="password")
	WebElement wrongpassword;
	
	@FindBy(id="Login")
	WebElement wronglogin;
	
	@FindBy(id="error")
	WebElement incorrectlogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterusername(String strUsername) {
		waitforElement(Username);
		Username.sendKeys(strUsername);
	}
	
	public void clicklogin() {
		Loginbutton.click();
		
	}
	
	
	
	public void error() throws Exception {
		
		/*String expectedtxt="Please enter your password.";
		String actualtxt=error.getText();
		if(expectedtxt.equalsIgnoreCase(actualtxt)) {
			
			System.out.println("Expected text is displayed");
		}
		else
			System.out.println("Expected text is not displayed");
		
	}*/
		String expectedtxt="Please enter your password";
		String actualtext=error.getText();
		System.out.println(actualtext);
		//throw new Exception("Skip execution");
		//assertEquals(actualtext, expectedtxt);
		//SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(actualtext,expectedtxt,"Title is not Matching");
		//softAssert.assertAll();
		System.out.println("assertion test");
		//softAssert.assertAll();
	}
	
	public void enterpassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void rememberuser() {
		remember.click();
		
		}
	public void usermenu() {
		waitforElement(usermenu);
		usermenu.click();
	}
	
	public void signout() {
		signout.click();
	}
	
	public void forgotpassword() {
		forgotpassword.click();
	}
	
	public void username() {
		
		username.sendKeys("preethij123@gmail.com");
		
	}
	
	public void wrongusername() {
		
		wrongusername.sendKeys("preeth123@gmail.com");
	}
	
	public void wrongpassword() {
		wrongpassword.sendKeys("12345");
	}
	
	public void wronglogin() {
		wronglogin.click();
	}
	
	public void incorrectlogin() {
		String expectedtxt=incorrectlogin.getText();
		System.out.println(expectedtxt);
	}

	}
	
	
	
	


