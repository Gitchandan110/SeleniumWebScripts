package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_OpenIncidentPL;

public class SK_OpenIncidentBL extends SK_OpenIncidentPL {

	SK_OpenIncidentPL OpenIncidentPL;

	public void clickIncomingIncident() throws InterruptedException {

		try {

			if (IncomingIncident().isDisplayed() == true) {
				Base.scrolltoElement(driver, IncomingIncident());
				Thread.sleep(3000);
				Base.highLightElement(driver, IncomingIncident());
				Thread.sleep(2000);
				IncomingIncident().click();
				System.out.println("Incoming Incident was clicked");
				Thread.sleep(15000);

			} else {

				System.out.println("No Open Incident Found");

			}
		} catch (Exception ex) {

			System.out.println(ex);

		}
	}

	public void clickOpenIncident() throws InterruptedException {

		try {

			if (OpenIncident().isDisplayed() == true) {
				Base.scrolltoElement(driver, OpenIncident());
				Thread.sleep(3000);
				Base.highLightElement(driver, OpenIncident());
				Thread.sleep(2000);
				OpenIncident().click();
				System.out.println("Open Incident was clicked");
				Thread.sleep(5000);
            // 	Base.scrolltoElement(driver, logoKuvrr());
             	Base.scrolltoElement(driver, videoContainer());
             	Thread.sleep(15000);
             	System.out.println("15 seconds wait is over");

			} else {

				System.out.println("No Open Incident Found");
			}
		} catch (Exception e) {

		}
	}
	
public void clickIconShareIncident() {
		
		
		if (iconShareIncident().isDisplayed()) {
			iconShareIncident().click();
			System.out.println("Share Incident icon is found and clicked");
			
		}
		
		else {
			
			System.out.println("Unable to Share an incident");
			
		}
	}
	
	public void submitShareIncident() {
		
	       if (shareIncidentEmailfield().isDisplayed()) {
			
			shareIncidentEmailfield().click();
			shareIncidentEmailfield().sendKeys("ck@yopmail.com;chandan@yopmail.com;test@yopmail.com");
			btnSubmitShareIncident().click();
	}
		
}
	
	
	public void clickIncidentActionsClose() {
		
		if (dropdownIncidentAction().isDisplayed()) {
			dropdownIncidentAction().click();
			incidentActionClose().click();
		}
		
		
		
	}
	
	
public void clickIncidentResolutionFalseAlarm() {
		
		if (dropdownIncidentResolution().isDisplayed()) {
			dropdownIncidentResolution().click();
			incidentResolutionFalseAlarm().click();
		}
}
	
public void enterIncidentActionResponse() {
	
	if (txtIncidentActionResponse().isDisplayed()) {
		txtIncidentActionResponse().click();
		txtIncidentActionResponse().sendKeys("Its a False Alarm");
		btnSaveIncidentResponse().click();
	}
}	
	
	
}	
	


