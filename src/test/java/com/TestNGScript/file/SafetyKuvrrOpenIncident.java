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

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.BussinessFlow.file.SafetyKuvrrIncidentBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SafetyKuvrrOpenIncident extends Base {

	SafetyKuvrrIncidentBL incidentbl = PageFactory.initElements(driver, SafetyKuvrrIncidentBL.class);
	LoginSafetyKuvrrBL loginSafetyKuvrrBL = PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws InterruptedException, IOException {

		opendriver();
		String url = ExcelUtils.ReadExcel(LoginDataSheet, 1, 0);
		driver.get(url);
		Thread.sleep(5000);

	}

	@Test()

	public void launchSafetyApp() throws IOException, InterruptedException {

		loginSafetyKuvrrBL.fillEmail();
		loginSafetyKuvrrBL.fillPassword();
		loginSafetyKuvrrBL.clickContinue();
		incidentbl.clickOpenIncident();
		
	}

	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}

}