package com.BussinessFlow.file;

import java.util.Set;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_ERPPO;
import com.PageObjectRepository.file.SK_HomePagePO;
import com.PageObjectRepository.file.SK_MapPO;

public class SK_HomePageBL extends SK_HomePagePO {

	String SanitySheet = "Sanity_SK";
	SK_MapPO mapPl = new SK_MapPO();
	SK_ERPPO ERPL = new SK_ERPPO();
	
	
	public void verifyActiveEventsPage() {

		try {

			if (driver.getTitle().contains("Active Events")) {
				System.out.println("Active Events Page Title verified");
				Base.FullPageScreenShot("ActiveEvents");
				ExcelWrite.writeSanitySheet(SanitySheet, 1, 1, "Pass");

			} else {

				System.out.println("Active Events Page Title not verified");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Active Events Page : " + ex.getStackTrace());
		}

	}

	public void verifyTabClosedIncident() {

		try {

			if (tabClosedIncident().isDisplayed()) {
				Base.highLightElement(driver, tabClosedIncident());
				tabClosedIncident().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("ClosedEvents");

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
				Base.FullPageScreenShot("MenuOptions");
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
				Base.FullPageScreenShot("Reports");

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
						Base.FullPageScreenShot("MapScreen");

						if (mapPl.dropdownMAP() != null && mapPl.dropdownMAP().isDisplayed()) {
							Base.highLightElement(driver, mapPl.dropdownMAP());
							mapPl.dropdownMAP().click();
							mapPl.mapNetsutra().click();
							driver.manage().window().maximize();
							Thread.sleep(10000);
							Base.FullPageScreenShot("MapNetsutra");
							mapPl.btnMapBox().click();
							Thread.sleep(3000);
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
							ERPL.dropdownERP().click();
							Thread.sleep(3000);
							Base.FullPageScreenShot("ERP");
							ERPL.erpEarthquick().click();
							Thread.sleep(3000);
							Base.FullPageScreenShot("ERP_Earthquick");
							ERPL.dropdownERP().click();
							Thread.sleep(3000);
							ERPL.erpEvacuation().click();
							Thread.sleep(3000);
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
