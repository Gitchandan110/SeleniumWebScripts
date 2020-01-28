package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_HomePagePL;

public class SK_HomePageBL extends SK_HomePagePL {

	String SanitySheet="Sanity_SK";
	
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
	
	
	public void clickERP() {

		try {

			if (btnERP().isDisplayed() == true) {
				Base.highLightElement(driver, btnERP());
				btnERP().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ERP");

			} else {

				System.out.println("ERP() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ERP() link : " + ex.getStackTrace());
		}

	}
	
	
	public void clickMAP() {

		try {

			if (btnMAP().isDisplayed() == true) {
				Base.highLightElement(driver, btnMAP());
				btnMAP().click();
				Thread.sleep(5000);
				Base.takeScreenShot("MAP");

			} else {

				System.out.println("MAP() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in MAP() link : " + ex.getStackTrace());
		}

	}
	
	

}