package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class RecentServiceTerritoriesPage extends ProjectSpecificMethods {
	
	
	public RecentServiceTerritoriesPage editParentTerritory() {
		doubleClick(locateElement(Locators.XPATH,getPropertiesData("ServiceTerritoriesPage", "serviceterritories.editparenterritory.btn")));
		return this; 
	}
	public ServiceTerritoryPage clickNewServiceTerritory() {
		click(locateElement(Locators.XPATH,getPropertiesData("ServiceTerritoriesPage", "serviceterritories.newserviceterritory.icon")));
		return new ServiceTerritoryPage();
	}
	public RecentServiceTerritoriesPage serviceTerritorySave() {
		click(locateElement(Locators.XPATH,getPropertiesData("ServiceTerritoriesPage", "serviceterritories.serviceterritorysave.btn")));
		return new RecentServiceTerritoriesPage();
	}
	
	
}
