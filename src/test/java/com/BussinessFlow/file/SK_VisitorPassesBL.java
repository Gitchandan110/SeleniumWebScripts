package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPL;
import junit.framework.Assert;

public class SK_VisitorPassesBL extends SK_VisitorsPL {

	public void verifyManageVisitorPasses() {

		try {
			if (txtManageVisitorPasses() != null && txtManageVisitorPasses().isDisplayed()) {
				Assert.assertEquals("Manage Visitor Passes", driver.getTitle());
				System.out.println("Landed on Manage Visitors Passes");
				Base.takeScreenShot("Manage Visitor Passes");
			}

			else {

				System.out.println("Unable to find Manage Visitors Passes");
			}

			if (filterLastName() != null && filterLastName().isDisplayed()) {
				Base.highLightElement(driver, filterLastName());
				filterLastName().sendKeys("SK");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("Last Name Filter Pass");
				Base.waitFor30Seconds(filterFirstName());
			}

			if (filterFirstName() != null && filterFirstName().isDisplayed()) {
				Base.highLightElement(driver, filterFirstName());
				filterFirstName().sendKeys("V");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("filterFirstName() Pass");
				Base.waitFor30Seconds(filterEmail());
			}

			if (filterEmail() != null && filterEmail().isDisplayed()) {
				Base.highLightElement(driver, filterEmail());
				filterEmail().sendKeys("vapp@yopmail.com");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Manage Visitors");
				btnClear().click();
				System.out.println("filterEmail() Pass");
				Base.waitFor30Seconds(filterMobileNumber());
			}

			if (filterMobileNumber() != null && filterMobileNumber().isDisplayed()) {
				Base.highLightElement(driver, filterMobileNumber());
				filterMobileNumber().sendKeys("8588026657");
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

	public void clickIssueVisitorPass() throws InterruptedException {

		try {
			if (linkIssueVisitorPass() != null && linkIssueVisitorPass().isDisplayed()) {
				linkIssueVisitorPass().click();
				Thread.sleep(5000);
			}

		} catch (Exception e) {

			System.out.println("IssueVisitorPass()" + e.getMessage());

		}
	}
}
