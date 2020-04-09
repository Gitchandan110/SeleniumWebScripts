package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_OpenIncidentBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_Observer_OpenIncident extends Base {

	SK_OpenIncidentBL incidentbl = PageFactory.initElements(driver, SK_OpenIncidentBL.class);
	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws InterruptedException, IOException {

		//  openProdSKApp();
    	//	openTestSKApp();
			openIntSKApp();


	}

	@Test()

	public void launchSafetyApp() throws IOException, InterruptedException {

	
		loginSKbl.loginObserver();
		incidentbl.clickIncomingIncident();
		incidentbl.clickSmartResponse();
		incidentbl.enterEventNotes();
		incidentbl.clickIncidentActionsClose();
		incidentbl.clickIncidentResolutionFalseAlarm();
		incidentbl.enterIncidentActionResponse();
		incidentbl.clickIconShareIncident();
		incidentbl.submitShareIncident();
		
	}

	@AfterMethod

	public void closeBrowser() {

 	driver.quit();
	
	}

}