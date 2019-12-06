package com.BussinessFlow.file;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_OpenIncidentPL;

public class SK_OpenIncidentBL extends SK_OpenIncidentPL {

	SK_OpenIncidentPL OpenIncidentPL;
	String SanitySheet = "Sanity_SK";

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

			if (OpenIncident() !=null && OpenIncident().isDisplayed()) {
				ExcelWrite.writeSanitySheet(SanitySheet, 9, 1, "Pass");
				Base.scrolltoElement(driver, OpenIncident());
				Base.screenShotWebElement(OpenIncident());
				Thread.sleep(3000);
				Base.highLightElement(driver, OpenIncident());
				ExcelWrite.writeSanitySheet(SanitySheet, 32, 1, "Pass");
				Base.takeScreenShot("Active Screen");
				Thread.sleep(2000);
				OpenIncident().click();
				System.out.println("Open Incident found and selected");
				ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
				Thread.sleep(5000);
				// Base.scrolltoElement(driver, logoKuvrr());
				Base.scrolltoElement(driver, videoContainer());
				Base.takeScreenShot("IncidentPage");
				Base.scrolltoElement(driver, mapContainer());
				Base.screenShotWebElement(mapContainer());
				ExcelWrite.writeSanitySheet(SanitySheet, 10, 1, "Pass");
				System.out.println("Please wait for 15 seconds");
				Thread.sleep(15000);

			} else {

				System.out.println("No Open Incident Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click911Incident() throws InterruptedException {

		try {
			
			if (Incident911() != null && Incident911().isDisplayed()) {
				Base.scrolltoElement(driver, Incident911());
				Thread.sleep(3000);
				Base.highLightElement(driver, Incident911());
				ExcelWrite.writeSanitySheet(SanitySheet, 20, 1, "Pass");
				Thread.sleep(2000);
				Incident911().click();
				System.out.println("911 Incident found and selected");
				ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
				Thread.sleep(5000);
				Base.scrolltoElement(driver, videoContainer());
				Base.takeScreenShot("911");
				System.out.println("Please wait for 5 seconds");
				Thread.sleep(5000);
			} else {

				System.out.println("No 911 Incident Found");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSmartResponse() throws InterruptedException, IOException {

		Base.scrolltoElement(driver, btnSmartResponse());
		if (btnSmartResponse().isDisplayed()) {
			// btnSmartResponse().click();
			// chatSmartResponse().click();
			// System.out.println("Samrt Response Chat is selected");
			txtSmartResponse().click();
			txtSmartResponse().sendKeys("Where are You?");
			System.out.println("SmartResponse: Where are You?");
			btnSendSmartResponse().click();
			Thread.sleep(2000);
			System.out.println("SmartResponse chat is performed");
			ExcelWrite.writeSanitySheet(SanitySheet, 14, 1, "Pass");

		}
	}

	public void enterEventNotes() throws InterruptedException, IOException {

		if (txtEventNotes().isDisplayed()) {
			txtEventNotes().click();
			txtEventNotes().sendKeys("Event Notes");
			btnSaveEventNotes().click();
			Thread.sleep(2000);
			System.out.println("Event Notes sent");
			ExcelWrite.writeSanitySheet(SanitySheet, 15, 1, "Pass");
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
			Base.takeScreenShot("ShareIncident");
			Thread.sleep(2000);
			System.out
					.println("Share incident mail are sent to: ck@yopmail.com, chandan@yopmail.com, test@yopmail.com");
			ExcelWrite.writeSanitySheet(SanitySheet, 27, 1, "Pass");
			Thread.sleep(10000);
		}

	}

	public void clickIncidentActionsClose() throws InterruptedException, IOException {

		if (dropdownIncidentAction().isDisplayed()) {
			dropdownIncidentAction().click();
			incidentActionClose().click();
			Thread.sleep(2000);
			System.out.println("Event action closed");

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

	public void enterIncidentActionResponse() throws InterruptedException, IOException {

		if (txtIncidentActionResponse().isDisplayed()) {
			txtIncidentActionResponse().click();
			txtIncidentActionResponse().sendKeys("Its a False Alarm");
			Thread.sleep(2000);
			btnSaveIncidentResponse().click();
			ExcelWrite.writeSanitySheet(SanitySheet, 38, 1, "Pass");
		}
	}

}
