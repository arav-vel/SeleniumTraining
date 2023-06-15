package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leaftaps.testngbase.TestNgBase;

public class TC005_EditLeads extends TestNgBase {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "TC005_EditLeads";
		testDescription = "Editing Leads Testcase 5";
		nodes = "Edit Leads Module";
		authors = "Manojkumar";
		category = "Smoke";
		excelDataFileName = "TC005_EditLeads";
	}
	
	@Test(dataProvider="fetchData")
	public void loginToLeafTaps(String userName, String password) {
		new LoginPage(driver, node, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
	}

}
