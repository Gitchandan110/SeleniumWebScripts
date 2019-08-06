package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SafetyKuvrrOpenIncidentPL extends Base{
	
	
	public WebElement IncomingIncident() {
		
		By incomingIncident=By.xpath(("//td[contains(., ' Incoming ')]"));
		return driver.findElement(incomingIncident);	
		}
		
	
	
	public WebElement OpenIncident() {
		
		By openIncident=By.xpath("//td[contains(., ' Open')]");
		return driver.findElement(openIncident);
		
		
	}
	

}
