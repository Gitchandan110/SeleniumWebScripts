package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPL;
import junit.framework.Assert;

public class SK_CreateVisitorsBL extends SK_VisitorsPL {

	public void verifyCreateVisitors() {

		try {
				Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
				System.out.println("Landed on Create Visitors Page");
			if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
				Base.highLightElement(driver, btnCountryCode());
				btnCountryCode().click();
				Thread.sleep(3000);
				CountryCodeIndia().click();
				System.out.println("Country Code Selected");
				
			}

			if (txtMobile() != null && txtMobile().isDisplayed()) {
				Base.highLightElement(driver, txtMobile());
				txtMobile().sendKeys("8178041681");
				Base.takeScreenShot("Create Visitors");
				btnSubmit().click();
				Thread.sleep(3000);
				
			}

			if (txtFirstName() != null && txtFirstName().isDisplayed()) {
				Base.highLightElement(driver, txtFirstName());
				txtFirstName().clear();
				txtFirstName().sendKeys("ckvisitorWithApp");
				System.out.println("txtFirstName() Pass");
				txtLastName().clear();
				txtLastName().sendKeys("SK");
				txtCompanyName().clear();
				txtCompanyName().sendKeys("Netsutra");
				ddHost().click();
				ddHost().sendKeys("Lackorg@yopmail.com");
				selectHost().click();
				radioSafetyKuvrrApp().click();
				txtNotes().click();
				txtNotes().sendKeys("Visitor Notes");
				Base.takeScreenShot("Create Visitors");
				Base.scrollEndofthePage(driver);
				ddVisitorPassType().click();
				Thread.sleep(2000);
				optionPassType().click();
				Thread.sleep(2000);
				Base.highLightElement(driver, btnCanceIssueVisitorPass());
			//	btnSubmitCreateVisitor().click();
				btnCanceIssueVisitorPass().click();
				Thread.sleep(5000);
				
		
			}
		} catch (Exception e) {

			System.out.println("clickBtnNewVisitor()" + e.getMessage());

		}
	}
}
