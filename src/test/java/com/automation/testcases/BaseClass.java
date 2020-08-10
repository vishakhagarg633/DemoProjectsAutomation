package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}

	@BeforeClass
	public void setUp() {
		//BrowserFactory.startApp(driver, config.getBrowser(), config.getURL());
		BrowserFactory.startApp(driver, "Chrome", "https://ui.freecrm.com/");

	}
	
	/*@AfterClass
	public void tearDown() {
		BrowserFactory.quitDriver(driver);
	}*/

}
