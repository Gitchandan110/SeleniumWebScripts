package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ManageTemplatesPL;

import junit.framework.Assert;

public class SK_ManageTemplatesBL extends SK_ManageTemplatesPL {
	

		public void verifyManageTemplates() {

			try {
				if (pageManageTemplate() != null && pageManageTemplate().isDisplayed()) {
					Assert.assertEquals("Manage Templates", driver.getTitle());
					System.out.println("Landed on Manage Templates Page");
					Base.takeScreenShot("Manage Templates");
				}

				else {

					System.out.println("Unable to find Manage Templates Page");
				}

				if (filterTemplateTiltle() != null && filterTemplateTiltle().isDisplayed()) {
					Base.highLightElement(driver, filterTemplateTiltle());
					filterTemplateTiltle().sendKeys("NTGeo");
					btnFilter().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Templates");
					btnClear().click();
					System.out.println("filterTemplateTiltle() Pass");
					Base.waitFor30Seconds(filterStatus());
				}

					if (filterStatus() != null && filterStatus().isDisplayed()) {
					Base.highLightElement(driver, filterStatus());
					filterStatus().click();
					Thread.sleep(5000);
					filterActiveStatus().click();
					btnFilter().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Templates");
					btnClear().click();
					System.out.println("filterActiveStatus() Pass");
					Base.waitFor30Seconds(filterStatus());
					filterStatus().click();
					filterInactiveStatus().click();
					btnFilter().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Templates");
					btnClear().click();
					System.out.println("filterInactiveStatus() Pass");
					Thread.sleep(5000);

				}
				if (linkDetails() != null && linkDetails().isDisplayed()) {
					System.out.println("linkDetails found");
					linkDetails().click();
					Thread.sleep(5000);
					Base.takeScreenShot("Manage Templates");
					Base.scrollEndofthePage(driver);
					Thread.sleep(3000);
					btnCancelDetails().click();
					Thread.sleep(5000);

				}
			}

			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Exception in Page Manage Template:" + e.getMessage());
			}
		}

		public void clickLinkCreateTemplate() throws InterruptedException {

			try {
				if (linkCreateTemplate()  != null && linkCreateTemplate() .isDisplayed()) {

					linkCreateTemplate() .click();
					Thread.sleep(5000);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		/*public void fillCreateVisitorPassType() throws InterruptedException {

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

*/
}
