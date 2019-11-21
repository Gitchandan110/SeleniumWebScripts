package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_HomePagePL;

public class SK_HomePageBL extends SK_HomePagePL {

	String SanitySheet="Sanity_SK";
	
	public void verifyHamburgerMenu() {

		try {

			if (HamburgerMenu().isDisplayed() == true) {
				ExcelWrite.writeSanitySheet(SanitySheet, 23, 2, "Pass");
				Base.highLightElement(driver, HamburgerMenu());
				HamburgerMenu().click();
				ExcelWrite.writeSanitySheet(SanitySheet, 24, 2, "Pass");
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(5000);

			} else {

				System.out.println("Hamburger menu not found");
				ExcelWrite.writeSanitySheet(SanitySheet, 23, 2, "Fail");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Home Page Hamburger Menu : " + ex.getStackTrace());
		}

	}

	public void VerifyOrganizationlink() {

		try {

			if (LinkOrganization().isDisplayed() == true) {

				Base.highLightElement(driver, LinkOrganization());

				LinkOrganization().click();

			} else {

				System.out.println("Organization link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Organization link : " + ex.getStackTrace());
		}

	}

}