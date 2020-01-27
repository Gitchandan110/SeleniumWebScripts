package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPL;

public class SK_MenuListBL extends SK_MenuListPL {

	public void clickActiveEvents() {

		try {

			if (ActiveEvents().isDisplayed() == true) {
				Base.highLightElement(driver, ActiveEvents());
				ActiveEvents().click();
				Thread.sleep(5000);
				Base.scrollEndofthePage(driver);
				Base.takeScreenShot("ActiveEvents");

			} else {

				System.out.println("ActiveEvents link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ActiveEvents() link : " + ex.getStackTrace());
		}

	}

	public void clickClosedEvents() {

		try {

			if (ClosedEvents().isDisplayed() == true) {
				Base.highLightElement(driver, ClosedEvents());
				ClosedEvents().click();
				Thread.sleep(5000);
				Base.scrollEndofthePage(driver);
				Base.takeScreenShot("ClosedEvents");

			} else {

				System.out.println("ClosedEvents() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ClosedEvents() link : " + ex.getStackTrace());
		}

	}

	public void clickEventNotification() {

		try {

			if (EventNotification().isDisplayed() == true) {
				Base.highLightElement(driver, EventNotification());
				EventNotification().click();
				Thread.sleep(5000);
				Base.takeScreenShot("EventNotification");

			} else {

				System.out.println("EventNotification() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EventNotification() link : " + ex.getStackTrace());
		}

	}

	public void clickEventAttendence() {

		try {

			if (EventAttendence().isDisplayed() == true) {
				Base.highLightElement(driver, EventAttendence());
				EventAttendence().click();
				Thread.sleep(5000);
				Base.takeScreenShot("EventAttendence");

			} else {

				System.out.println("EventAttendence() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EventAttendence() link : " + ex.getStackTrace());
		}

	}

	public void clickMenuOrganization() {

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

	public void clickEmergencyContact() {

		try {

			if (EmergencyContact().isDisplayed() == true) {

				Base.highLightElement(driver, EmergencyContact());
				EmergencyContact().click();
				Thread.sleep(5000);
				Base.takeScreenShot("EmergencyContact");

			} else {

				System.out.println("EmergencyContact() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EmergencyContact() link : " + ex.getStackTrace());
		}

	}

	public void clickNotifications() {

		try {

			if (menuNotifications() != null && menuNotifications().isDisplayed()) {
				Base.highLightElement(driver, menuNotifications());
				menuNotifications().click();
				Thread.sleep(8000);
				Base.takeScreenShot("Notifications");

			} else {

				System.out.println("menuNotifications() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuNotifications() : " + ex.getStackTrace());
		}

	}

	public void clickManageTemplates() {

		try {

			if (menuManageTemplates() != null && menuManageTemplates().isDisplayed()) {
				Base.highLightElement(driver, menuManageTemplates());
				menuManageTemplates().click();
				Thread.sleep(5000);

			} else {

				System.out.println("menuManageTemplates() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuManageTemplates() : " + ex.getStackTrace());
		}

	}

	public void clickMenuVisitorManagement() {

		try {

			if (menuVisitorManagement() != null && menuVisitorManagement().isDisplayed()) {
				menuVisitorManagement().click();
				Thread.sleep(2000);

			} else {

				System.out.println("Visitor Management Menu not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Visitor Management : " + ex.getStackTrace());
		}

	}

	public void clickMenuVisitorPassType() {

		try {

			if (menuVisitorPassType() != null && menuVisitorPassType().isDisplayed()) {
				menuVisitorPassType().click();
				System.out.println("menuVisitorPassType selected");
				Thread.sleep(5000);

			} else {

				System.out.println("menuVisitorPassType() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuVisitorPassType(): " + ex.getStackTrace());
		}

	}

	public void clickVisitorPasses() {

		try {

			if (linkVisitorPasses() != null && linkVisitorPasses().isDisplayed()) {
				linkVisitorPasses().click();
				System.out.println("Visitor Passes selected");
				Thread.sleep(5000);

			} else {

				System.out.println("Visitor Passes not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Visitor Passses): " + ex.getStackTrace());
		}

	}
	
	public void clickPoll() {

		try {

			if (Poll() != null && Poll().isDisplayed()) {
				Base.highLightElement(driver, Poll());
				Poll().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Poll");

			} else {

				System.out.println("Poll() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Poll() : " + ex.getStackTrace());
		}

	}

	public void clickMap() {

		try {

			if (Map() != null && Map().isDisplayed()) {
				Base.highLightElement(driver, Map());
				Map().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Map");

			} else {

				System.out.println("Map() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Map() : " + ex.getStackTrace());
		}

	}
	
	public void clickVideoConference() {

		try {

			if (VideoConference() != null && VideoConference().isDisplayed()) {
				Base.highLightElement(driver, VideoConference());
				VideoConference().click();
				Thread.sleep(5000);
				Base.takeScreenShot("VideoConference");

			} else {

				System.out.println("VideoConference() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in VideoConference() : " + ex.getStackTrace());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
