package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SafetyKuvrrHomePageMenuPL;

public class SafetyKuvrrHomePageMenuBL extends SafetyKuvrrHomePageMenuPL {

	public void verifyHamburgerMenu() {

		try {

			if (HamburgerMenu().isDisplayed() == true) {

				Base.highLightElement(driver, HamburgerMenu());

				HamburgerMenu().click();
				// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(5000);

			} else {

				System.out.println("Hamburger menu not found");
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