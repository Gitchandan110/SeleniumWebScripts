package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPO;
import junit.framework.Assert;

public class SK_IssueVisitorPassBL extends SK_VisitorsPO {

	public void verifyIssueVisitorPass() {

		try {
			Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
			System.out.println("Landed on Issue A Visitor Pass Page");
			if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
				Base.highLightElement(driver, btnCountryCode());
				btnCountryCode().click();
				Thread.sleep(3000);
				Base.FullPageScreenShot("IssueVisitorPass_CountryCode");
				CountryCodeIndia().click();
				System.out.println("Country Code Selected");

			}

			if (txtMobile() != null && txtMobile().isDisplayed()) {
				Base.highLightElement(driver, txtMobile());
				txtMobile().sendKeys("0000123456");
				btnCountryCode().click();
				Thread.sleep(2000);
				Base.FullPageScreenShot("IssueVisitorPass_CountryCode");
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
				txtEmail().click();
				txtEmail().sendKeys("Vtest@yopmail.com");
				radioSafetyKuvrrApp().click();
				chkbxERP().click();
				chkbxMaps().click();
				txtNotes().click();
				txtNotes().sendKeys("Visitor Notes");
				Base.scrollEndofthePage(driver);
				ddVisitorPassType().click();
				Thread.sleep(2000);
				Base.takeScreenShot("IssueVisitorPass");
				optionPassType().click();
				Thread.sleep(2000);
				Base.FullPageScreenShot("Create Visitor Pass");
				Base.highLightElement(driver, btnSubmitCreateVisitor());
				btnSubmitCreateVisitor().click();
				Thread.sleep(5000);

				if (ErrorMessage().isDisplayed()) {
					System.out.println("Create Visitor Pass Fail");
					Base.FullPageScreenShot("Create Visitor Pass Fail");
				}

			}
		} catch (Exception e) {

			System.out.println("verifyIssueVisitorPass" + e.getMessage());

		}
	}
}
