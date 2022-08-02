package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase {
	@FindBy(xpath="(//input[@class='form-control'])")
	private WebElement search_box;
	@FindBy(linkText="WIPRO")
	private WebElement company_name;

	public DashboardPage() {
		PageFactory.initElements(driver,this);
	}

	public void enterCompanyName(String companyName) {
		search_box.sendKeys(companyName);
	}

	public void clickOnCompanyName() {
		Actions act=new Actions(driver);
		act.moveToElement(company_name).click().build().perform();
	}

}
