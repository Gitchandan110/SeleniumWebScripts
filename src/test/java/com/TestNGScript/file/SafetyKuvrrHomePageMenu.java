package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.BussinessFlow.file.SafetyKuvrrHomePageMenuBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SafetyKuvrrHomePageMenu extends Base {

	SafetyKuvrrHomePageMenuBL homePageMenuBL = PageFactory.initElements(driver, SafetyKuvrrHomePageMenuBL.class);
	LoginSafetyKuvrrBL loginSafetyKuvrrBL = PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchApp() throws IOException, InterruptedException {

		opendriver();
		String url = ExcelUtils.ReadExcel(LoginDataSheet, 1, 0);
		driver.get(url);
		Thread.sleep(5000);

	}

	@Test()

	public void TestHambugerMenuClick() throws InterruptedException {

		loginSafetyKuvrrBL.fillEmail();
		loginSafetyKuvrrBL.fillPassword();
		loginSafetyKuvrrBL.clickContinue();
		homePageMenuBL.verifyHamburgerMenu();
		homePageMenuBL.VerifyOrganizationlink();

	}

	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}
}
