package com.training.pages;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class AccountPage extends BasePage {
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(id="Account_Tab")
	WebElement account;
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newbutton;
	
	@FindBy(id="acc2")
	WebElement accountname;
	
	@FindBy(id="acc6")
	WebElement type;
	
	@FindBy(id="00NdL0000037fZO")
	WebElement Priority;
	
	@FindBy(xpath="//input[@title=\"Save\"]")
	WebElement savebutton;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement newview;
	
	@FindBy(id="fname")
	WebElement viewname;
	
	@FindBy(id="devname")
	WebElement Uniquename;
	
	@FindBy(xpath="//input[@title=\"Save\"]")
	WebElement save;
	
	@FindBy(id="fcf")
	WebElement view;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement edit;
	
	@FindBy(id="fname")
	WebElement editviewname;
	
	@FindBy(id="devname")
	WebElement editUniquename;
	
	@FindBy(id="fcol1")
	WebElement editaccountname;
	
	@FindBy(id="fop1")
	WebElement operator;
	
	@FindBy(id="fval1")
	WebElement value;
	
	@FindBy(xpath="//input[@data-uidsfdc='3']")
	WebElement editsave;
	
	@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
	WebElement merger;
	
	@FindBy(id="srch")
	WebElement search;
	
	@FindBy(xpath="//input[@value='Find Accounts']")
	WebElement find;
	
	@FindBy(xpath="//input[@title=\"Next\"]")
	WebElement next;
	
	@FindBy(xpath="//a[contains(text(),'Accounts with last activity')]")
	WebElement lastactivity;
	
	@FindBy(id="ext-gen152")
	WebElement searchdate;
	
	@FindBy(id="ext-gen49")
	WebElement saveontab;
	
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement rname;
	
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement devname;
	
	@FindBy(id="ext-gen313")
	WebElement saved;
	public void clicksaved() {
		saved.click();
	}
	
	public void enterintouniquereportname() {
		devname.sendKeys("Preethi");
	}
	
	public void enterintoreportname() {
		waitforElement(rname);
		rname.sendKeys("Preethi");
	}
	
	public void saveontab() {
		saveontab.click();
	}
	
	
	public void searchdate() {
		searchdate.click();
		Date currentDate = new Date(); 
		currentDate.setDate(21);
	}
	public void lastactivity() {
		waitforElement(lastactivity);
		lastactivity.click();
	}
	
	public void nextbutton() {
		waitforElement(next);
		next.click();
	}
	
	public void findaccounts() {
		find.click();
	}
	
	public void searchaccount() {
		search.sendKeys("Preethi Vikas");
	}
	
	public void mergeaccount() {
		merger.click();
	}
	
	public void editsave() {
		editsave.click();
	}
	
	public void enterintovalue() {
		value.sendKeys("a");
	}
	
	public void selectoperator() {
		Select opt=new Select(operator);
		opt.selectByVisibleText("contains");
	}
	
	public void field() {
		Select field=new Select(editaccountname);
		field.selectByVisibleText("Account Name");
	}
	
	
	
	public void editUniquename() {
		editUniquename.sendKeys("Akshara");
	}
	
	public void editviewname() {
		waitforElement(editviewname);
		editviewname.sendKeys("Akshara");
	}
	
	public void edit() {
		edit.click();
	}
	
	public void editview() {
		Select dropdown= new Select(view);
		dropdown.selectByVisibleText("Akshara1");
	}
	
	
	public void save() {
		save.click();
	}
	
	public void enterintouniquename() {
		Uniquename.click();
	}
	
	public void enterintoviewname() {
		waitforElement(viewname);
		viewname.sendKeys("Aarav");
	}
	
	public void createnewview() {
		newview.click();
	
	}	
	
	public void clicksave() {
		savebutton.click();
	}
	
	public void selectpriority() {
		Select Priorityropdown=new Select(Priority);
		Priorityropdown.selectByVisibleText("High");
		
	}
	
	public void selectaccounttype() {
		Select typedropdown=new Select(type);
		typedropdown.selectByVisibleText("Technology Partner");
	}
	public void accountname() {
		accountname.sendKeys("Akshara Vikas");
	}
	
	public void clicknewbutton() {
		newbutton.click();
	}
	
	public void findaccounttab() {
		waitforElement(account);
		account.click();
	}
	
	public void enterusername(String strUsername) {
		waitforElement(Username);
		Username.sendKeys(strUsername);
	}
	public void enterpassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clicklogin() {
		Loginbutton.click();
		waitforElement(Loginbutton);
		
	}
	
	
	

	public AccountPage(WebDriver driver) {
		super(driver);
		
	}

}
