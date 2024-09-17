package com.training.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.OpptyPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class OpptyTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	PropertiesFile properties;
	OpptyPage opportunities;
	ScreenshotUtility screenshot=new ScreenshotUtility();
	
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getDriver();
		properties=new PropertiesFile();
	    String url=properties.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);
		opportunities=new OpptyPage(driver);
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyopportunitiestab(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		opportunities.opportunitiestab();
		opportunities.getviewoptions();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifycreatenewopportunities(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		opportunities.opportunitiestab();
		opportunities.createoopty();
		opportunities.opty();
		opportunities.enterintoaccountname();
		opportunities.selectclosedate();
		opportunities.selectdate();
		opportunities.stagedropdown();
		opportunities.probability();
		opportunities.leadsourcedropdown();
		opportunities.save();
		
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyopportunitiespipelinereport(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		opportunities.opportunitiestab();
		opportunities.selectpipeline();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifystuckopportunities(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		opportunities.opportunitiestab();
		opportunities.stuckopportunities();
	}
	
	@Test
	@Parameters({"Username","password"})
	public void verifyquarterlysummaryreport(String Username,String password) {
		
		loginpage.enterusername(Username);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		opportunities.opportunitiestab();
		opportunities.quarterlyreport();
		opportunities.include();
		opportunities.runreport();
		
	}
	@AfterMethod
	public void teardown() {
		screenshot.takescreenshot(driver);
		close();
	}
	

}
