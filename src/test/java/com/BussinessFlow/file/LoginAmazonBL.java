package com.BussinessFlow.file;

import com.Commonutills.file.Utils;
import com.PageObjectRepository.file.LoginAmazonPL;

public class LoginAmazonBL extends LoginAmazonPL {



	public void login() throws InterruptedException {

		try {
			System.out.println("Hello Login Page");
			Utils.highLightElement(driver, BtnSignIn());
	        BtnSignIn().click();
	        System.out.println("SignIn Processed");
			Utils.highLightElement(driver, Email());
			System.out.println("Email Field found");
			Email().click();
			System.out.println("Clicked on Email Field");
			Email().sendKeys("8178041681");
			Utils.elementFound(Email());
			BtnContinue().click();
		//	Utils.waitForElement(driver, Password());
			Utils.typeText(Password(), "omsai11ram");
		//	Utils.waitForElement(driver, BtnLogin());
			BtnLogin().click();
			

		} catch (Exception ex) {

			System.out.println("Exception in LoginAmazonBL :" + ex.getLocalizedMessage());
			System.out.println("Exception in LoginAmazonBL :" + ex.getStackTrace());
		}

	}

}
