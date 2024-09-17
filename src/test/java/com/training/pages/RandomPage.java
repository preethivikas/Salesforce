package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class RandomPage extends BasePage {
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(id="home_Tab")
	WebElement hometab;
	
	@FindBy(xpath="//a[contains(text(),\"Preethi\")]")
	WebElement namelink;
	
	@FindBy(xpath="//img[@title=\"Edit Profile\"]")
	WebElement editprofile;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement editpopup;
	
	@FindBy(xpath="//img[@title=\"All Tabs\"]")
	WebElement tab;
	
	@FindBy(xpath="//input[@value=\"Customize My Tabs\"]")
	WebElement custome;
	
	@FindBy(xpath="//option[contains(text(),'Files')]")
	WebElement findtab;
	
	@FindBy(xpath="//img[@class=\"leftArrowIcon\"]")
	WebElement remove;
	
	@FindBy(xpath="//input[@value=\" Save \"]")
	WebElement save;
	
	public void save() {
		save.click();
	}
	
	public void removetab() {
		remove.click();
	}
	
	public void findtab() {
		waitforElement(findtab);
		findtab.click();
	}
	
	public void customizetab() {
		waitforElement(custome);
		custome.click();
	}
	public void alltab() {
	waitforElement(tab);
	tab.click();
	}
	
	
	public void editpopup() {
	
	}
	
	public void editprofile() {
		waitforElement(editprofile);
		editprofile.click();
	}
	
	public void clicknamelink() {
		namelink.click();
	}
	
	public void hometab() {
		waitforElement(hometab);
		hometab.click();
	}

	public RandomPage(WebDriver driver) {
		super(driver);
		
	}
	public void enterusername(String strUsername) {
		waitforElement(Username);
		Username.sendKeys(strUsername);
	}
	
	public void clicklogin() {
		Loginbutton.click();
		
	}
	
	public void enterpassword(String strPassword) {
		password.sendKeys(strPassword);
	}

}
