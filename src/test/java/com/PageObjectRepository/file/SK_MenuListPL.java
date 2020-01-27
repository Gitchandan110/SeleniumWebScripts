package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_MenuListPL extends Base {

	public WebElement ActiveEvents() {

		try {
			By activeEvents = By.xpath("//a[@href='/observer/']");
			return driver.findElement(activeEvents);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement ClosedEvents() {

		try {
			By closedEvents = By.xpath("//li[@class='system-nav-item-closed-incidents ']");
			return driver.findElement(closedEvents);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement EventNotification() {

		try {
			By EventNotification = By.xpath("//li[@class='system-nav-item-incident-notifications ']");
			return driver.findElement(EventNotification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement EventAttendence() {

		try {
			By EventAttendence = By.xpath("//li[@class='system-nav-item-incident-observer ']");
			return driver.findElement(EventAttendence);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuOrganization() {

		By MenuOrg = By.xpath("//a[@href='/organization/']");

		// By linkOrganization= By.cssSelector("a[href='/organization/']");

		return driver.findElement(MenuOrg);
	}

	public WebElement EmergencyContact() {

		try {
			By EventAttendence = By.xpath("//li[@class='system-nav-item-org-contacts ']");
			return driver.findElement(EventAttendence);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuNotifications() {

		try {
			By Notifications = By.xpath("//li[@class='system-nav-item-broadcast']");
			return driver.findElement(Notifications);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuManageTemplates() {

		try {
			By ManageTemplates = By.xpath("//a[@href='/broadcast/template/list/']");
			System.out.println("menuManageTemplates() locator is correct");
			return driver.findElement(ManageTemplates);

		} catch (Exception e) {
			System.out.println("menuManageTemplates() locator is incorrect" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuVisitorManagement() {

		try {
			By menuVisitor = By.xpath("//li[@class='system-nav-item-guests']");
			return driver.findElement(menuVisitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuVisitorPassType() {

		try {
			By menuVisitorPass = By.xpath("//a[@href='/visitor_management/visitor_passtypes/']");
			return driver.findElement(menuVisitorPass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement linkVisitorPasses() {

		try {
			By VisitorPasses = By.xpath("//a[@href='/visitor_management/visitors/']");
			return driver.findElement(VisitorPasses);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Poll() {

		try {
			By poll = By.xpath("//li[@class='system-nav-item-poll']");
			return driver.findElement(poll);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Map() {

		try {
			By Map = By.xpath("//li[@class='system-nav-item-maps']");
			return driver.findElement(Map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement VideoConference() {

		try {
			By video = By.xpath("//li[@class='system-nav-item-video']");
			return driver.findElement(video);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Reports() {

		try {
			By Reports = By.xpath("//li[@class='system-nav-item-tableau-report ']");
			return driver.findElement(Reports);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement EventResponsePlans() {

		try {
			By IRP = By.xpath("//li[@class='system-nav-item-irp']");
			return driver.findElement(IRP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Geofences() {

		try {
			By geo = By.xpath("//li[@class='system-nav-item-geofences ']");
			return driver.findElement(geo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Users() {

		try {
			By users = By.xpath("//li[@class='system-nav-item-users ']");
			return driver.findElement(users);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement UserProfiles() {

		try {
			By userProfiles = By.xpath("//li[@class='system-nav-item-user-profiles ']");
			return driver.findElement(userProfiles);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement AppUsersPermissions() {

		try {
			By appPermissions = By.xpath("//li[@class='system-nav-item-user-permissions ']");
			return driver.findElement(appPermissions);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement userDevices() {

		try {
			By devices = By.xpath("//li[@class='system-nav-item-user-devices ']");
			return driver.findElement(devices);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement userContacts() {

		try {
			By contacts = By.xpath("//li[@class='system-nav-item-user-contacts ']");
			return driver.findElement(contacts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement CentralStation() {

		try {
			By centralStation = By.xpath("//li[@class='system-nav-item-central-station ']");
			return driver.findElement(centralStation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
