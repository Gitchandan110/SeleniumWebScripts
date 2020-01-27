package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPL;
import junit.framework.Assert;

public class SK_IssueVisitorPassBL extends SK_VisitorsPL {

	public void verifyIssueVisitorPass() {

		try {
				Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
				System.out.println("Landed on Issue A Visitor Pass Page");
				if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
				Base.highLightElement(driver, btnCountryCode());
				btnCountryCode().click();
				Thread.sleep(3000);
				CountryCodeIndia().click();
				System.out.println("Country Code Selected");
				
			}

			if (txtMobile() != null && txtMobile().isDisplayed()) {
				Base.highLightElement(driver, txtMobile());
				txtMobile().sendKeys("0000123456");
				Base.takeScreenShot("Issue A Visitor Pass");
				btnSubmit().click();
				Thread.sleep(3000);
				
			}

			if (txtFirstName() != null && txtFirstName().isDisplayed()) {
				Base.highLightElement(driver, txtFirstName());
				txtFirstName().clear();
				txtFirstName().sendKeys("V");
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
				Base.takeScreenShot("Issue A Visitor Pass");
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
