package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_OpenIncidentPL extends Base {

	public WebElement IncomingIncident() {

		try {
			By incomingIncident = By.xpath(("//td[contains(., 'Incoming')]"));
			return driver.findElement(incomingIncident);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement InvestigatingEvent() {

		try {
			By investigating = By.xpath(("//td[contains(., 'Investigating')]"));
			return driver.findElement(investigating);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement OpenEvent() {

		try {
			By openEvent = By.xpath(("//tr[@class='condensed-profile profile']"));
			return driver.findElement(openEvent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public List<WebElement> allActiveEvents() {

		try {
			By allEvents = By.xpath(("//table[@class='incident-responsive'][@id='incident-table']//tbody//tr"));
			return driver.findElements(allEvents);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement incidentTable() {

		try {
			By incidentTable = By.xpath(("//table[@class='incident-responsive'][@id='incident-table']"));
			return driver.findElement(incidentTable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	// input[@name='selected_event'][@type='checkbox']

	public WebElement chkbxIncident() {

		try {
			By chkbxIncident = By.xpath("//input[@name='selected_event'][@type='checkbox']");
			return driver.findElement(chkbxIncident);
		} catch (Exception e) {
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

	public WebElement mapContainer() {

		try {
			By map = By.xpath("//div[@class='profile-map-container']");
			return driver.findElement(map);
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

	public WebElement chatRoom() {

		By chatRoom = By.xpath("//div[@class='chat-container'][@id='chat']");
		return driver.findElement(chatRoom);
	}

	public WebElement btnSmartResponse() {

		By smartResponse = By.xpath("//a[@id='quick-responses-button']");
		return driver.findElement(smartResponse);
	}

	public WebElement chatSmartResponse() {

		By chat = By
				.xpath("//div[@id='quick-responses']//ul//li//span[contains(text(),'Keep speaking we can hear you')]");
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

	public WebElement btnFilterActiveEvents() {

		By Filter = By.xpath("//input[@type='button'][@name='filter']");
		return driver.findElement(Filter);
	}

	public WebElement btnCloseEvents() {

		By Close = By.xpath("//a[@id='incidentClose-link'][@title='Close Events']");
		return driver.findElement(Close);
	}
	
	
	public WebElement btnShareIncident() {

		By Share = By.xpath("//a[@id='share-link'][@title='Share']");
		return driver.findElement(Share);
	}
	
	
	

	public WebElement dropdownResolution() {

		By Resolution = By.xpath("//select[@id='action_resolution']");
		return driver.findElement(Resolution);
	}

	
	public WebElement txtEmailField() {

		By EmailField = By.xpath("//textarea[@id='share-recipient-emails']");
		return driver.findElement(EmailField);
	}
	
	
	public WebElement optionResolution() {

		By Resolution = By
				.xpath("//select[@id='action_resolution']//option[contains (text(),'Contacted Organization')]");
		return driver.findElement(Resolution);
	}
	
	
	public WebElement txtResponse() {

		By Response = By.xpath("//textarea[@id='events_action_response']");
		return driver.findElement(Response);
	}
	

	public WebElement btnSubmit() {
		
		By Submit = By.xpath("//input[@id='filter-submit'][@class='btn submit']");
		return driver.findElement(Submit);
	}
	
	public WebElement btnShare() {
		
		By Share = By.xpath("//input[@id='share-submit'][@class='btn submit']");
		return driver.findElement(Share);
	}
	
}
