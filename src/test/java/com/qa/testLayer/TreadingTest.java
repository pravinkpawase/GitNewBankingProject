package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TreadingTest extends TestBase {
	@Test
	public void verifyBuyShare() throws InterruptedException {
	login.enterEmailAddress("pawasepravin55@gmail.com");
	login.enterPassword("7020569920");
	login.clickOnLoginButton();
	Thread.sleep(4000);
	dash.enterCompanyName("Wipro");
	Thread.sleep(2000);
	dash.clickOnCompanyName();
	Thread.sleep(2000);
	exchanges.clickOnBuyBtn();
	Thread.sleep(2000);
	exchanges.enterQuantityOfShare();
	Thread.sleep(2000);
	exchanges.ClickOnBuyButton();
	Thread.sleep(2000);
	String exp_status="Order Created successfully";
	Assert.assertEquals(exchanges.getStatus(),exp_status);
		
	}
}
