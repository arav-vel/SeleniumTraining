package com.leaftaps.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leaftaps.testngbase.TestNgBase;

public class HomePage extends TestNgBase{
	
	public HomePage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	
	public HomePage verifyTitle() {
		//TBD
		return this;
	}
}
