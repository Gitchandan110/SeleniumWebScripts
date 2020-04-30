package com.BussinessFlow.file;

import org.openqa.selenium.By;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ManageTemplatesPL;

import junit.framework.Assert;

public class SK_ManageTemplatesBL extends SK_ManageTemplatesPL {

	public void verifyManageTemplates() {

		try {
			if (pageManageTemplate() != null && pageManageTemplate().isDisplayed()) {
				Assert.assertEquals("Manage Templates", driver.getTitle());
				System.out.println("Landed on Manage Templates Page");
				Base.takeScreenShot("Notifications");
			}

			else {

				System.out.println("Unable to find Manage Templates Page");
			}

			if (filterTemplateTiltle() != null && filterTemplateTiltle().isDisplayed()) {
				Base.highLightElement(driver, filterTemplateTiltle());
				filterTemplateTiltle().sendKeys("NTGeo");
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Notifications");
				btnClear().click();
				System.out.println("filterTemplateTiltle() Pass");
				Base.waitFor30Seconds(filterStatus());
			}

			if (filterStatus() != null && filterStatus().isDisplayed()) {
				Base.highLightElement(driver, filterStatus());
				filterStatus().click();
				Thread.sleep(5000);
				filterActiveStatus().click();
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Notifications");
				btnClear().click();
				System.out.println("filterActiveStatus() Pass");
				Base.waitFor30Seconds(filterStatus());
				filterStatus().click();
				filterInactiveStatus().click();
				btnFilter().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Notifications");
				btnClear().click();
				System.out.println("filterInactiveStatus() Pass");
				Thread.sleep(5000);

			}
			if (linkDetails() != null && linkDetails().isDisplayed()) {
				System.out.println("linkDetails found");
				linkDetails().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Notifications");
				Base.scrollEndofthePage(driver);
				Thread.sleep(3000);
				btnCancelDetails().click();
				Thread.sleep(5000);

			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in Page Manage Template:" + e.getMessage());
		}
	}

	public void clickLinkCreateTemplate() throws InterruptedException {

		try {
			if (linkCreateTemplate() != null && linkCreateTemplate().isDisplayed()) {
				Base.highLightElement(driver, linkCreateTemplate());
				linkCreateTemplate().click();
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fillNotificationContent() throws InterruptedException {

		try {
			if (txtTitleNotificationTemplate() != null && txtTitleNotificationTemplate().isDisplayed()) {
				txtTitleNotificationTemplate().sendKeys("NtfTemplateTest" + Base.SystemTime());
				System.out.println("txtTitleNotificationTemplate() done");
				Thread.sleep(2000);
				txtEmailSub().sendKeys("TestNT:" + Base.SystemTime());
				System.out.println("txtEmailSub() done");
				txtEmailContainer().click();
				txtEmailContainer().sendKeys("This is Notification Template Email");
				System.out.println("txtEmailContainer() done");
				txtMobileSMS().sendKeys("This is Notification Template SMS");
				System.out.println("txtMobileSMS() done");
				txtAppNotification().sendKeys("This is App Notification Template");
				System.out.println("txtAppNotification() done");
				chkbxGeoAware().click();
				System.out.println("chkbxGeoAware() done");
				txtIVR().sendKeys("This is IVR Notification Template");
				System.out.println("Text to Voice done");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void selectUserGroup() {

		try {
			if (dropdownUserGroups() != null && dropdownUserGroups().isDisplayed()) {
				dropdownUserGroups().click();
				System.out.println("dropdownUserGroups() click");
			}
			int CountUserGroup = UserGroupList().size();
			System.out.println("Totla Number of User Groups are :" + CountUserGroup);

			for (int i = 1; i < 7; i++) {

				String UserGroupName = driver.findElement(By.xpath(
						"//div[@class='ui-select-choices-group optgroup']//div[@role='option'][" + i + "]//div//span"))
						.getText();

				System.out.println("UserGroupName are :" + UserGroupName);
				UserGroup().click();
				dropdownUserGroups().click();

			}
			
		/*	int i=1;
			
			while(CountUserGroup > 1) {
				String UserGroupName = driver.findElement(By.xpath(
						"//div[@class='ui-select-choices-group optgroup']//div[@role='option'][" + i + "]//div//span"))
						.getText();

				System.out.println("UserGroupName are :" + UserGroupName);
				UserGroup().click();
				dropdownUserGroups().click();
				i++;
						
			}*/
			
			
			chkbxGeoAware().click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void selectUsers() {

		try {
			if (dropdownUsers() != null && dropdownUsers().isDisplayed()) {
				dropdownUsers().click();

			}
			int CountUsers = UsersList().size();
			System.out.println("Totla Number of Userss are :" + CountUsers);
/*
			for (int i = 1; i < 73; i++) {

				String UsersName = driver.findElement(By.xpath(
						"//div[@class='ui-select-choices-group optgroup']//div[@role='option'][" + i + "]//div//span"))
						.getText();

				System.out.println("UserName are :" + UsersName);
				Users().click();
				dropdownUsers().click();

			}*/
			
			int j=1;
			
			while (CountUsers >= j ) {
				
				String UsersName = driver.findElement(By.xpath(
						"//div[@class='ui-select-choices-group optgroup']//div[@role='option'][" + j + "]//div//span"))
						.getText();

				System.out.println("UserName are :" + UsersName);
				Users().click();
				dropdownUsers().click();	
				j++;
			}
			
			
			
			
			chkbxGeoAware().click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
	
	public void selectInactiveRadioBtn() {
		
		if(radioBtnInactive() !=null && radioBtnInactive().isDisplayed()) {
			
			radioBtnInactive().click();
		}
		
	}
	
public void selectSubmitBtn() throws InterruptedException {
		
		if(BtnSubmit() !=null && BtnSubmit().isDisplayed()) {
			
			BtnSubmit().click();
			Thread.sleep(5000);
		}
		
	}
	
	

	
}
