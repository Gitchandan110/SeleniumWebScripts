package com.BussinessFlow.file;

import org.openqa.selenium.By;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ScheduleNotificationPO;

import junit.framework.Assert;

public class SK_ScheduleNotificationBL extends SK_ScheduleNotificationPO {

	public void verifyScheduleNotification() {

		try {
			if (pageTitle() != null && pageTitle().isDisplayed()) {
				Assert.assertEquals("Schedule Notification", driver.getTitle());
				System.out.println("Landed on Schedule Notification Page");
				
				
			}

			else {

				System.out.println("Unable to find Schedule Notification Page");
			}

			if (filterTitle() != null && filterTitle().isDisplayed()) {
				Base.highLightElement(driver, filterTitle());
				filterTitle().sendKeys("SchDaily");
				btnFilter().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Schedule Notification Title");
				btnClear().click();
				System.out.println("Schedule Notification Filter Pass");
				Base.waitFor30Seconds(ddStatus());
			}

			if (ddStatus() != null && ddStatus().isDisplayed()) {
				Base.highLightElement(driver, ddStatus());
				ddStatus().click();
				Thread.sleep(2000);
				filterActiveStatus().click();
				btnFilter().click();
				Thread.sleep(5000);
				Base.FullPageScreenShot("Schedule Notification Active");
				btnClear().click();
				System.out.println("filterActiveStatus() Pass");
				Base.waitFor30Seconds(ddStatus());
				ddStatus().click();
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
				Base.FullPageScreenShot("Schedule Notification Details");
				Base.scrollEndofthePage(driver);
				Thread.sleep(3000);
				btnCancelDetails().click();
				Thread.sleep(5000);

			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in Schedule Notification Page:" + e.getMessage());
		}
	}

	public void clickLinkNewSchedule() throws InterruptedException {

		try {
			if (linkCreateNewSchedule() != null && linkCreateNewSchedule().isDisplayed()) {
				Base.highLightElement(driver, linkCreateNewSchedule());
				linkCreateNewSchedule().click();
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createNewScheduleNotification() throws InterruptedException {

		try {
			if (ddSelectTemplate() != null && ddSelectTemplate().isDisplayed()) {
				ddSelectTemplate().click();
				System.out.println("ddSelectTemplate() Clicked");
				Base.takeScreenShot("Notifications");
				Thread.sleep(3000);
				templateOption().click();
				Thread.sleep(3000);
				Base.takeScreenShot("Notifications");
				System.out.println("templateOption() selected");
				Base.scrolltoElement(driver, ddTimeZone());
				ddTimeZone().click();
				Thread.sleep(3000);
				textTimeZone().sendKeys("Asia/Kolkata");
				optionAsiaKolkata().click();
				System.out.println("optionAsiaKolkata() Selected");
				Base.takeScreenShot("Notifications");
				btnCalendarStartDate().click();
				selectCalendarDate().click();
				Base.FullPageScreenShot("Create Schedule Notification");
				btnSubmitSchedule().click();
				Thread.sleep(5000);
				if (ErrorMessage().isDisplayed()) {
				System.out.println("Create Schedule Notification Fail");
				Base.FullPageScreenShot("Create Schedule Notification Fail");

				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		
public void selectSubmitBtn() throws InterruptedException {
		
		if(BtnSubmit() !=null && BtnSubmit().isDisplayed()) {
			BtnSubmit().click();
			Thread.sleep(5000);
		}
		
	}
	
	

	
}
