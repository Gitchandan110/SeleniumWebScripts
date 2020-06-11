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
import com.PageObjectRepository.file.SK_OpenIncidentPL;

public class SK_OpenIncidentBL extends SK_OpenIncidentPL {

	SK_OpenIncidentPL OpenIncidentPL;
	String SanitySheet = "Sanity_SK";

	public void clickIncomingIncident() throws InterruptedException {

		try {

			if (IncomingIncident() != null && IncomingIncident().isDisplayed()) {

				ExcelWrite.writeSanitySheet(SanitySheet, 9, 1, "Pass");
				Base.scrolltoElement(driver, IncomingIncident());
				ExcelWrite.writeSanitySheet(SanitySheet, 17, 1, "Pass");
				Base.takeScreenShot("Incoming Incident");
				Thread.sleep(3000);
				Base.highLightElement(driver, IncomingIncident());
				ExcelWrite.writeSanitySheet(SanitySheet, 32, 1, "Pass");
				Base.takeScreenShot("Active Screen");
				Thread.sleep(2000);
				IncomingIncident().click();
				System.out.println("Incoming Incident found and selected");
				ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
				Thread.sleep(10000);
				Base.manageChildWindow();

			} else {

				System.out.println("No Incoming Incident Found Now Searching for Open Incident");

				if (OpenIncident() != null && OpenIncident().isDisplayed()) {
					ExcelWrite.writeSanitySheet(SanitySheet, 9, 1, "Pass");
					Base.scrolltoElement(driver, OpenIncident());
					ExcelWrite.writeSanitySheet(SanitySheet, 17, 1, "Pass");
					Thread.sleep(3000);
					Base.highLightElement(driver, OpenIncident());
					ExcelWrite.writeSanitySheet(SanitySheet, 32, 1, "Pass");
					Base.takeScreenShot("Open Incident");
					Thread.sleep(2000);
					OpenIncident().click();
					System.out.println("Open Incident found and selected");
					ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
					Thread.sleep(5000);
					Base.manageChildWindow();

				} else {

					System.out.println("No Open Incident Found");
				}
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyVideoContainer() throws IOException, InterruptedException {

		System.out.println("Waiting for Video Screen");
		Base.waitFor180Seconds(videoContainer());
		System.out.println(SystemTime());
		Base.scrolltoElement(driver, videoContainer());
		Thread.sleep(10000);
		Base.takeScreenShot("Incident Screen");

	}

	public void click911Incident() throws InterruptedException {

		try {

			if (Incident911() != null && Incident911().isDisplayed()) {
				Base.scrolltoElement(driver, Incident911());
				Thread.sleep(3000);
				Base.highLightElement(driver, Incident911());
				Base.takeScreenShot("911 Incident");
				ExcelWrite.writeSanitySheet(SanitySheet, 20, 1, "Pass");
				Thread.sleep(2000);
				Incident911().click();
				System.out.println("911 Incident found and selected");
				ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
				Thread.sleep(5000);
				Base.manageChildWindow();

			} else {

				System.out.println("No 911 Incident Found");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySmartResponse() throws InterruptedException, IOException {

		try {
			Base.scrolltoElement(driver, chatRoom());
			if (txtSmartResponse().isDisplayed()) {
			txtSmartResponse().click();
			txtSmartResponse().sendKeys("Test Threat Keyword like: depressed, whore, weapon, trafficking, theft, suicide, sad, rude, pussy \r\n" + 
					" punch, prostitute, pistol, pimp, pervert, passed out, molesting, molestation, hitting, gun, fuck,fighting, fight, fallen, escort, drunk, drugs, \r\n" + 
					"drinking, creep, booze, boobs,bomb, bitch, asshole, assault, alcohol, tits, cunt, mofo, faint,pot, heroine, graffiti, spray, nigger, rifle, shotgun, goon, snatch, terror, attack, fire, threat, trap, knife ");
		
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
				txtEventNotes().sendKeys("Be careful as criminals always carrying anything like Bomb, Knife, Gun, and they can do gun Shot, Fire, Firing, Attack Terrorist, Attacking, Terror, Missile Attack, Threat, Trap, Snatch, Robbery, Bank Loot, Assault, Goon, Acid Attack, Stone Pelting");
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
				Base.takeScreenShot("Incident Screen");
				Thread.sleep(2000);
				btnSaveIncidentResponse().click();
				ExcelWrite.writeSanitySheet(SanitySheet, 38, 1, "Pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectAllActiveEvents() {

		try {

			Base.scrolltoElement(driver, incidentTable());
			int countActiveEvents = allActiveEvents().size();

			System.out.println("Total number of New Tip Incidents are : " + countActiveEvents);

			for (int i = 1; i <= countActiveEvents; i++) {

				WebElement checkbox = driver
						.findElement(By.xpath("//tbody//tr[" + i + "]//td//input[@type='checkbox']"));
				String titleTip = driver.findElement(By.xpath("//tbody//tr[" + i + "]//td[10]//div//img"))
						.getAttribute("title");
				System.out.println("Tip Tytle is : " + titleTip);
				checkbox.click();

			}

		} catch (Exception e) {

			System.out.println(e);
		}

	}
	
	
	public void selectActiveEvents() {

		try {

			Base.scrolltoElement(driver, incidentTable());

			WebElement checkbox = driver.findElement(By.xpath("//tbody//tr[1]//td//input[@type='checkbox']"));

			checkbox.click();

		} catch (Exception e) {

			System.out.println(e);
		}

	}
	
	public void verifyFilter() {

		try {
			if (btnFilterActiveEvents() != null && btnFilterActiveEvents().isDisplayed()) {
				btnFilterActiveEvents().click();
				Thread.sleep(2000);
				System.out.println("Filter button found and clicked");

			}

			else {

				System.out.println("Filter button not found");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void verifyCloseAction() {

		try {
			if (btnCloseEvents() != null && btnCloseEvents().isDisplayed()) {
				btnCloseEvents().click();
				Thread.sleep(2000);
				System.out.println("Close button found and clicked");
				dropdownResolution().click();
				optionResolution().click();
				txtResponse().sendKeys(" Both 911 and Medical Emergencies, which are automatically closed by the system when triggered, will continue to show in the Active events tab for up to five minutes from event start. After the duration, these events will show up only in the Closed tab.");
				Base.takeScreenShot("Action Close");
				btnSubmit().click();
				Thread.sleep(5000);
				
			}

			else {

				System.out.println("Close button not found");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifyShareIncident() {

		try {
			if (btnShareIncident() != null && btnShareIncident().isDisplayed()) {
				btnShareIncident().click();
				Thread.sleep(2000);
				System.out.println("Share Linkn found and clicked");
				txtEmailField().click();
				txtEmailField().sendKeys("ck@yopmail.com;chandan.kumar@netsutra.com");
				Base.takeScreenShot("Share Active Incident");
				btnShare().click();
				Thread.sleep(5000);
				
			}

			else {

				System.out.println("Share Active Incident not working");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
