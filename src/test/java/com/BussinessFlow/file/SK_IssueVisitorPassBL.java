package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPO;
import junit.framework.Assert;

public class SK_IssueVisitorPassBL extends SK_VisitorsPO {

	public void verifyIssueVisitorPassWithSKApp() {
		
		DateFormat dateFormat = new SimpleDateFormat("ss");
		String timeString = dateFormat.format(new Date()).toString();
		

		try {
			Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
			System.out.println("Landed on Issue A Visitor Pass Page");
			if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
				Base.highLightElement(driver, btnCountryCode());
				btnCountryCode().click();
				Thread.sleep(3000);
				Base.takeScreenShot("IssueVisitorPass");
				CountryCodeIndia().click();
				System.out.println("Country Code Selected");

			}

			if (txtMobile() != null && txtMobile().isDisplayed()) {
				Base.highLightElement(driver, txtMobile());
				txtMobile().sendKeys("0012"+timeString+"56"+timeString);
			//	btnCountryCode().click();
				Thread.sleep(2000);
				Base.takeScreenShot("IssueVisitorPass");
				btnSubmit().click();
				Thread.sleep(3000);

			}

			if (txtFirstName() != null && txtFirstName().isDisplayed()) {
				Base.highLightElement(driver, txtFirstName());
				txtFirstName().sendKeys("Vsk");
				System.out.println("txtFirstName() entered");
				txtLastName().clear();
				txtLastName().sendKeys("SK");
				System.out.println("txtLastName() entered");
				txtCompanyName().clear();
				txtCompanyName().sendKeys("Netsutra");
				System.out.println("txtCompanyName() entered");
				ddHost().click();
				ddHost().sendKeys("Lackorg@yopmail.com");
				selectHost().click();
				System.out.println("selectHost() done");
				txtEmail().click();
				txtEmail().sendKeys("Visitor" +timeString+ "@yopmail.com");
				System.out.println("txtEmail() filled");
				
				radioSafetyKuvrrApp().click();
				
				System.out.println("radioSafetyKuvrrApp() selected");
				Thread.sleep(2000);
				chkbxERP().click();
				System.out.println("chkbxERP() selected");
				chkbxMaps().click();
				System.out.println("chkbxMaps() selected");
				txtNotes().click();
				txtNotes().sendKeys("Visitor Notes");
				System.out.println("txtNotes() entered");
				Thread.sleep(2000);
				Base.scrollEndofthePage(driver);
				ddVisitorPassType().click();
				Thread.sleep(2000);
				Base.takeScreenShot("IssueVisitorPass");
				PassTypeVP_10AM_8PM_365Days().click();
				System.out.println("ddVisitorPassType() selected");
				Thread.sleep(2000);
				Base.FullPageScreenShot("Create Visitor Pass");
				Base.highLightElement(driver, btnSubmitCreateVisitor());
				btnSubmitCreateVisitor().click();
				Thread.sleep(8000);

				if (ErrorMessage().isDisplayed()) {
					System.out.println("Create Visitor Pass Fail");
					Base.FullPageScreenShot("Create Visitor Pass Fail");
				}

			}
		} catch (Exception e) {

			System.out.println("verifyIssueVisitorPassWithSKApp" + e.getMessage());

		}
	}
	
	public void verifyIssueVisitorPassNotificationOnly() {
		
		DateFormat dateFormat = new SimpleDateFormat("ss");
		String timeString = dateFormat.format(new Date()).toString();
		

		try {
			Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
			System.out.println("Landed on Issue A Visitor Pass Page");
			if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
				Base.highLightElement(driver, btnCountryCode());
				btnCountryCode().click();
				Thread.sleep(3000);
				Base.takeScreenShot("IssueVisitorPass");
				CountryCodeIndia().click();
				System.out.println("Country Code Selected");

			}

			if (txtMobile() != null && txtMobile().isDisplayed()) {
				Base.highLightElement(driver, txtMobile());
				txtMobile().sendKeys("0012"+timeString+"56"+timeString);
			//	btnCountryCode().click();
				Thread.sleep(2000);
				Base.takeScreenShot("IssueVisitorPass");
				btnSubmit().click();
				Thread.sleep(3000);

			}

			if (txtFirstName() != null && txtFirstName().isDisplayed()) {
				Base.highLightElement(driver, txtFirstName());
				txtFirstName().sendKeys("Vsk");
				System.out.println("txtFirstName() entered");
				txtLastName().clear();
				txtLastName().sendKeys("SK");
				System.out.println("txtLastName() entered");
				txtCompanyName().clear();
				txtCompanyName().sendKeys("Netsutra");
				System.out.println("txtCompanyName() entered");
				ddHost().click();
				ddHost().sendKeys("Lackorg@yopmail.com");
				selectHost().click();
				System.out.println("selectHost() done");
				txtEmail().click();
				txtEmail().sendKeys("Visitor" +timeString+ "@yopmail.com");
				System.out.println("txtEmail() filled");
				
			/*	radioSafetyKuvrrApp().click();
				
				System.out.println("radioSafetyKuvrrApp() selected");
				Thread.sleep(2000);
				chkbxERP().click();
				System.out.println("chkbxERP() selected");
				chkbxMaps().click();
				System.out.println("chkbxMaps() selected");*/
				txtNotes().click();
				txtNotes().sendKeys("Visitor Notes");
				System.out.println("txtNotes() entered");
				Thread.sleep(2000);
				Base.scrollEndofthePage(driver);
				ddVisitorPassType().click();
				Thread.sleep(2000);
				Base.takeScreenShot("IssueVisitorPass");
				PassTypeVP_10AM_8PM_365Days().click();
				System.out.println("ddVisitorPassType() selected");
				Thread.sleep(2000);
				Base.FullPageScreenShot("Create Visitor Pass");
				Base.highLightElement(driver, btnSubmitCreateVisitor());
				btnSubmitCreateVisitor().click();
				Thread.sleep(8000);

				if (ErrorMessage().isDisplayed()) {
					System.out.println("Create Visitor Pass Notification Only Fail");
					Base.FullPageScreenShot("Create Visitor Pass Fail");
				}

			}
		} catch (Exception e) {

			System.out.println("verifyIssueVisitorPassNotificationOnly" + e.getMessage());

		}
	}
	
	
	
}
