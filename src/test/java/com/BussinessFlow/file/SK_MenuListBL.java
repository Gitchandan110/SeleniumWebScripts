package com.BussinessFlow.file;

import java.util.Set;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPO;

public class SK_MenuListBL extends SK_MenuListPO {

	public void clickActiveEvents() {

		try {

			if (ActiveEvents().isDisplayed() == true) {
				Base.highLightElement(driver, ActiveEvents());
				ActiveEvents().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Active Events");

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
				Base.FullPageScreenShot("Closed Events");

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
				Base.FullPageScreenShot("Event Notification");

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
				Base.FullPageScreenShot("Event Attendence");

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
				Base.FullPageScreenShot("Organization");

			} else {

				System.out.println("Organization link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Organization link : " + ex.getStackTrace());
		}

	}
	

	public void clickContacts() {

		try {

			if (Contacts().isDisplayed() == true) {

				Base.highLightElement(driver, Contacts());
				Contacts().click();
								

			} else {

				System.out.println("Contact() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Contact() link : " + ex.getStackTrace());
		}

	}
	
	

	public void clickEmergencyContact() {

		try {

			if (EmergencyContact().isDisplayed() == true) {

				Base.highLightElement(driver, EmergencyContact());
				EmergencyContact().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Emergency Contacts");

			} else {

				System.out.println("EmergencyContact() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EmergencyContact() link : " + ex.getStackTrace());
		}

	}
	
	
	public void clickExternalContact() {

		try {

			if (ExternalContact().isDisplayed() == true) {

				Base.highLightElement(driver, ExternalContact());
				ExternalContact().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("External Contacts");

			} else {

				System.out.println("ExternalContact() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ExternalContact() link : " + ex.getStackTrace());
		}

	}
	
	
	public void clickNotifications() {

		try {

			if (menuNotifications() != null && menuNotifications().isDisplayed()) {
				Base.scrolltoElement(driver, menuNotifications());
				Base.highLightElement(driver, menuNotifications());
				menuNotifications().click();
				Thread.sleep(7000);
				

			} else {

				System.out.println("menuNotifications() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuNotifications() : " + ex.getStackTrace());
		}

	}
	
	public void clickSendNotification() {

		try {

			if (sendNotifications() != null && sendNotifications().isDisplayed()) {
				Base.highLightElement(driver, sendNotifications());
				sendNotifications().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Send Notifications");
			} else {

				System.out.println("SendNotification() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SendNotification() : " + ex.getStackTrace());
		}

	}
	
	public void clickScheduleNotification() {

		try {

			if (scheduleNotifications() != null && scheduleNotifications().isDisplayed()) {
				Base.highLightElement(driver, scheduleNotifications());
				scheduleNotifications().click();
				System.out.println("Schedule Notifications found and clicked");
				Thread.sleep(5000);
				Base.FullPageScreenShot("Schedule Notification");

			} else {

				System.out.println("scheduleNotifications() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in scheduleNotifications() : " + ex.getStackTrace());
		}

	}
	
	public void clickManageGroups() {

		try {

			if (ManageGroups() != null && ManageGroups().isDisplayed()) {
				Base.highLightElement(driver, ManageGroups());
				ManageGroups().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Manage Groups");

			} else {

				System.out.println("ManageGroups() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ManageGroups() : " + ex.getStackTrace());
		}

	}
	
	public void clickManageTemplates() {

		try {

			if (menuManageTemplates() != null && menuManageTemplates().isDisplayed()) {
				Base.highLightElement(driver, menuManageTemplates());
				menuManageTemplates().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Manage Templates");

			} else {

				System.out.println("menuManageTemplates() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuManageTemplates() : " + ex.getStackTrace());
		}

	}
	
	
	
	public void clickTipNotification() {

		try {

			if (menuTipNotification() != null && menuTipNotification().isDisplayed()) {
				Base.highLightElement(driver, menuTipNotification());
				menuTipNotification().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Tip Notification");

			} else {

				System.out.println("menuTipNotification() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuTipNotification() : " + ex.getStackTrace());
		}

	}
	
		
	
	public void clickNotificationHistory() {

		try {

			if (menuNotificationHistory() != null && menuNotificationHistory().isDisplayed()) {
				Base.highLightElement(driver, menuNotificationHistory());
				menuNotificationHistory().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Notification History");

			} else {

				System.out.println("menuNotificationHistory() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuNotificationHistory() : " + ex.getStackTrace());
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
				Base.FullPageScreenShot("Visitor Pass Type");

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
				Base.FullPageScreenShot("Visitor Passes");

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
	
	
	public void clickReports() {

		try {

			if (Reports().isDisplayed() == true) {
				Base.scrolltoElement(driver, Reports());
				Base.highLightElement(driver, Reports());
				Reports().click();
				Thread.sleep(8000);
				Base.takeScreenShot("Reports");

			} else {

				System.out.println("Reports() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Reports() link : " + ex.getStackTrace());
		}

	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
