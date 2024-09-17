package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LeadsTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	LeadsPage leadspage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);
		leadspage=new LeadsPage(driver);
		
	}	
	
	@Test
	@Parameters({"Username","password"})
	public void verifyleadstab(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		leadspage.clickonleadstab();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyvaluesofusermenu(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		leadspage.clickonleadstab();
		leadspage.displayvaluesofusermenu();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifydefaultview(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		leadspage.clickonleadstab();
		leadspage.displayviewlist();
		leadspage.logout();
		leadspage.signout();
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		leadspage.clickonleadstab();
		leadspage.displayvaluesofusermenu();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifytodaysleadsfromdropdown(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		leadspage.clickonleadstab();
		leadspage.selecttodayslead();
		
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyleadspagenewleads(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		leadspage.clickonleadstab();
		leadspage.newlead();
		leadspage.enterintolastname();
		leadspage.enterintocompanyname();
		leadspage.saveleads();
	}
	
	@AfterMethod
	public void teardown() {
		screenshot.takescreenshot(driver);
		close();
	}

}
