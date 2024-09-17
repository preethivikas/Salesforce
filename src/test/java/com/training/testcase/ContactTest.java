package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.ContactPage;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class ContactTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	ContactPage contactpage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);
		contactpage=new ContactPage(driver);
		
	}	
	
	@Test
	@Parameters({"Username","password"})
	public void verifycreatenewcontact(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.addnewcontact();
		contactpage.enterintolastname();
		contactpage.enterintoaccountname();
		contactpage.save();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifycreatenewview(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.createnewview();
		contactpage.enterintoviewname();
		contactpage.enterintouniquename();
		contactpage.save();
	}
	

	@Test
	@Parameters({"Username","password"})
	public void verifyrecentlycreatedcontact(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.checkrecentlycreated();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifymycontactview(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.mycontactview();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyviewacontact(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.contactlink();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyerrorcreatingview(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.createnewview();
		contactpage.enterintouniquename();
		contactpage.save();
		contactpage.errormsg();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifycancelbutton(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.createnewview();
		contactpage.enterintoviewname();
		contactpage.enterintouniquename();
		contactpage.cancel();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifysaveandnewbutton(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		contactpage.clickoncontacttab();
		contactpage.addnewcontact();
		contactpage.enterintolastname();
		contactpage.enterintoaccountname();
		contactpage.saveandnew();
		
	}
	
	
	@AfterMethod
	public void teardown() {
		screenshot.takescreenshot(driver);
		close();
	}

}
