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

	public void clickGeofences() {

		try {

			if (menuGeofences() != null && menuGeofences().isDisplayed()) {
				Base.highLightElement(driver, menuGeofences());
				menuGeofences().click();
				System.out.println("menuGeofences() clicked");
				Thread.sleep(10000);
				Base.takeScreenShot("Geofences");

			} else {

				System.out.println("Geofences not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Geofences : " + ex.getStackTrace());
		}

	}

	
	public void clickEmergencyContacts() {

		try {

			if (menuContacts() != null && menuContacts().isDisplayed()) {
				Base.highLightElement(driver, menuContacts());
				menuContacts().click();
				menuEmergencyContacts().click();
				System.out.println("menuEmergencyContacts() clicked");
				Thread.sleep(10000);
				Base.takeScreenShot("EmergencyContacts");

			} else {

				System.out.println("EmergencyContacts not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EmergencyContacts : " + ex.getStackTrace());
		}

	}
	
	public void clickExternalContacts() {

		try {

			if (menuContacts() != null && menuContacts().isDisplayed()) {
				Base.highLightElement(driver, menuContacts());
				menuContacts().click();
				menuExternalContacts().click();
				System.out.println("menuExternalContacts() clicked");
				Thread.sleep(10000);
				Base.takeScreenShot("ExternalContacts");

			} else {

				System.out.println("ExternalContacts not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ExternalContacts : " + ex.getStackTrace());
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

	public void clickMenuAdministration() {

		try {

			if (menuAdministration().isDisplayed() == true) {

				Base.highLightElement(driver, menuAdministration());
				menuAdministration().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Administration");

			} else {

				System.out.println("Administration link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Administration link : " + ex.getStackTrace());
		}

	}
	

	public void clickContacts() {

		try {

			if (Contacts().isDisplayed() == true) {
				Base.highLightElement(driver, Contacts());
				Contacts().click();
				Thread.sleep(3000);			

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
	
	
	public void clickAssets() {

		try {

			if (menuAssets().isDisplayed() == true) {
				Base.highLightElement(driver, menuAssets());
				menuAssets().click();
				System.out.println("menuAssets found and clicked");
				Thread.sleep(5000);				

			} else {

				System.out.println("menuAssets() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuAssets() : " + ex.getStackTrace());
		}

	}
	
	
	public void clickManageAssets() {

		try {

			if (menuManageAssets().isDisplayed() == true) {
				Base.highLightElement(driver, menuManageAssets());
				menuManageAssets().click();
				Thread.sleep(9000);
				Base.FullPageScreenShot("Assets");

			} else {

				System.out.println("Assets not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Assets : " + ex.getStackTrace());
		}

	}
	
		
	public void clickMenuCommunications() {

		try {
			
		
			if (menuCommunications() != null && menuCommunications().isDisplayed()) {
				Base.scrolltoElement(driver, menuCommunications());
				Base.highLightElement(driver, menuCommunications());
				menuCommunications().click();
				System.out.println("menuCommunications() Clicked");
				Thread.sleep(3000);
			}

			else {

				System.out.println("menuCommunications() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuCommunications() : " + ex.getStackTrace());
		}

	}
	
	
	public void clickNotifications() {

		try {
			
		
			 if (menuNotifications() != null && menuNotifications().isDisplayed()) {
				Base.scrolltoElement(driver, menuNotifications());
				Base.highLightElement(driver, menuNotifications());
				menuNotifications().click();
				System.out.println("menuNotifications() found and clicked");
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
				System.out.println("Send Notification found and Clicked");
				Thread.sleep(5000);
			} else {

				System.out.println("SendNotification() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SendNotification() : " + ex.getStackTrace());
		}

	}
	
	public void clickSchedule() {

		try {

			if (MenuSchedule() != null && MenuSchedule().isDisplayed()) {
				Base.highLightElement(driver, MenuSchedule());
				MenuSchedule().click();
				System.out.println("Schedule found and clicked");
				Thread.sleep(5000);
				Base.FullPageScreenShot("Schedule");

			} else {

				System.out.println("schedule() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in schedule() : " + ex.getStackTrace());
		}

	}
	
	public void clickGroups() {

		try {

			if (MenuGroups() != null && MenuGroups().isDisplayed()) {
				Base.highLightElement(driver, MenuGroups());
				MenuGroups().click();
				Thread.sleep(8000);
				Base.FullPageScreenShot("Notification Groups");

			} else {

				System.out.println("Notification Groups not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Notification Groups : " + ex.getStackTrace());
		}

	}
	
	public void clickTemplates() {

		try {

			if (menuTemplates() != null && menuTemplates().isDisplayed()) {
				Base.highLightElement(driver, menuTemplates());
				menuTemplates().click();
				System.out.println("menuTemplates() Clicked");
				Thread.sleep(5000);
				Base.FullPageScreenShot("Templates");

			} else {

				System.out.println("menuTemplates() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuTemplates() : " + ex.getStackTrace());
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
				Thread.sleep(10000);
				Base.FullPageScreenShot("Notification History");

			} else {

				System.out.println("menuNotificationHistory() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuNotificationHistory() : " + ex.getStackTrace());
		}

	}	
	
	
	public void clickCovidCover() {

		try {

			if (menuCovidCover() != null && menuCovidCover().isDisplayed()) {
				Base.scrolltoElement(driver, menuCovidCover());
				Base.highLightElement(driver, menuCovidCover());
				menuCovidCover().click();
				System.out.println("menuCovidCover() Clicked");
				Base.takeScreenShot("CovidCover");
				Thread.sleep(3000);
				

			} else {

				System.out.println("menuCovidCover() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuCovidCover() : " + ex.getStackTrace());
		}

	}
	
	
	public void clickConfigure() {

		try {

			if (menuConfigure() != null && menuConfigure().isDisplayed()) {
				Base.scrolltoElement(driver, menuConfigure());
				menuConfigure().click();
				Thread.sleep(7000);
				Base.FullPageScreenShot("Covid Survey Configuration");
				

			} else {

				System.out.println("menuConfigure() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in menuConfigure() : " + ex.getStackTrace());
		}

	}
	
	
	public void clickMenuOrganizationResources() {

		try {
			

			if (menuOrganizationResources() != null && menuOrganizationResources().isDisplayed()) {
				Base.highLightElement(driver, menuOrganizationResources());
				menuOrganizationResources().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Organization Resources");
			
			}
			
			else {

				System.out.println("Menu Organization Resources not found");
			}
			
		} catch (Exception ex) {

			System.out.println("Exception in Organization Resources : " + ex.getStackTrace());
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
	
	
	public void clickMaps() {

		try {

			if (Map() != null && Map().isDisplayed()) {
				Base.highLightElement(driver, Map());
				Map().click();
				System.out.println("Map clicked");
				Thread.sleep(10000);
				Base.takeScreenShot("Map");

			} else {

				System.out.println("Map not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Map : " + ex.getStackTrace());
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
	
	
	public void clickAllReports() {

		try {

			if (AllReports().isDisplayed() == true) {
				AllReports().click();
				Thread.sleep(8000);
				Base.takeScreenShot("Reports");

			} else {

				System.out.println("All Reports() link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in All Reports() link : " + ex.getStackTrace());
		}

	}
	
		
	public void clickEventResponsePlans() {

		try {
			
				if (EventResponsePlans().isDisplayed() == true) {
				Base.scrolltoElement(driver, EventResponsePlans());
				Base.highLightElement(driver, EventResponsePlans());
				EventResponsePlans().click();
				Thread.sleep(5000);
				Base.takeScreenShot("ERP");

			} else {

				System.out.println("ERP link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ERP link : " + ex.getStackTrace());
		}

	}
	
	public void clickManageERP() {

		try {

			if (ManageERP().isDisplayed() == true) {
				ManageERP().click();
				Thread.sleep(6000);
				System.out.println("ERP List screen displayed");
				Base.FullPageScreenShot("Manage ERP");

			} else {

				System.out.println("ManageERP link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ManageERP link : " + ex.getStackTrace());
		}

	}
	
	
	public void clickShowERP() {

		try {

			if (ShowERP().isDisplayed() == true) {
				ShowERP().click();
				Thread.sleep(3000);
				System.out.println("Show ERP screen displayed");
				Base.FullPageScreenShot("Show ERP");

			} else {

				System.out.println("ShowERP link not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ShowERP link : " + ex.getStackTrace());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
