package com.framework.testng.api.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

import java.io.IOException;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void preCondition() {
		/*
		 * String browser = getPropertiesData("BrowserLaunch", "browser"); String url =
		 * getPropertiesData("BrowserLaunch", "url"); System.out.println(browser+ "+" +
		 * url); startApp(browser, false, url);
		 */
		
		startApp("chrome", false, "https://testleaf-5e-dev-ed.develop.my.salesforce.com/");
		setNode();
	}
	
	@AfterMethod(alwaysRun = true)
	public void postCondition() {
		//close();
	}	
	
}