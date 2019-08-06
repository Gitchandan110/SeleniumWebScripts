package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SafetyKuvrrOpenIncidentPL;

public class SafetyKuvrrIncidentBL extends SafetyKuvrrOpenIncidentPL {

	SafetyKuvrrOpenIncidentPL OpenIncidentPL;

	public void clickIncomingIncident() throws InterruptedException {

		try {

			if (IncomingIncident().isDisplayed() == true) {
				Base.scrolltoElement(driver, IncomingIncident());
				Thread.sleep(3000);
				Base.highLightElement(driver, IncomingIncident());
				Thread.sleep(2000);
				IncomingIncident().click();
				System.out.println("Incoming Incident was clicked");
				Thread.sleep(15000);

			} else {

				System.out.println("No Open Incident Found");

			}
		} catch (Exception ex) {

			System.out.println(ex);

		}
	}

	public void clickOpenIncident() throws InterruptedException {

		try {

			if (OpenIncident().isDisplayed() == true) {
				Base.scrolltoElement(driver, OpenIncident());
				Thread.sleep(3000);
				Base.highLightElement(driver, OpenIncident());
				Thread.sleep(2000);
				OpenIncident().click();
				System.out.println("Open Incident was clicked");
				Thread.sleep(15000);
			

			} else {

				System.out.println("No Open Incident Found");
			}
		} catch (Exception e) {

		}
	}

}
