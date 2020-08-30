package com.BussinessFlow.file;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_EventScreenPO;

public class SK_EventScreenBL extends SK_EventScreenPO {

	String SanitySheet = "Sanity_SK";

	public void verifyVideoContainer() throws IOException, InterruptedException {

		System.out.println("Waiting for Video Screen");
		Base.waitFor180Seconds(videoContainer());
		System.out.println(SystemTime());
		Base.scrolltoElement(driver, videoContainer());
		Thread.sleep(10000);
		
	}

	
	public void verifySmartResponse() throws InterruptedException, IOException {

		try {
			Base.scrolltoElement(driver, chatRoom());
			if (txtSmartResponse().isDisplayed()) {
			txtSmartResponse().click();
			txtSmartResponse().sendKeys("Test Threat Keyword like: depressed, weapon, trafficking, theft, suicide, terror, attack, fire, threat, trap, knife ");
		
			btnSendSmartResponse().click();
			Thread.sleep(8000);
		
			if (btnSmartResponse().isDisplayed()) {
				btnSmartResponse().click();
				Thread.sleep(2000);
				Base.highLightElement(driver, chatSmartResponse());
				Base.takeScreenShot("Incident Screen");
			}
				Actions actions = new Actions(this.driver);
				actions.moveToElement(chatSmartResponse());
				Thread.sleep(9000);
				Base.takeScreenShot("Incident Screen");
				chatSmartResponse().click();
				Thread.sleep(8000);
				Base.takeScreenShot("Incident Screen");
				System.out.println("SmartResponse chat text submitted");
				Base.takeScreenShot("Incident Screen");
				ExcelWrite.writeSanitySheet(SanitySheet, 14, 1, "Pass");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in clickSmartResponse()" + e.getMessage());
		}
	}

	public void enterEventNotes() throws InterruptedException, IOException {

		try {
			if (txtEventNotes().isDisplayed()) {
				txtEventNotes().click();
				txtEventNotes().sendKeys("Be careful as criminals always carrying anything like Bomb, Knife, Gun, and they can do gun Shot, Fire, Goon, Acid Attack, Stone Pelting");
				btnSaveEventNotes().click();
				Base.takeScreenShot("Incident Screen");
				Thread.sleep(2000);
				System.out.println("Event Notes sent");
				ExcelWrite.writeSanitySheet(SanitySheet, 15, 1, "Pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in enterEventNotes()" + e.getMessage());
		}
	}

	public void clickIconShareIncident() throws InterruptedException {

		try {
			if (iconShareIncident().isDisplayed()) {
				iconShareIncident().click();
				Thread.sleep(2000);
				System.out.println("Share Incident icon is found and clicked");

			}

			else {

				System.out.println("Unable to Share an incident");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void submitShareIncident() throws InterruptedException, IOException {

		try {
			if (shareIncidentEmailfield().isDisplayed()) {
				shareIncidentEmailfield().click();
				shareIncidentEmailfield().sendKeys("ck@yopmail.com;chandan@yopmail.com;test@yopmail.com");
				btnSubmitShareIncident().click();
				Base.takeScreenShot("Incident Screen");
				Thread.sleep(2000);
				System.out.println(
						"Share incident mail are sent to: ck@yopmail.com, chandan@yopmail.com, test@yopmail.com");
				ExcelWrite.writeSanitySheet(SanitySheet, 27, 1, "Pass");
				Thread.sleep(10000);
				driver.switchTo().alert().accept();
				btnCloseEventView().click();
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickIncidentActionsClose() throws InterruptedException, IOException {

		try {
			if (dropdownIncidentAction().isDisplayed()) {
				dropdownIncidentAction().click();
				incidentActionClose().click();
				Thread.sleep(2000);
				System.out.println("Event action closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickIncidentResolutionFalseAlarm() throws InterruptedException {

		try {
			if (dropdownIncidentResolution().isDisplayed()) {
				dropdownIncidentResolution().click();
				incidentResolutionFalseAlarm().click();
				Thread.sleep(2000);
				System.out.println("Incident Resolution: False Alarm selected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterIncidentActionResponse() throws InterruptedException, IOException {

		try {
			if (txtIncidentActionResponse().isDisplayed()) {
				txtIncidentActionResponse().click();
				txtIncidentActionResponse().sendKeys("Its a False Alarm");
				btnSaveIncidentResponse().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Incident Screen Action");
				ExcelWrite.writeSanitySheet(SanitySheet, 38, 1, "Pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
