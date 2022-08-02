package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchnangesPage extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement quantity_textbox;
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_button;
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement sell_btn;
	@FindBy(xpath="(//input[@class='form-control form-control'])")
	private WebElement quatity_sell;
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement sell_button;
	

	public ExchnangesPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBuyBtn() {
		buy_btn.click();
	}
	public void enterQuantityOfShare() {
		quantity_textbox.sendKeys("10");
	}
	public void ClickOnBuyButton() {
		buy_button.click();
	}
	public String getStatus() {
		String st=status.getText();
		return st;
	}
	public void clickOnsellbtn() {
		sell_btn.click();
	}
	public void enterQuantityOfSellShare() {
		quatity_sell.sendKeys("10");
	}
	public void clickonSellButton() {
		sell_button.click();
	
	}
}
