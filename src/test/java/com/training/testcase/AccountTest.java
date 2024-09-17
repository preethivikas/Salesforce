package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.AccountPage;
import com.training.pages.LoginPage;
import com.training.pages.UsermenuPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class AccountTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	AccountPage accountpage;
	UsermenuPage usermenupage;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);
		usermenupage=new UsermenuPage(driver);
		accountpage=new AccountPage(driver);

	}	
	
	@Test
	@Parameters({"Username","password"})
	public void verifycreateaccount(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		accountpage.findaccounttab();
		accountpage.clicknewbutton();
		accountpage.accountname();
		accountpage.selectaccounttype();
		accountpage.selectpriority();
		accountpage.clicksave();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifycreatenewview(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		accountpage.findaccounttab();
		accountpage.createnewview();
		accountpage.enterintoviewname();
		accountpage.enterintouniquename();
		accountpage.save();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyeditnewview(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		accountpage.findaccounttab();
		accountpage.editview();
		accountpage.edit();
		accountpage.editviewname();
		accountpage.editUniquename();
		accountpage.field();
		accountpage.selectoperator();
		accountpage.enterintovalue();
		accountpage.editsave();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifymergeaccount(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		accountpage.findaccounttab();
		accountpage.mergeaccount();
		accountpage.searchaccount();
		accountpage.findaccounts();
		accountpage.nextbutton();
	}
	@Test
	@Parameters({"Username","password"})
	public void verifylastactivity(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		accountpage.findaccounttab();
		accountpage.lastactivity();
		accountpage.searchdate();
		accountpage.saveontab();
		accountpage.enterintoreportname();
		accountpage.enterintouniquereportname();
		accountpage.clicksaved();
		
	
	
	}	

}
