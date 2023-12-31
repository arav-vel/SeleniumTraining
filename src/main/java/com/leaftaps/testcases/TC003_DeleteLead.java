package com.leaftaps.testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.leaftaps.pages.LoginPage;
	import com.leaftaps.testngbase.TestNgBase;

	public class TC003_DeleteLead extends TestNgBase {
		
		@BeforeTest
		public void setValues() {
			testCaseName = "TC002_Login";
			System.out.println("My latest change");
			testDescription = "Login testCase 2";
			System.out.println("Added the Sysout Successfully");
			nodes = "Login Module";
			authors = "Aravindraj";
			
			category = "Smoke";
			excelDataFileName = "TC002_Login";
			System.out.println("");
		}
		
		@Test(dataProvider="fetchData")
		public void loginToLeafTaps(String userName, String password) {
			new LoginPage(driver, node, test)
			.enterUserName(userName)
			.enterPassword(password)
			.clickLoginButton();
//			latest added by Samuel
			System.err.println("Error :");
			System.err.println("Error :");
		}

	}
