package com.BussinessFlow.file;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ManageTemplatesPO;

import junit.framework.Assert;

public class SK_ManageTemplatesBL extends SK_ManageTemplatesPO {

	public void verifyManageTemplates() throws Exception {

		if (pageManageTemplate() != null && pageManageTemplate().isDisplayed()) {
			Assert.assertEquals("Manage Templates", driver.getTitle());
			System.out.println("Landed on Manage Templates Page");
			Base.FullPageScreenShot("Manage Templates");
		}

		else {

			System.out.println("Unable to find Manage Templates Page");
		}

		if (filterTemplateTiltle() != null && filterTemplateTiltle().isDisplayed()) {
			Base.highLightElement(driver, filterTemplateTiltle());
			filterTemplateTiltle().sendKeys("Template");
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Manage Templates");
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
			Base.takeScreenShot("Manage Templates");
			btnClear().click();
			System.out.println("filterActiveStatus() Pass");
			Base.waitFor30Seconds(filterStatus());
			filterStatus().click();
			filterInactiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Manage Templates");
			btnClear().click();
			System.out.println("filterInactiveStatus() Pass");
			Thread.sleep(5000);

		}
		if (linkDetails() != null && linkDetails().isDisplayed()) {
			System.out.println("linkDetails found");
			linkDetails().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Notification Template Detail");
			Base.scrollEndofthePage(driver);
			Thread.sleep(3000);
			btnCancelDetails().click();
			Thread.sleep(5000);

		}
	}

	public void clickLinkCreateTemplate() throws Exception {

		if (linkCreateTemplate() != null && linkCreateTemplate().isDisplayed()) {
			Base.highLightElement(driver, linkCreateTemplate());
			linkCreateTemplate().click();
			Thread.sleep(5000);
		}

	}

	public void fillNotificationContent() throws Exception {

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
			/*
			 * chkbxGeoAware().click(); System.out.println("chkbxGeoAware() done");
			 */
			txtIVR().sendKeys("This is IVR Notification Template");
			System.out.println("Text to Voice done");

		}

	}

	public void selectUserGroup() throws Exception {

		if (dropdownUserGroups() != null && dropdownUserGroups().isDisplayed()) {
			dropdownUserGroups().click();
			int CountUserGroup = UserGroupList().size();
			System.out.println("Total Number of User Groups are :" + CountUserGroup);

			for (int i = 1; i <= 3; i++) {

				String UserGroupName = driver.findElement(By.xpath(
						"//div[@class='ui-select-choices-group optgroup']//div[@role='option'][" + i + "]//div//span"))
						.getText();

				System.out.println("UserGroupName are :" + UserGroupName);
				UserGroup().click();

			}

		}

	}

	public void selectUsers() throws Exception {

		if (dropdownUsers() != null && dropdownUsers().isDisplayed()) {
			dropdownUsers().click();
			Base.takeScreenShot("Manage Templates");
		}
		int CountUsers = UsersList().size();
		System.out.println("Total Number of Userss are :" + CountUsers);

		for (int i = 1; i < 4; i++) {

			String UsersName = driver.findElement(By.xpath(
					"//div[@class='ui-select-choices-group optgroup']//div[@role='option'][" + i + "]//div//span"))
					.getText();

			System.out.println("UserName are :" + UsersName);
			Users().click();
			dropdownUsers().click();

		}

	}

	public void selectInactiveRadioBtn() throws Exception {

		if (radioBtnInactive() != null && radioBtnInactive().isDisplayed()) {

			radioBtnInactive().click();
		}

	}

	public void selectSubmitBtn() throws Exception {

		if (BtnSubmit() != null && BtnSubmit().isDisplayed()) {
			Base.FullPageScreenShot("Create Notification Templates");
			BtnSubmit().click();
			Thread.sleep(8000);

		}

		if (ErrorMessage().isDisplayed()) {
			System.out.println("Create Notification Template Fail");
			Base.FullPageScreenShot("Create Notification Template Fail");

		}

	}

}
