package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class SellingTest extends TestBase {

	@Test
	public void verifySellShare() throws InterruptedException {
		login.enterEmailAddress("pawasepravin55@gmail.com");
		login.enterPassword("7020569920");
		login.clickOnLoginButton();
		
		Thread.sleep(2000);
		dash.enterCompanyName("WIPRO");
		Thread.sleep(2000);
		dash.clickOnCompanyName();
		Thread.sleep(2000);
		exchanges.clickOnsellbtn();
		Thread.sleep(2000);
		exchanges.enterQuantityOfSellShare();
		Thread.sleep(2000);
		exchanges.clickonSellButton();
		Thread.sleep(2000);
		String order="Order Created successfully";
		Assert.assertEquals(order,exchanges.getStatus());
		
		
		
	}
}
