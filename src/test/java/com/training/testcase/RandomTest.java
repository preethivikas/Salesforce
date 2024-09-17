package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.RandomPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class RandomTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	RandomPage randompage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);	
		randompage=new RandomPage(driver);
		
	}	
	@Test
	@Parameters({"Username","password"})
	public void verifyfirstandlastname(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		randompage.hometab();
		randompage.clicknamelink();
	}

	@Test
	@Parameters({"Username","password"})
	public void verifyupdatedlastname(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		randompage.hometab();
		randompage.clicknamelink();
		randompage.editprofile();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyremovetab(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		randompage.alltab();
		randompage.customizetab();
		randompage.findtab();
		randompage.removetab();
		randompage.save();
	}
}
