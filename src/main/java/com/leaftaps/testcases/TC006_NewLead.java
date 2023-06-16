package com.leaftaps.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leaftaps.testngbase.TestNgBase;

public class TC006_NewLead extends TestNgBase {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "TC001_Login";
		testDescription = "Login testCase 1";
		nodes = "Login Module";
		authors = "Aravindraj";
		category = "Smoke";
		excelDataFileName = "TC001_Login";
	}
	
	@Test(dataProvider="fetchData")
	public void loginToLeafTaps(String userName, String password) {
		new LoginPage(driver, node, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
		
		
	}

}
