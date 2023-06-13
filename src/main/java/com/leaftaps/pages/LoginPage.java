package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leaftaps.testngbase.TestNgBase;

public class LoginPage extends TestNgBase{
		
	public LoginPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	
	 @FindBy(how=How.ID,using="username") private WebElement userNameTextbox;
	 @FindBy(how=How.ID,using="password") private WebElement passwordTextbox;	  
	 @FindBy(how=How.XPATH,using="//input[@type='submit']") private WebElement loginButton;

	
	
	
	public LoginPage enterUserName(String data) {
		enterText(userNameTextbox, data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		enterText(passwordTextbox, data);
		return this;
	}
	
	public HomePage clickLoginButton() {
		click(loginButton);
		return new HomePage(driver, node, test);
	}
	
}
