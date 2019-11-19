package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_HomePageBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_HomePage extends Base {

	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_LoginBL loginSafetyKuvrrBL = PageFactory.initElements(driver, SK_LoginBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchApp() throws IOException, InterruptedException {

		chromeDriver();
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
