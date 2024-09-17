package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.UsermenuPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class UsermenuTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	UsermenuPage usermenupage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);
		usermenupage=new UsermenuPage(driver);
		
	}	
	@Test
	@Parameters({"Username","password"})
	public void verifyusermenudropdown(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		usermenupage.usermenu();
		usermenupage.usermenudata("My Profile");
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifymysettings(String Username,String password) {
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		usermenupage.usermenu();
		usermenupage.selectsettings();
		usermenupage.personallink();
		usermenupage.loginhistory();
		usermenupage.downloadhistory();
		usermenupage.emailwindow();
		usermenupage.emailsetting();
		usermenupage.enterintoename();
		usermenupage.enterintoemailaddress();
		usermenupage.selectbcc();
		usermenupage.saveemaildetails();
		usermenupage.selectcalenderremind();
		usermenupage.clickonactivereminder();
		usermenupage.clickontestbutton();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifydeveloperconsolefromdropdown(String Username,String password) {
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		usermenupage.usermenu();
		usermenupage.selectdevconsole();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifylogout(String Username,String password) {
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		usermenupage.usermenu();
		usermenupage.logout();
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		screenshot.takescreenshot(driver);
		close();
	}

}
