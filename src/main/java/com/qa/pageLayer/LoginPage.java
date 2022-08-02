package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {
	//email
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_box;
	//password
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_box;
	//login Button
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	public void enterEmailAddress(String emailID) {
		email_box.sendKeys(emailID);
	}
	public void enterPassword(String pass) {
		password_box.sendKeys(pass);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
