package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class UsermenuPage extends BasePage{

	public UsermenuPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(id="userNavButton")
	WebElement usermenu;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a")
	List<WebElement> usermenudata;
	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement settings;
	
	@FindBy(id="PersonalInfo_font")
	WebElement personal;
	
	@FindBy(id="LoginHistory_font")
	WebElement loginhistory;
	
	@FindBy(xpath="//a[contains(text(),'Download login history')]")
	WebElement download;
	
	@FindBy(id="EmailSetup_font")
	WebElement email;
	
	@FindBy(id="EmailSettings_font")
	WebElement esettings;
	
	@FindBy(id="sender_name")
	WebElement ename;
	
	@FindBy(id="sender_email")
	WebElement eaddress;
	
	@FindBy(id="auto_bcc1")
	WebElement bcc;
	
	@FindBy(xpath="//input[@title='Cancel']")
	WebElement save;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement calandremind;
	
	@FindBy(id="Reminders_font")
	WebElement activeremind;
	
	@FindBy(id="testbtn")
	WebElement testbutton;
	
	@FindBy(xpath="//a[contains(text(),'Developer Console')]")
	WebElement devconsole;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement signout;
	
	public void logout() {
		signout.click();
	}
	
	public void selectdevconsole() {
		devconsole.click();
	}
	
	public void clickontestbutton() {
		testbutton.click();
	}
	
	public void clickonactivereminder() {
		activeremind.click();
	}
	
	public void selectcalenderremind() {
		calandremind.click();
	}
	
	public void saveemaildetails() {
		save.click();
	}
	
	public void selectbcc() {
		bcc.click();
	}
	
	public void enterintoemailaddress() {
		eaddress.sendKeys("preethij123@gmail.com");
	}
	
	public void enterintoename() {
		ename.sendKeys("Preethi Jagadeesha");
	}
	
	public void emailsetting() {
		esettings.click();
	}
	
	public void emailwindow() {
		email.click();
	}
	
	public void downloadhistory() {
		download.click();
	}
	
	public void loginhistory() {
		loginhistory.click();
		waitforElement(loginhistory);
		
	}
	
	public void personallink() {
		
		personal.click();
		
	}
	public void selectsettings() {
		waitforElement(settings);
		settings.click();
		
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
	public void usermenu() {
		waitforElement(usermenu);
		usermenu.click();
		waitforElement(usermenu);
		
	}
	
	public void usermenudata(String expectedText) {
		
		for(WebElement element : usermenudata) {
			
			 if(element.getText().equalsIgnoreCase(expectedText)) {
				 System.out.println("Expected value is present");
				 break;
			 }
			 
			 
		 }
	}
}
