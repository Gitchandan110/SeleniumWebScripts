package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_MenuListPL extends Base {

	public WebElement menuOrganization() {

		By MenuOrg = By.xpath("//a[@href='/organization/']");

		// By linkOrganization= By.cssSelector("a[href='/organization/']");

		return driver.findElement(MenuOrg);
	}

	public WebElement menuVisitorManagement() {

		try {
			By menuVisitor = By.xpath("//li[@class='system-nav-item-guests']");
			return driver.findElement(menuVisitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public WebElement menuVisitorPassType() {

		try {
			By menuVisitorPass = By.xpath("//a[@href='/visitor_management/visitor_passtypes/']");
			return driver.findElement(menuVisitorPass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	


}
