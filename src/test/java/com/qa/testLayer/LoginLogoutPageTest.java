package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LoginLogoutPageTest extends TestBase {
	@Test
	public void logout() throws InterruptedException {
	login.enterEmailAddress("pawasePravin55@gmail.com");
	login.enterPassword("7020569920");
	login.clickOnLoginButton();
	Thread.sleep(2000);
	logout.clickOnProfileBtn();
	Thread.sleep(2000);
	logout.clickOnPowerOffBtn();
	}
}
