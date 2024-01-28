package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ServiceTerritoryPage extends ProjectSpecificMethods{
	
	public ServiceTerritoryPage enterServiceTerritoryName(String name) {
		type(locateElement(Locators.XPATH,getPropertiesData("NewServiceTerritoryPage", "newserviceterritory.name.txt")),name);
		return this;
	}
	
	public ServiceTerritoryPage selectParentTerritory() {
		
		click(locateElement(Locators.XPATH,getPropertiesData("NewServiceTerritoryPage", "newserviceterritory.parentterritory.txt")));
		click(locateElement(Locators.XPATH,getPropertiesData("NewServiceTerritoryPage", "newserviceterritory.parentterritory.ddown")));
		return this;
	}
	 public ServiceTerritoryPage selectOperatingService() {
			click(locateElement(Locators.XPATH,getPropertiesData("NewServiceTerritoryPage", "newserviceterritory.operatinghours.txt")));
		return this;
	 }
	 public OperatingHoursPage newOperatingHours() {
			click(locateElement(Locators.XPATH,getPropertiesData("NewServiceTerritoryPage", "newserviceterritory.newoperatinghours.btn")));
			return new OperatingHoursPage();
	 }
	 public RecentServiceTerritoriesPage saveParentTerritory() {
			click(locateElement(Locators.XPATH,getPropertiesData("NewServiceTerritoryPage", "newserviceterritory.saveterritory.btn")));
			return new RecentServiceTerritoriesPage();

	 }

}
