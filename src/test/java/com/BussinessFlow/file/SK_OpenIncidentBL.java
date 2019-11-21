package com.BussinessFlow.file;

import java.io.IOException;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_OpenIncidentPL;

public class SK_OpenIncidentBL extends SK_OpenIncidentPL {

	SK_OpenIncidentPL OpenIncidentPL;
	String SanitySheet="Sanity_SK";

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
				ExcelWrite.writeSanitySheet(SanitySheet, 25, 2, "Pass");
				ExcelWrite.writeSanitySheet(SanitySheet, 37, 2, "Pass");
				Base.scrolltoElement(driver, OpenIncident());
				Thread.sleep(3000);
				Base.highLightElement(driver, OpenIncident());
				Thread.sleep(2000);
				OpenIncident().click();
				System.out.println("Open Incident found and selected");
				ExcelWrite.writeSanitySheet(SanitySheet, 70, 2, "Pass");
				ExcelWrite.writeSanitySheet(SanitySheet, 71, 2, "Pass");
				Thread.sleep(5000);
            // 	Base.scrolltoElement(driver, logoKuvrr());
             	Base.scrolltoElement(driver, videoContainer());
             	System.out.println("Please wait for 15 seconds");
             	ExcelWrite.writeSanitySheet(SanitySheet, 30, 2, "Pass");
             	Thread.sleep(15000);
             	

			} else {

				System.out.println("No Open Incident Found");
			}
		} catch (Exception e) {

		}
	}
	
	public void clickSmartResponse() throws InterruptedException, IOException {
		
		Base.scrolltoElement(driver, btnSmartResponse());
		if (btnSmartResponse().isDisplayed()) {
		//	btnSmartResponse().click();
		//	chatSmartResponse().click();
		//	System.out.println("Samrt Response Chat is selected");
			txtSmartResponse().click();
			txtSmartResponse().sendKeys("Where are You?");
			System.out.println("SmartResponse: Where are You?");
			btnSendSmartResponse().click();
			Thread.sleep(2000);
			System.out.println("SmartResponse chat is performed");
			ExcelWrite.writeSanitySheet(SanitySheet, 29, 2, "Pass");
			
		}
	}

	public void enterEventNotes() throws InterruptedException {
		
		if (txtEventNotes().isDisplayed()) {
			txtEventNotes().click();
			txtEventNotes().sendKeys("Event Notes");
			btnSaveEventNotes().click();
			Thread.sleep(2000);
			System.out.println("Event Notes sent");
		}
	}	
	
public void clickIconShareIncident() throws InterruptedException {
		
		
		if (iconShareIncident().isDisplayed()) {
			iconShareIncident().click();
			Thread.sleep(2000);
			System.out.println("Share Incident icon is found and clicked");
			
		}
		
		else {
			
			System.out.println("Unable to Share an incident");
			
		}
	}
	
	public void submitShareIncident() throws InterruptedException, IOException {
		
	      if (shareIncidentEmailfield().isDisplayed()) {
			shareIncidentEmailfield().click();
			shareIncidentEmailfield().sendKeys("ck@yopmail.com;chandan@yopmail.com;test@yopmail.com");
			btnSubmitShareIncident().click();
			Thread.sleep(2000);
			System.out.println("Share incident mail are sent to: ck@yopmail.com, chandan@yopmail.com, test@yopmail.com");
			ExcelWrite.writeSanitySheet(SanitySheet, 62, 2, "Pass");
	      }
		
}
	
	
	public void clickIncidentActionsClose() throws InterruptedException, IOException {
		
		if (dropdownIncidentAction().isDisplayed()) {
			dropdownIncidentAction().click();
			incidentActionClose().click();
			Thread.sleep(2000);
			System.out.println("Event action closed");
			ExcelWrite.writeSanitySheet(SanitySheet, 80, 2, "Pass");
		}
		
		
		
	}
	
	
public void clickIncidentResolutionFalseAlarm() throws InterruptedException {
		
		if (dropdownIncidentResolution().isDisplayed()) {
			dropdownIncidentResolution().click();
			incidentResolutionFalseAlarm().click();
			Thread.sleep(2000);
			System.out.println("Incident Resolution: False Alarm selected");
		}
}
	
public void enterIncidentActionResponse() throws InterruptedException {
	
	if (txtIncidentActionResponse().isDisplayed()) {
		txtIncidentActionResponse().click();
		txtIncidentActionResponse().sendKeys("Its a False Alarm");
		Thread.sleep(2000);
		btnSaveIncidentResponse().click();
	}
}	



	
	
}	
	


