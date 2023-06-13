package com.leaftaps.seleniumdesign;

public interface Browser {	
	
	public void invokeApp(String browser, String url);
	
	public void closeApp();

}
