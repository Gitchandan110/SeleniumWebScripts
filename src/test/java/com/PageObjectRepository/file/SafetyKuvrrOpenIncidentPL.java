package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SafetyKuvrrOpenIncidentPL extends Base {

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

	public WebElement shareIncident() {

		By share = By.xpath("//a[@id='share-link']");
		return driver.findElement(share);

	}

	public WebElement shareIncidentForm() {

		By shareform = By.xpath("//form[@id='share-form']");
		return driver.findElement(shareform);
	}

	public WebElement shareIncidentEmailfield() {

		By emailtxt = By.xpath("//textarea[@id='share-recipient-emails']");
		return driver.findElement(emailtxt);
	}

}
