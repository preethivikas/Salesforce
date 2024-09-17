package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(id="Lead_Tab")
	WebElement leadstab;
	
	@FindBy(id="fcf")
	List<WebElement> usermenudata;
	
	@FindBy(id="fcf")
	WebElement viewlist;
	
	@FindBy(id="userNavLabel")
	WebElement logout;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement signout;
	
	@FindBy(id="fcf")
	WebElement viewlist1;
	
	@FindBy(xpath="//input[@value=\" New \"]")
	WebElement newbutton;
	
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	
	@FindBy(id="lea3")
	WebElement company;
	
	@FindBy(xpath="//input[@value=\" Save \"]")
	WebElement save;
	
	public void saveleads() {
		save.click();
	}
	
	public void enterintocompanyname() {
		company.sendKeys("Startup");	
	}
	
	public void enterintolastname() {
		waitforElement(lastname);
		lastname.sendKeys("Akshara");
	}
	
	public void newlead() {
		newbutton.click();
	}
	
	public void selecttodayslead() {
		Select view= new Select(viewlist1);	
		view.selectByVisibleText("Today's Leads");
	}
	
	public void signout() {
		signout.click();
	}
	
	public void logout() {
		waitforElement(logout);
		logout.click();
	}
	
	public void displayviewlist() {
		Select view= new Select(viewlist);	
		view.selectByVisibleText("All Open Leads");
	}
	
	
	
	public void displayvaluesofusermenu() {
		for(WebElement element : usermenudata) {		
			 
			 System.out.println(element.getText());
	}
	}
	
	public void clickonleadstab() {
		waitforElement(leadstab);
		leadstab.click();
	}
	
	public void enterpassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void enterusername(String strUsername) {
		waitforElement(Username);
		Username.sendKeys(strUsername);
	}
	
	public void clicklogin() {
		Loginbutton.click();
		
	}

	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}

}
