package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase {

	
	public UtilClass(){
		PageFactory.initElements(driver, this);
	}
	
	public static void getScreenshot(String test1) {
	
		File des=new File("F:\\Automation\\Eclipse_IDE_2021_12\\Eclipse_Workspace\\AutoInvestmentBanking\\Screenshots\\"+
		test1+System.currentTimeMillis()+".png");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy( src,des);
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
				
	}
}
