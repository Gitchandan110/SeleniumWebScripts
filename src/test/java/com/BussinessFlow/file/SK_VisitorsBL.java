package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPL;
import junit.framework.Assert;

public class SK_VisitorsBL extends SK_VisitorsPL {

	public void verifyPageManageVisitors() {

		try {
			if (pageManageVisitors() != null && pageManageVisitors().isDisplayed()) {
				Assert.assertEquals("Manage Visitors", driver.getTitle());
				System.out.println("Landed on Manage Visitors Page");
				Base.takeScreenShot("Manage Visitors");
			}

			else {

				System.out.println("Unable to find Manage Visitors Page");
			}

			if (filterLastName() != null && filterLastName().isDisplayed()) {
				Base.highLightElement(driver, filterLastName());
				filterLastName().sendKeys("SKTest");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("Last Name Filter Pass");
				Base.waitFor30Seconds(filterFirstName());
			}

			if (filterFirstName() != null && filterFirstName().isDisplayed()) {
				Base.highLightElement(driver, filterFirstName());
				filterFirstName().sendKeys("test v bb");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("filterFirstName() Pass");
				Base.waitFor30Seconds(filterEmail());
			}

			if (filterEmail() != null && filterEmail().isDisplayed()) {
				Base.highLightElement(driver, filterEmail());
				filterEmail().sendKeys("visitorTest@yopmail.com");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("filterEmail() Pass");
				Base.waitFor30Seconds(filterMobileNumber());
			}

			if (filterMobileNumber() != null && filterMobileNumber().isDisplayed()) {
				Base.highLightElement(driver, filterMobileNumber());
				filterMobileNumber().sendKeys("6655778899");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("filterEmail() Pass");
				Thread.sleep(5000);

				if (ddType() != null && ddType().isDisplayed()) {
					ddType().click();
					typeWithApp().click();
					btnFilter().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Visitors");
					btnClear().click();
					Thread.sleep(3000);
					ddType().click();
					typeWithoutApp().click();
					btnFilter().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Visitors");
					btnClear().click();
					System.out.println("Type Pass");
					Thread.sleep(5000);

				}
				if (linkDetails() != null && linkDetails().isDisplayed()) {
					System.out.println("linkDetails found");
					linkDetails().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Visitors");
					Base.scrollEndofthePage(driver);
					Thread.sleep(3000);
					btnCancelDetails().click();
					Thread.sleep(5000);

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in Page Manage Visitors:" + e.getMessage());
		}
	}

	/*
	 * public void clickButtonCreateVisitorPassType() throws InterruptedException {
	 * 
	 * try { if (btnCreateVisitorPassType() != null &&
	 * btnCreateVisitorPassType().isDisplayed()) {
	 * 
	 * btnCreateVisitorPassType().click(); Thread.sleep(5000); } } catch (Exception
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * public void fillCreateVisitorPassType() throws InterruptedException {
	 * 
	 * try { Assert.assertEquals("Create Visitor Pass Type", driver.getTitle());
	 * System.out.println("Page title matched"); if (txtVisitorPassTypeTiltle() !=
	 * null && txtVisitorPassTypeTiltle().isDisplayed()) {
	 * txtVisitorPassTypeTiltle().sendKeys("Test Visitor Pass: "+
	 * Base.SystemDateTime()); Thread.sleep(2000);
	 * txtDiscriptionVisitorPassType().click();
	 * txtDiscriptionVisitorPassType().sendKeys("Visitor Pass Type Description: "+
	 * Base.SystemTime()); ddTimeZone().click(); Thread.sleep(2000);
	 * txtSearchTimeZone().sendKeys("Asia/Kolkata"); timeZoneAsiaKolkata().click();
	 * txtNumberOfDays().sendKeys("999"); Thread.sleep(2000);
	 * btnMonitorEverywhere().click(); Thread.sleep(3000); btnSubmit().click();
	 * System.out.println("fillCreateVisitorPassType() Pass"); Thread.sleep(5000); }
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * public void editVisitorPassType() throws InterruptedException {
	 * 
	 * try {
	 * 
	 * if (btnEditVisitorPassType() != null &&
	 * btnEditVisitorPassType().isDisplayed()) { btnEditVisitorPassType().click();
	 * Thread.sleep(5000); txtVisitorPassTypeTiltle().clear();
	 * txtVisitorPassTypeTiltle().sendKeys("Test Visitor Pass: "+
	 * Base.SystemDateTime()); Thread.sleep(2000);
	 * txtDiscriptionVisitorPassType().clear();
	 * txtDiscriptionVisitorPassType().sendKeys("Visitor Pass Type Description:"+
	 * Base.SystemTime()); ddTimeZone().click(); Thread.sleep(2000);
	 * txtSearchTimeZone().sendKeys("Asia/Kolkata"); Thread.sleep(2000);
	 * timeZoneAsiaKolkata().click(); txtNumberOfDays().clear();
	 * txtNumberOfDays().sendKeys("999"); Thread.sleep(2000);
	 * btnMonitorEverywhere().click(); Thread.sleep(3000); btnSubmit().click();
	 * System.out.println("editVisitorPassType() Pass"); Thread.sleep(5000); } }
	 * catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
	 * }
	 * 
	 * }
	 * 
	 */
}
