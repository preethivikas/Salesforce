package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LoginTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);		
		
	}	
	
	@Test
	@Parameters({"Username"})
	public void verifyLoginError(String Username) {
		loginpage.enterusername(Username);
		loginpage.clicklogin();
		loginpage.error();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifylogintosaleforce(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyrememberuser(String Username,String password) {
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.rememberuser();
		loginpage.clicklogin();
		loginpage.usermenu();
		loginpage.signout();
		
	}
	
	@Test
	public void Testforgetpassword() {
		loginpage.forgotpassword();
		loginpage.username();
		
	}
	
	@Test
	public void validateloginerror() {
		loginpage.wrongusername();
		loginpage.wrongpassword();
		loginpage.wronglogin();
		loginpage.incorrectlogin();
		
	}
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		screenshot.takescreenshot(driver);
		close();
	}
		
	  

}
