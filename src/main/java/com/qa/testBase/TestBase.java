package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchnangesPage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Logger logger;
	public  LoginPage login;
	public DashboardPage dash;
	public ExchnangesPage exchanges;
	public LogoutPage logout;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String bw) {

		if(bw.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			logger.info("Chrome Browser Launched");
		}

		else if(bw.equalsIgnoreCase("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			logger.info("Edge Browser Launched");
		}

		else if(bw.equalsIgnoreCase("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			logger.info("FireFox Browser Launched");
		}
		else {
			System.out.println("Browser Name is Not Valid Please Change Browser Name");
		}

		driver.manage().window().maximize();
		logger.info("Browser Maximized");
		driver.manage().deleteAllCookies();
		logger.info("Deleted All Cookies");
		driver.get("https://apps.dalalstreet.ai/login");
		logger.info("Visited to URL");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		login =new LoginPage();
		dash=new DashboardPage();
		exchanges =new ExchnangesPage();
		logout=new LogoutPage();

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@BeforeClass
	public void start() {
		logger=Logger.getLogger("Automation Investment Banking Framework");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("FrameWork Execution Started");
	}
	@AfterClass
	public void stop() {
		logger.info("Framework Execution Completed");
	}
}
