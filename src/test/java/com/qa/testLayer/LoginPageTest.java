package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;

public class LoginPageTest extends LoginPage {

	@Test
	public void VerifyLoginFunctionality() throws InterruptedException {
		login.enterEmailAddress("pawasepravin55@gmail.com");
		login.enterPassword("7020569920");
		login.clickOnLoginButton();
		
	}
}
