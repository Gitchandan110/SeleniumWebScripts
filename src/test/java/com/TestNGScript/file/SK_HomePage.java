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

	public void launchSKApp() throws InterruptedException, IOException {

		openProdSKApp();
		//	openTestSKApp();
		//	openIntSKApp();

	}

	@Test()

	public void TestHambugerMenuClick() throws InterruptedException, IOException {

		loginSafetyKuvrrBL.loginSA();
		homePageMenuBL.verifyHamburgerMenu();
		homePageMenuBL.VerifyOrganizationlink();

	}

	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}
}
