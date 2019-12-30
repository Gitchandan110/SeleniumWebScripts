package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPL;

public class SK_MenuListBL extends SK_MenuListPL{
	
	public void clickMenuOrganization()  {

		try {

			if (menuOrganization().isDisplayed() == true) {

				Base.highLightElement(driver, menuOrganization());
				menuOrganization().click();
				Thread.sleep(5000);
				Base.takeScreenShot("OrganizationPage");

			} else {

				System.out.println("Organization link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Organization link : " + ex.getStackTrace());
		}

	}
	
	public void clickMenuVisitorManagement()  {

		try {

			if (menuVisitorManagement() !=null && menuVisitorManagement().isDisplayed()) {
				menuVisitorManagement().click();
				Thread.sleep(2000);
				

			} else {

				System.out.println("Visitor Management Menu not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Visitor Management : " + ex.getStackTrace());
		}

	}

	public void clickMenuVisitorPassType()  {

		try {

			if (menuVisitorPassType() !=null && menuVisitorPassType().isDisplayed()) {
				menuVisitorPassType().click();
				Thread.sleep(5000);
				

			} else {

				System.out.println("menuVisitorPassType() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuVisitorPassType(): " + ex.getStackTrace());
		}

	}


}
