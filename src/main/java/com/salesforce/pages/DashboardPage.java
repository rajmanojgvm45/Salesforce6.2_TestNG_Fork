package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DashboardPage extends ProjectSpecificMethods {

	
	public DashboardPage editDashboardProperties(int frame) throws InterruptedException {
		Thread.sleep(3000);
		switchToFrame(frame);
		click(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.properties.icon")));
		return this;
		
		
	}
	public DashboardPage propertiesName(String name) {
		type(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.editname.txt")),name);
		return this;
	}
	public DashboardPage propertiesDescription(String desc) {
		type(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.editdescription.txt")),desc);
		return this;
	}
	public DashboardPage propertiesViewDashBoardas() {
		click(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.editview.radiobtn")));
		return this;
	}
	
	public DashboardPage propertiesSave() {
		
		click(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.saveproperty.btn")));
		return this;
	}
	public DashboardPage editDashboardSave() throws InterruptedException {
		click(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.dashboardsave.btn")));
		getDriver().switchTo().defaultContent();
		return this;
	}
	public DashboardPage dashboardSaveAlert(String message) {
		verifyExactText(locateElement(Locators.XPATH,getPropertiesData("DashboardPage", "DashboardPage.savemessage.popup")),message);
				return this;

		
	}
		
	
}
