package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_BroadcastPO;

public class SK_BroadcastBL extends SK_BroadcastPO {

	SK_BroadcastPO BroadcastPL;
	
	public void verifyBroadcastBtn() {

		try {

			if (BtnBroadcast().isDisplayed() == true) {

				Base.highLightElement(driver, BtnBroadcast());
				BtnBroadcast().click();

			} else {

				System.out.println("Broadcast button not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Broadcast :" + ex.getLocalizedMessage());
			System.out.println("Exception in Broadcast :" + ex.getStackTrace());

		}

	}

	public void verifyBroadcastMessage() {

		try {

			if (TextboxBroadcast().isDisplayed() == true) {
				TextboxBroadcast().click();
				Base.highLightElement(driver, TextboxBroadcast());
				TextboxBroadcast().sendKeys("Plz ignore this is a test Broadcast msg");
				System.out.println("Message typed under Broadcast field");
				
				


			} else {

				System.out.println("Issue in Braodcast message field");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Braodcast message field :" + ex.getLocalizedMessage());
			System.out.println("Exception in Braodcast message field :" + ex.getStackTrace());
		}

	}

	public void verifyBtnSubmit() {

		try {

			if (BtnSend().isDisplayed() == true) {
				Base.highLightElement(driver, BtnSend());
				Base.takeScreenShot("BroadcastScreen");
				BtnSend().click();
		

			} else {

				System.out.println("Submit button has some issue");
			}

		} catch (Exception ex) {

			System.out.println("Exception found in Submit button :" + ex.getMessage());
			System.out.println("Exception found in Submit button :" + ex.getStackTrace());

		}

	}

	public void verifyBtnCancel() {

		try {

			if (BtnCancel().isDisplayed() == true) {

				BtnCancel().click();

			} else {

				System.out.println("Cancel button has some issue");
			}

		} catch (Exception ex) {

			System.out.println("Exception found in Cancel button :" + ex.getMessage());
			System.out.println("Exception found in Cancel button :" + ex.getStackTrace());

		}
	}

}
