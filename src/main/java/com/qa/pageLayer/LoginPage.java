package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase1;

public class LoginPage extends TestBase1 {
	
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//input[@id='email']")
	private WebElement email_textbox ;
	
	public void enterEmailAddress (String user) {
		email_textbox.sendKeys(user);
	}
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement pass_textbox ;
	
	public void enterPass (String pass1) {
		pass_textbox.sendKeys(pass1);
	}
	
	@FindBy (xpath="//button[@id='loginbutton']")
	private WebElement login_button ;
	
	public void clickOnLoginBtn () {
		login_button.click();
	}
	
	
	
}
