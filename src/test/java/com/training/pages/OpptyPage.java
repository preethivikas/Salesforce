package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class OpptyPage extends BasePage {

	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Loginbutton;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	WebElement opportunitiestab;
	
	@FindBy(id="fcf")
	WebElement view;
	
	@FindBy(id="createNewButton")
	WebElement create;
	
	@FindBy(xpath="//a[@class=\"opportunityMru menuButtonMenuLink\"]")
	WebElement opty;
	
	@FindBy(id="opp3")
	WebElement optyname;
	
	@FindBy(id="opp4")
	WebElement accountname;
	
	@FindBy(id="opp9")
	WebElement date;
	
	@FindBy(xpath="//a[@tabindex='7']")
	WebElement date1;
	
	@FindBy(id="opp11")
	WebElement stage;
	
	@FindBy(id="opp12")
	WebElement probability;
	
	@FindBy(id="opp6")
	WebElement leadsource;
	
	@FindBy(xpath="//input[@title=\"Save\"]")
	WebElement save;
	
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")
	WebElement pipeline;
	
	@FindBy(xpath="//a[contains(text(),'Stuck Opportunities')]")
	WebElement stuckopty;
	
	@FindBy(id="quarter_q")
	WebElement quarterly;
	
	@FindBy(id="open")
	WebElement include;
	
	@FindBy(xpath="//input[@title=\"Run Report\"]")
	WebElement runreport;
	
	public void runreport() {
		runreport.click();
	}
	
	public void include() {
		Select dropdown1= new Select(include);
		dropdown1.selectByVisibleText("All Opportunities");
	}
	
	public void quarterlyreport() {
		Select dropdown= new Select(quarterly);
		dropdown.selectByVisibleText("Next FQ");
	}
	
	public void stuckopportunities() {
		stuckopty.click();
	}
	
	public void selectpipeline() {
		pipeline.click();
	}
	
		
	public void save() {
		save.click();
	}
	
	public void leadsourcedropdown() {
		Select dropdown1=new Select(leadsource);
		dropdown1.selectByVisibleText("Purchased List");
	}
	
	public void probability() {
		probability.sendKeys("");
	}
	
	public void stagedropdown() {
		Select dropdown=new Select(stage);
		dropdown.selectByVisibleText("Perception Analysis");
	}
	public void selectdate() {
		date1.click();
	}
	
	public void selectclosedate() {
		date.click();
	}
	
	public void enterintoaccountname() {
		accountname.sendKeys("Vikas");
	}
	
	public void enterintooptyname() {
		waitforElement(optyname);
		optyname.sendKeys("Preethi");
	}
	
	public void opty() {
		waitforElement(opty);
		opty.click();
		
			}
	
	public void createoopty() {
		waitforElement(create);
		create.click();
		
	}
	
	
	public void getviewoptions() {
		view.getText();
		System.out.println(view.getText());
	}
	
	public void  opportunitiestab() {
		waitforElement(opportunitiestab);
		opportunitiestab.click();
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
		
	}
	
	
	
	
	
	
	
	public OpptyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
