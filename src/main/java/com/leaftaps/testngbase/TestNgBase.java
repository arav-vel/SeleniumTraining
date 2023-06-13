package com.leaftaps.testngbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.seleniumbase.SeleniumBase;

import utils.DataInputProvider;

public class TestNgBase extends SeleniumBase {
	
	public String excelDataFileName;
	
	@BeforeMethod
	@Parameters({"url"})
	public void beforeMethod(String url) {
		invokeApp("chrome", url);
	}
	
	@AfterMethod
	public void afterMethod() {
		closeApp();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] sendData() {
		return DataInputProvider.readExcelData(excelDataFileName);
	}

}
