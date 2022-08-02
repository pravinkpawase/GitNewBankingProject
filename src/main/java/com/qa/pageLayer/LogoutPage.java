package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LogoutPage extends TestBase {
	@FindBy(xpath="//i[@class='font-size-14 fas fa-user-ninja']")
	private WebElement profile_btn;
	@FindBy(xpath="//span[contains(text(),'Power Off')]")
	private WebElement power_off_btn;
	
	public LogoutPage(){
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnProfileBtn() {
		profile_btn.click();
	}
	public void clickOnPowerOffBtn() {
		Actions ac= new Actions(driver);
		ac.moveToElement(power_off_btn).click().build().perform();
	}
}
