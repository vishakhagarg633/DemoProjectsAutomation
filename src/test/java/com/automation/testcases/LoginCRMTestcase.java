package com.automation.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.automation.pages.LoginCRM;

public class LoginCRMTestcase extends BaseClass {
	
	@Test
	public void loginCRM() {
		
		LoginCRM login = PageFactory.initElements(driver, LoginCRM.class);
		//login.loginToCRM(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		//login.loginToCRM("vishakhagarg.garg08@gmail.com", "Vishakha#7868");
		login.loginToCRM();
	}
}
