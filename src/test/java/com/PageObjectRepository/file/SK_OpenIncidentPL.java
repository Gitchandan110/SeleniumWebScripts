package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_OpenIncidentPL extends Base {

	public WebElement IncomingIncident() {

		try {
			By incomingIncident = By.xpath(("//td[contains(., ' Incoming ')]"));
			return driver.findElement(incomingIncident);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement OpenIncident() {

		try {
			By openIncident = By.xpath("//td[contains(., ' Open')]");
			return driver.findElement(openIncident);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public WebElement Incident911() {

		try {
			By inc911 = By.xpath("//div/img[@title='911']");
			return driver.findElement(inc911);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public WebElement logoKuvrr() {

		try {
			By logo = By.xpath("//span[@class='logo']");
			return driver.findElement(logo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement videoContainer() {

		try {
			By video = By.xpath("//div[@id='video-container']");
			return driver.findElement(video);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement iconShareIncident() {

		try {
			By share = By.xpath("//span[@class='share']//a[@id='share-link']");
			return driver.findElement(share);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement shareIncidentEmailfield() {

		try {
			By emailtxt = By.xpath("//textarea[@id='share-recipient-emails']");
			return driver.findElement(emailtxt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnSubmitShareIncident() {

		By share = By.xpath("//input[@name='share-submit']");
		return driver.findElement(share);

	}

	public WebElement dropdownIncidentAction() {

		By ddeventAction = By.xpath("//select[@id='incident-action-select']");
		return driver.findElement(ddeventAction);

	}

	public WebElement incidentActionClose() {

		By closeoption = By.xpath("//select[@id='incident-action-select']//option[@value='1']");
		return driver.findElement(closeoption);
	}

	public WebElement dropdownIncidentResolution() {

		By ddeventAction = By.xpath("//select[@id='incident-resolution-select']");
		return driver.findElement(ddeventAction);

	}

	public WebElement incidentResolutionFalseAlarm() {

		By closeoption = By.xpath("//select[@id='incident-resolution-select']//option[@value='3']");
		return driver.findElement(closeoption);
	}

	public WebElement txtIncidentActionResponse() {

		By txtIA = By.xpath("//textarea[@id='incident-action-response']");
		return driver.findElement(txtIA);

	}

	public WebElement btnSaveIncidentResponse() {

		By btnSave = By.xpath("//button[@class='kv-btn kv-btn-primary']");
		return driver.findElement(btnSave);

	}

	public WebElement btnSmartResponse() {

		By smartResponse = By.xpath("//a[@id='quick-responses-button']");
		return driver.findElement(smartResponse);
	}

	public WebElement chatSmartResponse() {

		By chat = By.xpath("//div[@id='quick-responses']//ul//li//span[contains(text(),'Are you OK')]");
		return driver.findElement(chat);
	}

	public WebElement txtSmartResponse() {

		By txtSR = By.cssSelector("input[name='message'][id='message']");
		return driver.findElement(txtSR);
	}

	public WebElement btnSendSmartResponse() {

		By txtSR = By.xpath("//div[@class='field submit-field']//input[@name='submit']");
		return driver.findElement(txtSR);
	}

	public WebElement txtEventNotes() {

		By txtEN = By.cssSelector("textarea[class='notes_message'][id='notes-message']");
		return driver.findElement(txtEN);
	}

	public WebElement btnSaveEventNotes() {

		By txtSR = By.xpath("//div[@class='field submit-field']//input[@name='notes-submit']");
		return driver.findElement(txtSR);
	}

}
