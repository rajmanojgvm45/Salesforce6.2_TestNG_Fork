package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class WorkTypeGroupsPage extends ProjectSpecificMethods{

	public WorkTypeGroupsPage workTypeName(String name) {
		type(locateElement(Locators.XPATH,getPropertiesData("WorkTypeGroupsPage", "WorkTypeGroupsPage.worktypename.txt")),name);
		return this;
	}
	public WorkTypeGroupsPage workTypeDesc(String desc) {
		type(locateElement(Locators.XPATH,getPropertiesData("WorkTypeGroupsPage", "WorkTypeGroupsPage.worktypedesc.txt")),desc);
		return this;
	}
	public RecentWorkTypeGroupsPage workTypeSave() {
		click(locateElement(Locators.XPATH,getPropertiesData("WorkTypeGroupsPage", "WorkTypeGroupsPage.worktypesave.btn")));
		return new RecentWorkTypeGroupsPage();
	}
	
	
	
}
