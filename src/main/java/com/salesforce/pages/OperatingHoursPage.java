package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import java.util.List;

public class OperatingHoursPage extends ProjectSpecificMethods {

	public OperatingHoursPage operatingHourName(String name) {
		type(locateElement(Locators.XPATH,getPropertiesData("OperatingHoursPage", "operatinghourspage.name.txt")),name);
		return this;
	}
	
	public OperatingHoursPage operatingHourDesc(String desc) {
		type(locateElement(Locators.XPATH,getPropertiesData("OperatingHoursPage", "operatinghourspage.name.txt")),desc);
		return this;
	}
	public OperatingHoursPage operatingHRTimeZone(String zone) {
		click(locateElement(Locators.XPATH,getPropertiesData("OperatingHoursPage", "operatinghourspage.timezone.combo")));
		List<WebElement> timeZone =locateElements(Locators.XPATH,getPropertiesData("OperatingHoursPage", "operatinghourspage.timezone.combo"));
		for (WebElement seltime : timeZone) {
			if(seltime.equals(zone)) {
				seltime.click();
			}
			System.out.println(zone);
		}

		return this;
	}
	public ServiceTerritoryPage opertingHourSave() {
		//click(locateElement(Locators.XPATH,getPropertiesData("OperatingHoursPage", "operatinghourspage.save.btn")));
		return new ServiceTerritoryPage() ;
	}
	
}
