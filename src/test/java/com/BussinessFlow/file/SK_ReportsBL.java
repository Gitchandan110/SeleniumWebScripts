package com.BussinessFlow.file;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPO;
import com.PageObjectRepository.file.SK_ReportsPO;

public class SK_ReportsBL extends SK_ReportsPO {

	public void clickCommunicationHistoryReports() {

		try {

			if (CommunicationHistoryReports().isDisplayed() == true) {
				Base.highLightElement(driver, CommunicationHistoryReports());
				CommunicationHistoryReports().click();
				Thread.sleep(6000);
				Base.FullPageScreenShot("Communication History Dashboard");
				System.out.println("CommunicationHistoryDashboard found");

				Base.scrolltoElement(driver, tabCommunicationHistory());
				Base.highLightElement(driver, tabCommunicationHistory());
				System.out.println("Communication History tab found");
				Thread.sleep(3000);

			}

			String url = driver.getCurrentUrl();
			System.out.println(url);
			if (url.equalsIgnoreCase("https://safety-red5.kuvrr.com/report/communication-history-dashboard/")) {
				System.out.println("Red5 Server is running");

				driver.navigate()
						.to("https://safety-red5.kuvrr.com/report/communication-history/");

			}

			else if (url
					.equalsIgnoreCase("https://safety.kuvrr.com/report/communication-history-dashboard/")) {
				System.out.println("Production Server is running");

				driver.navigate()
						.to("https://safety.kuvrr.com/report/communication-history/");

			}

			else if (url
					.equalsIgnoreCase("https://safety-test.kuvrr.com/report/communication-history-dashboard/")) {
				System.out.println("Dev Server is running");

				driver.navigate()
						.to("https://safety-test.kuvrr.com/report/communication-history/");

			}

			System.out.println("Communication History screen Opened");
			Thread.sleep(6000);
			Base.FullPageScreenShot("Communication History");
			BacktoReport().click();
			Thread.sleep(4000);

		} catch (Exception ex) {

			System.out.println("Exception in CommunicationHistory(): "
					+ ex.getStackTrace());
		}

	}

	public void clickEventsHistoryReport() {

		try {

			if (EventsHistoryReport().isDisplayed() == true) {
				Base.highLightElement(driver, EventsHistoryReport());
				EventsHistoryReport().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Events History Dashboard");

			} else {

				System.out.println("EventsHistoryReport() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EventsHistoryReport(): "
					+ ex.getStackTrace());
		}

	}

	public void clickTabEventHistory() {

		try {

			if (tabEventHistory().isDisplayed() == true) {
				Base.highLightElement(driver, tabEventHistory());
				tabEventHistory().click();
				Thread.sleep(8000);
				Base.FullPageScreenShot("Events History");
				BacktoReport().click();
				Thread.sleep(4000);

			} else {

				System.out.println("Event History not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Event History: "
					+ ex.getStackTrace());
		}

	}

	public void clickSelfCertificationDashboardReports() {

		try {

			if (SelfCertificationDashboardReports().isDisplayed() == true) {
				Base.highLightElement(driver,
						SelfCertificationDashboardReports());
				SelfCertificationDashboardReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Self Certification Dashboard Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out
						.println("SelfCertificationDashboardReports() not found");
			}

		} catch (Exception ex) {

			System.out
					.println("Exception in SelfCertificationDashboardReports(): "
							+ ex.getStackTrace());
		}

	}

	public void clickSelfCertificationAlertsReports() {

		try {

			if (SelfCertificationAlertsReports().isDisplayed() == true) {
				Base.highLightElement(driver, SelfCertificationAlertsReports());
				SelfCertificationAlertsReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Self Certification Alerts Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out
						.println("SelfCertificationAlertsReports() not found");
			}

		} catch (Exception ex) {

			System.out
					.println("Exception in SelfCertificationAlertsReports(): "
							+ ex.getStackTrace());
		}

	}

	public void clickSelfCertificationHistoryReports() {

		try {

			if (SelfCertificationHistoryReports().isDisplayed() == true) {
				Base.highLightElement(driver, SelfCertificationHistoryReports());
				SelfCertificationHistoryReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Self Certification Alerts Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out
						.println("SelfCertificationHistoryReports() not found");
			}

		} catch (Exception ex) {

			System.out
					.println("Exception in SelfCertificationHistoryReports(): "
							+ ex.getStackTrace());
		}

	}

	public void clickThermalScanAlertsReports() {

		try {

			if (ThermalScanAlertsReports().isDisplayed() == true) {
				Base.highLightElement(driver, ThermalScanAlertsReports());
				ThermalScanAlertsReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Thermal Scan Alerts Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("ThermalScanAlertsReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ThermalScanAlertsReports(): "
					+ ex.getStackTrace());
		}

	}

	public void clickThermalScanDashboardReports() {

		try {

			if (ThermalScanDashboardReports().isDisplayed() == true) {
				Base.highLightElement(driver, ThermalScanDashboardReports());
				ThermalScanDashboardReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Thermal Scan Dashboard Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("ThermalScanDashboardReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ThermalScanDashboardReports(): "
					+ ex.getStackTrace());
		}

	}

	public void clickThermalScanHistoryReports() {

		try {

			if (ThermalScanHistoryReports().isDisplayed() == true) {
				Base.highLightElement(driver, ThermalScanHistoryReports());
				ThermalScanHistoryReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Thermal Scan History Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("ThermalScanHistoryReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ThermalScanHistoryReports(): "
					+ ex.getStackTrace());
		}

	}

	public void clickTipHistoryReports() {

		try {

			if (TipHistoryReports().isDisplayed() == true) {
				Base.highLightElement(driver, TipHistoryReports());
				TipHistoryReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Tip History Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("TipHistoryReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in TipHistoryReports(): "
					+ ex.getStackTrace());
		}

	}

	public void clickTipsByCategoryReports() {

		try {

			if (TipsByCategoryReports().isDisplayed() == true) {
				Base.highLightElement(driver, TipsByCategoryReports());
				TipsByCategoryReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Tip By Category Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("TipsByCategoryReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in TipsByCategoryReports(): "
					+ ex.getStackTrace());
		}

	}

	public void clickIncomingTipsByDayTimeReports() {

		try {

			if (IncomingTipsByDayTimeReports().isDisplayed() == true) {
				Base.highLightElement(driver, IncomingTipsByDayTimeReports());
				IncomingTipsByDayTimeReports().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Incoming Tips By Day Time Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("IncomingTipsByDayTimeReports() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in IncomingTipsByDayTimeReports(): "
					+ ex.getStackTrace());
		}

	}

	public void clickUserReport() {

		try {

			if (UserReport().isDisplayed() == true) {
				Base.highLightElement(driver, UserReport());
				UserReport().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("App User Dashboard Reports");
				Base.highLightElement(driver, tabUserReport());
				tabUserReport().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("User Reports");
				BacktoReport().click();
				Thread.sleep(5000);

			} else {

				System.out.println("UserReport() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in UserReport(): "
					+ ex.getStackTrace());
		}

	}

}
