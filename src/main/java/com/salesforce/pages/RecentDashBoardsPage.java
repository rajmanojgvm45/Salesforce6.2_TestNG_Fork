package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class RecentDashBoardsPage extends ProjectSpecificMethods {


	public RecentDashBoardsPage searchRecentDashboards(String dashboard) {
		type(locateElement(Locators.XPATH,getPropertiesData("RecentDashBoardsPage", "RecentDashBoardsPage.RecentDashBoards.txt")),dashboard);
		return this;
	}

	public DashboardPage clickEditDashboard() throws InterruptedException {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH,getPropertiesData("RecentDashBoardsPage", "RecentDashBoardsPage.EditDashBoard.dropdown")));
		click(locateElement(Locators.XPATH,getPropertiesData("RecentDashBoardsPage", "RecentDashBoardsPage.EditDashBoard.txt")));
		return new DashboardPage();
	}


}
