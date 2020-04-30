package com.BussinessFlow.file;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_ClosedIncidentPL;

public class SK_ClosedIncidentBL extends SK_ClosedIncidentPL {

	String SanitySheet = "Sanity_SK";
	

	
	public void clickSOSIncident() throws InterruptedException {

		try {

			if (closedSOS() !=null && closedSOS().isDisplayed()) {
				Base.scrolltoElement(driver, closedSOS());
				String mainWindow = driver.getWindowHandle();
				Base.takeScreenShot("Closed Incidents");
				ExcelWrite.writeSanitySheet(SanitySheet, 33, 1, "Pass");
				Thread.sleep(3000);
				closedSOS().click();
				System.out.println("Closed SOS Incident found and selected");
				Thread.sleep(5000);
				Base.manageChildWindow();
				Base.scrolltoElement(driver, videoContainer());
				ExcelWrite.writeSanitySheet(SanitySheet, 34, 1, "Pass");
				System.out.println("Please wait for 10 seconds");
				Thread.sleep(10000);
				Base.takeScreenShot("Closed Incidents");
				driver.close();
				driver.switchTo().window(mainWindow);
				

			} else {

				System.out.println("No Close Incident Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickSafeWalkIncident() throws InterruptedException {

		try {

			if (closedSafeWalk() !=null && closedSafeWalk().isDisplayed()) {
				Base.scrolltoElement(driver, closedSafeWalk());
				String mainWindow = driver.getWindowHandle();
				Thread.sleep(3000);
				Base.highLightElement(driver, closedSafeWalk());
				closedSafeWalk().click();
				System.out.println("Closed Safe Walk Incident found and selected");
				Thread.sleep(5000);
				Base.manageChildWindow();
				Base.scrolltoElement(driver, videoContainer());
				System.out.println("Please wait for 10 seconds");
				Thread.sleep(10000);
				ExcelWrite.writeSanitySheet(SanitySheet, 35, 1, "Pass");
				Base.takeScreenShot("Closed Incidents");
				driver.close();
				driver.switchTo().window(mainWindow);

			} else {

				System.out.println("No Close Safe Walk Incident Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click911Incident() throws InterruptedException {

		try {
			
			if (closed911() != null && closed911().isDisplayed()) {
				Base.scrolltoElement(driver, closed911());
				String mainWindow = driver.getWindowHandle();
				Thread.sleep(3000);
				Base.highLightElement(driver, closed911());
	     		Thread.sleep(2000);
				closed911().click();
				System.out.println("911 Incident found and selected");
				Thread.sleep(5000);
				Base.manageChildWindow();
				Base.scrolltoElement(driver, videoContainer());
				Base.takeScreenShot("Closed Incidents");
				System.out.println("Please wait for 5 seconds");
				Thread.sleep(5000);
				ExcelWrite.writeSanitySheet(SanitySheet, 36, 1, "Pass");
				driver.close();
				driver.switchTo().window(mainWindow);
				
			} else {

				System.out.println("No 911 Incident Found");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
