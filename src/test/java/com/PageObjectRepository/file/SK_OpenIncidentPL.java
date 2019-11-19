package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_OpenIncidentPL extends Base {

	public WebElement IncomingIncident() {

		By incomingIncident = By.xpath(("//td[contains(., ' Incoming ')]"));
		return driver.findElement(incomingIncident);

	}

	public WebElement OpenIncident() {

		By openIncident = By.xpath("//td[contains(., ' Open')]");
		return driver.findElement(openIncident);

	}

	public WebElement logoKuvrr() {

		By logo = By.xpath("//span[@class='logo']");
		return driver.findElement(logo);

	}

	public WebElement videoContainer() {

		By video = By.xpath("//div[@id='video-container']");
		return driver.findElement(video);

	}

	public WebElement iconShareIncident() {

		By share = By.xpath("//span[@class='share']//a[@id='share-link']");
		return driver.findElement(share);

	}

	public WebElement shareIncidentEmailfield() {

		By emailtxt = By.xpath("//textarea[@id='share-recipient-emails']");
		return driver.findElement(emailtxt);
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
}
