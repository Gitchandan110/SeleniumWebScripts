package com.TestNGScript.file;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.BussinessFlow.file.SK_OrganizationBL;
import com.BussinessFlow.file.SafetyKuvrrHomePageMenuBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_OrganizationPage extends Base {

	SafetyKuvrrHomePageMenuBL homePageMenuBL = PageFactory.initElements(driver, SafetyKuvrrHomePageMenuBL.class);
	LoginSafetyKuvrrBL loginSafetyKuvrrBL = PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);
	SK_OrganizationBL organizationBL=PageFactory.initElements(driver, SK_OrganizationBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchApp() throws IOException, InterruptedException {

		chromeDriver();
	//	opendriver();
		String url = ExcelUtils.ReadExcel(LoginDataSheet, 1, 0);
		driver.get(url);
		Thread.sleep(5000);

	}

	@Test()

	public void TestOrganizationPage() throws InterruptedException, IOException {

		loginSafetyKuvrrBL.fillEmail();
		loginSafetyKuvrrBL.fillPassword();
		loginSafetyKuvrrBL.clickContinue();
		homePageMenuBL.verifyHamburgerMenu();
		homePageMenuBL.VerifyOrganizationlink();
		organizationBL.getOrgPageRowCount();
		organizationBL.getOrgPageColumnCount();
		organizationBL.getColumnHeader();
		organizationBL.getOrganizationName();
		organizationBL.getOrganizationAddress();
		organizationBL.getOrganizationCity();
		organizationBL.getOrganizationState();
		organizationBL.getOrganizationPostalCode();
		organizationBL.getOrganizationCountry();
		organizationBL.getOrganizationStatus();
	}

	@AfterMethod

	public void closeBrowser() {

		//driver.quit();
	}
}

