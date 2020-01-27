package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorPassTypePL;

import junit.framework.Assert;

public class SK_VisitorPassTypesBL extends SK_VisitorPassTypePL {

	public void verifyManageVisitorPassTypes() {

		try {
			if (pageManageVisitorPassTypes() != null && pageManageVisitorPassTypes().isDisplayed()) {
				Assert.assertEquals("Manage Visitor Pass Types", driver.getTitle());
				System.out.println("Landed on ManageVisitorPassTypes Page");
				Base.takeScreenShot("ManageVisitorPassTypes");
			}

			else {

				System.out.println("Unable to find ManageVisitorPassTypes Page");
			}

			if (filterPassTypeTitle() != null && filterPassTypeTitle().isDisplayed()) {
				Base.highLightElement(driver, filterPassTypeTitle());
				filterPassTypeTitle().sendKeys("VP");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ManageVisitorPassTypes");
				btnClear().click();
				System.out.println("filterPassTypeTitle Pass");
				Base.waitFor30Seconds(filterNumberOfDays());
			}

			if (filterNumberOfDays() != null && filterNumberOfDays().isDisplayed()) {
				Base.highLightElement(driver, filterNumberOfDays());
				filterNumberOfDays().sendKeys("365");
				Thread.sleep(5000);
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ManageVisitorPassTypes");
				btnClear().click();
				System.out.println("filterNumberOfDays Pass");
				Base.waitFor30Seconds(ddStatus());
			}

			if (ddStatus() != null && ddStatus().isDisplayed()) {
				Base.highLightElement(driver, ddStatus());
				ddStatus().click();
				Thread.sleep(5000);
				ddActiveStatus().click();
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ManageVisitorPassTypes");
				btnClear().click();
				System.out.println("ddActiveStatus() Pass");
				Base.waitFor30Seconds(ddStatus());
				Base.highLightElement(driver, ddStatus());
				ddStatus().click();
				ddInactiveStatus().click();
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ManageVisitorPassTypes");
				btnClear().click();
				System.out.println("ddInActiveStatus() Pass");
				Thread.sleep(5000);

			}
			if (linkDetails() != null && linkDetails().isDisplayed()) {
				System.out.println("linkDetails found");
				linkDetails().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ManageVisitorPassTypes");
				Base.scrollEndofthePage(driver);
				Thread.sleep(3000);
				btnCancelDetails().click();
				Thread.sleep(5000);

			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in Page ManageVisitorPassTypes:" + e.getMessage());
		}
	}

	public void clickButtonCreateVisitorPassType() throws InterruptedException {

		try {
			if (btnCreateVisitorPassType() != null && btnCreateVisitorPassType().isDisplayed()) {

				btnCreateVisitorPassType().click();
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fillCreateVisitorPassType() throws InterruptedException {

		try {
			Assert.assertEquals("Create Visitor Pass Type", driver.getTitle());
			System.out.println("Page title matched");
			if (txtVisitorPassTypeTiltle() != null && txtVisitorPassTypeTiltle().isDisplayed()) {
				txtVisitorPassTypeTiltle().sendKeys("VP: "+ Base.SystemDateTime());
				Thread.sleep(2000);
				txtDiscriptionVisitorPassType().click();
				txtDiscriptionVisitorPassType().sendKeys("VPDescription: "+ Base.SystemTime());
				ddTimeZone().click();
				Thread.sleep(2000);
				txtSearchTimeZone().sendKeys("Asia/Kolkata");
				timeZoneAsiaKolkata().click();
				txtNumberOfDays().sendKeys("1");
				Thread.sleep(2000);
				txtEmailSubject().sendKeys("Email Invite");
				Thread.sleep(2000);
				btnMonitorEverywhere().click();
				Thread.sleep(3000);
				Base.scrollEndofthePage(driver);
				Base.highLightElement(driver, btnSubmit());
				btnSubmit().click();
			//	Base.highLightElement(driver, btnCancel());
				Thread.sleep(2000);
			//	btnCancel().click();
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void editVisitorPassType() throws InterruptedException {

		try {
			
			if (btnEditVisitorPassType() != null && btnEditVisitorPassType().isDisplayed()) {
				btnEditVisitorPassType().click();
				Thread.sleep(5000);
				txtVisitorPassTypeTiltle().clear();
				txtVisitorPassTypeTiltle().sendKeys("VP: "+ Base.SystemDateTime());
				Thread.sleep(2000);
				txtDiscriptionVisitorPassType().clear();
				txtDiscriptionVisitorPassType().sendKeys("VPDescription:"+ Base.SystemTime());
				ddTimeZone().click();
				Thread.sleep(2000);
				txtSearchTimeZone().sendKeys("Asia/Kolkata");
				Thread.sleep(2000);
				timeZoneAsiaKolkata().click();
				txtNumberOfDays().clear();
				txtNumberOfDays().sendKeys("3");
				Thread.sleep(2000);
				txtEmailSubject().sendKeys("Email Subject");
				btnMonitorEverywhere().click();
				Thread.sleep(3000);
				Base.scrollEndofthePage(driver);
			//	btnSubmit().click();
				Base.highLightElement(driver, btnCancel());
				Thread.sleep(2000);
				btnCancel().click();
				System.out.println("editVisitorPassType() Pass");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
