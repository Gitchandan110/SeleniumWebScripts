package com.BussinessFlow.file;

import java.util.Set;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPL;
import com.PageObjectRepository.file.SK_ReportsPL;

public class SK_ReportsBL extends SK_ReportsPL {

	public void clickEventsReport() {

		try {

			if (EventsReport().isDisplayed() == true) {
				Base.highLightElement(driver, EventsReport());
				EventsReport().click();
				Thread.sleep(3000);
				Base.takeScreenShot("Reports");

			} else {

				System.out.println("EventsReport() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EventsReport(): " + ex.getStackTrace());
		}

	}

	public void clickEventHistorybyDay() {

		try {

			if (EventHistoryDay().isDisplayed() == true) {
				Base.highLightElement(driver, EventHistoryDay());
				EventHistoryDay().click();
				Thread.sleep(12000);
				Base.takeScreenShot("Reports");

			} else {

				System.out.println("Event History by Day() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Event History by Day(): " + ex.getStackTrace());
		}

	}

	public void clickBtnCloseEventHistory() {

		try {

			if (btncloseReports().isDisplayed() == true) {
				btncloseReports().click();
				Thread.sleep(2000);

			} else {

				System.out.println("btncloseReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in btncloseReports(): " + ex.getStackTrace());
		}

	}

	public void clickEventHistorybyMonth() {

		try {

			if (EventHistoryMonth().isDisplayed() == true) {
				Base.highLightElement(driver, EventHistoryMonth());
				EventHistoryMonth().click();
				Thread.sleep(12000);
				Base.takeScreenShot("Reports");

			} else {

				System.out.println("Event History by Month() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Event History by Month(): " + ex.getStackTrace());
		}

	}

}
