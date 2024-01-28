package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AllTasksPage extends ProjectSpecificMethods{
	
	public AllTasksPage RecentlyViewedTop1() {
		click(locateElement(Locators.XPATH,getPropertiesData("AllTasksPage", "AllTasksPage.recentlyviewedtop1.list")));
		return this;
	}
	public AllTasksPage CreateFollowupTask() {
		click(locateElement(Locators.XPATH,getPropertiesData("AllTasksPage", "AllTasksPage.createfollowuptask.combobox")));
		return this;
	}
	public FollowupEventPage CreateFollowupEvent() {
		click(locateElement(Locators.XPATH,getPropertiesData("AllTasksPage", "AllTasksPage.createfollowupevent.click")));
		return new FollowupEventPage();
	}
}
