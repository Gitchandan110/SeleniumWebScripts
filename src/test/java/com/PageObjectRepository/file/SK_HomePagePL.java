package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_HomePagePL extends Base {
	
	public WebElement tabClosedIncident() {
		
		By tabClosed=By.xpath("//ul[@class='nav nav-tabs incidents-tabs']//*[contains(text(),'Closed')]");
		return driver.findElement(tabClosed);
		
		
	}
	
	
	public WebElement HamburgerMenu() {
		
		By hamburgerMenu= By.cssSelector("div[id='hamburger']");
		
		return driver.findElement(hamburgerMenu);
		
	}
	
	
	public WebElement LinkOrganization() {
		
		By linkOrganization= By.xpath("//a[@href='/organization/']");
		
	//	By linkOrganization= By.cssSelector("a[href='/organization/']");
		
		return driver.findElement(linkOrganization);
	}

}
