package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class ContactPage extends BasePage {
	

	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(id="Contact_Tab")
	WebElement contacttab;
	
	@FindBy(xpath="//input[@title=\"New\"]")
	WebElement newcontact;
	
	@FindBy(id="name_lastcon2")
	WebElement lastname;
	
	@FindBy(id="con4")
	WebElement accountname;
	
	@FindBy(xpath="//input[@title=\"Save\"]")
	WebElement savebutton;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement newview;
	
	@FindBy(id="fname")
	WebElement viewname;
	
	@FindBy(id="devname")
	WebElement uniquename;
	
	@FindBy(id="hotlist_mode")
	WebElement recentlycreated;
	
	@FindBy(id="fcf")
	WebElement view;
	
	@FindBy(xpath="//a[contains(text(),'Vikas')]")
	WebElement contactlink;
	
	@FindBy(xpath="//div[@class=\"errorMsg\"]")
	WebElement errormsg;
	
	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement cancel;
	
	@FindBy(xpath="//input[@value=\"Save & New\"]")
	WebElement saveandnew;
	

	
	public void saveandnew() {
		saveandnew.click();
	}
	
	public void cancel() {
		cancel.click();
	}
	
	public void errormsg() {
		errormsg.getText();
		System.out.println(errormsg.getText());
	}
	
	public void contactlink() {
		contactlink.click();
	}
	
	public void mycontactview() {
		Select dropdown=new Select(view);
		dropdown.selectByVisibleText("My Contacts");
	}
	
	public void checkrecentlycreated() {
		Select dropdown= new Select(recentlycreated);
		dropdown.selectByVisibleText("Recently Created");
	}
	
	public void enterintouniquename() {
		uniquename.sendKeys("Akshara");
	}
	
	public void enterintoviewname() {
		waitforElement(viewname);
		viewname.sendKeys("Akshara");
	}
	
	
	public void createnewview() {
		newview.click();
	}
	
	public void save() {
		savebutton.click();
	}
	
	public void enterintoaccountname() {
		accountname.sendKeys("test");
	}
	
	public void enterintolastname() {
		waitforElement(lastname);
		lastname.sendKeys("Vikas");
	}
	
	public void addnewcontact() {
		waitforElement(newcontact);
		newcontact.click();
	}
	
	public void clickoncontacttab() {
		waitforElement(contacttab);
		contacttab.click();
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

	public ContactPage(WebDriver driver) {
		super(driver);
		
	}

}
