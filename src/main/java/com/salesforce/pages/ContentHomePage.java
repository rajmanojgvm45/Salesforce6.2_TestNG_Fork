package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ContentHomePage extends ProjectSpecificMethods {
	
	public AllTasksPage viewAllTasks() {
		click(locateElement(Locators.XPATH,getPropertiesData("ContentHomePage", "ContentHomePage.viewalltasks.txt")));
		return new AllTasksPage() ;
		
	}
}
