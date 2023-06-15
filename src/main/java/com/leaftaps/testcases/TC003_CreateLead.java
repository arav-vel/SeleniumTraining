package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leaftaps.testngbase.TestNgBase;

public class TC003_CreateLead extends TestNgBase {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "TC003_CreateLead";
		testDescription = "Creating a Lead";
		nodes = "Login Module";
		authors = "Aravindraj";
		category = "Smoke";
		excelDataFileName = "TC002_Login";
		System.out.println("Addressing PR review comments");
	}
	
	@Test(dataProvider="fetchData")
	public void loginToLeafTaps(String userName, String password) {
		new LoginPage(driver, node, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
	}

}
