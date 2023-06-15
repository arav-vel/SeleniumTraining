package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leaftaps.testngbase.TestNgBase;

public class TC004_FindLeads extends TestNgBase {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "TC004_FindLeads";
		testDescription = "Login testCase 4";
		nodes = "FindLeads Module";
		authors = "Samuel Ramesh";
		category = "Smoke";
//		excelDataFileName = "TC003_Login";
	}
	
	@Test(dataProvider="fetchData")
	public void loginToLeafTaps(String userName, String password) {
		new LoginPage(driver, node, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
	}

}
