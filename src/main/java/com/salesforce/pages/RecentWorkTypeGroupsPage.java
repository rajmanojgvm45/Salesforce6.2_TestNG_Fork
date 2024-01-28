package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class RecentWorkTypeGroupsPage extends ProjectSpecificMethods{

	public RecentWorkTypeGroupsPage workTypeGroupddown() throws InterruptedException {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH,getPropertiesData("RecentWorkTypeGroupsPage", "RecentWorkTypeGroupsPage.worktypegroups.ddown")));
		return this;
	}
	public WorkTypeGroupsPage newWorkTypeGroup() throws InterruptedException {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH,getPropertiesData("RecentWorkTypeGroupsPage", "RecentWorkTypeGroupsPage.newworktypegroups.txt")));
		return new WorkTypeGroupsPage();
	}
	
	
}
