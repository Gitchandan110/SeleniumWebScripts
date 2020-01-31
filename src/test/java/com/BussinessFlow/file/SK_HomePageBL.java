package com.BussinessFlow.file;

import java.util.Set;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_ERPPL;
import com.PageObjectRepository.file.SK_HomePagePL;
import com.PageObjectRepository.file.SK_MapPL;

public class SK_HomePageBL extends SK_HomePagePL {

	String SanitySheet = "Sanity_SK";
	SK_MapPL mapPl = new SK_MapPL();
	SK_ERPPL ERPL = new SK_ERPPL();

	public void verifyTabClosedIncident() {

		try {

			if (tabClosedIncident().isDisplayed()) {

				Base.highLightElement(driver, tabClosedIncident());
				tabClosedIncident().click();
				Thread.sleep(5000);

			} else {

				System.out.println("Closed Incident not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Closed Incident : " + ex.getStackTrace());
		}

	}

	public void verifyHamburgerMenu() {

		try {

			if (HamburgerMenu().isDisplayed() == true) {
				ExcelWrite.writeSanitySheet(SanitySheet, 7, 1, "Pass");
				Base.highLightElement(driver, HamburgerMenu());
				HamburgerMenu().click();
				ExcelWrite.writeSanitySheet(SanitySheet, 8, 1, "Pass");
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(7000);

			} else {

				System.out.println("Hamburger menu not found");
				ExcelWrite.writeSanitySheet(SanitySheet, 23, 2, "Fail");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Home Page Hamburger Menu : " + ex.getStackTrace());
		}

	}

	public void clickReports() {

		try {

			if (btnReports().isDisplayed() == true) {
				Base.scrolltoElement(driver, btnReports());
				Base.highLightElement(driver, btnReports());
				btnReports().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Reports");

			} else {

				System.out.println("Reports() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Reports() link : " + ex.getStackTrace());
		}

	}

	public void ViewMap() {

		try {

			if (btnMAP() != null && btnMAP().isDisplayed()) {
				Base.highLightElement(driver, btnMAP());
				String parentWindowId = driver.getWindowHandle();
				System.out.println("Parent Window ID is: " + parentWindowId);
				btnMAP().click();
				Thread.sleep(5000);

				// To iterate over all open windows

				Set<String> allWindows = driver.getWindowHandles();

				// To get the count of all open window

				int windowCount = allWindows.size();
				System.out.println("Total Map window count is :" + windowCount);

				// Apply enhanced For loop to get the window id of all open window.
				// Window id will help to uniquely identified the all open window.

				for (String childWindowId : allWindows) {
					if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
						driver.switchTo().window(childWindowId);
						Thread.sleep(5000);

						if (mapPl.dropdownMAP() != null && mapPl.dropdownMAP().isDisplayed()) {
							Base.highLightElement(driver, mapPl.dropdownMAP());
							mapPl.dropdownMAP().click();
							mapPl.mapNetsutra().click();
							driver.manage().window().maximize();
							Thread.sleep(10000);
							Base.takeScreenShot("Map Indoor");
							mapPl.btnMapBox().click();
							Thread.sleep(3000);
							Base.takeScreenShot("Map Indoor");
							driver.close();

						} else {

							System.out.println("MAP not found");
						}
					}

					driver.switchTo().window(parentWindowId);

				}
			}
		} catch (Exception ex) {

			System.out.println("Exception in MAP : " + ex.getStackTrace());
		}

	}

	public void ViewERP() {

		try {

			if (btnERP().isDisplayed() == true) {
				Base.highLightElement(driver, btnERP());
				String parentWindowId = driver.getWindowHandle();
				System.out.println("Parent Window ID is: " + parentWindowId);
				btnERP().click();
				Thread.sleep(5000);
				Set<String> allWindows = driver.getWindowHandles();
				int windowCount = allWindows.size();
				System.out.println("Total ERP window count is :" + windowCount);

				for (String childWindowId : allWindows) {
					if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
						driver.switchTo().window(childWindowId);
						Thread.sleep(5000);

						if (ERPL.dropdownERP() != null && ERPL.dropdownERP().isDisplayed()) {
							Base.highLightElement(driver, ERPL.dropdownERP());
							Base.takeScreenShot("ERP");
							ERPL.dropdownERP().click();
							Thread.sleep(3000);
							Base.takeScreenShot("ERP");
							ERPL.erpEarthquick().click();
							Thread.sleep(3000);
							Base.takeScreenShot("ERP");
							ERPL.dropdownERP().click();
							Thread.sleep(3000);
							ERPL.erpEvacuation().click();
							Thread.sleep(3000);
							Base.takeScreenShot("ERP");
							driver.close();

						}
					}
				}
			} else {

				System.out.println("ERP() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ERP() link : " + ex.getStackTrace());
		}

	}

}
