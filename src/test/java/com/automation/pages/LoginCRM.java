package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.utility.ExcelDataProvider;

public class LoginCRM {

	WebDriver driver;

	public LoginCRM(WebDriver driver) {
		this.driver = driver;
	}
	
	//@FindBy(name="email") WebElement email1;
	@FindBy(how=How.NAME , using="email") WebElement email1;
	@FindBy(name="password") WebElement password1;
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]") WebElement loginbtn;

	//public void loginToCRM(String emailid, String pwd) {
		//email1.sendKeys(emailid);
		//password1.sendKeys(pwd);
	public void loginToCRM() {
		email1.sendKeys("vishakhagarg.garg08@gmail.com");
		password1.sendKeys("Vishakha#7868");
		loginbtn.click();
	}
}
