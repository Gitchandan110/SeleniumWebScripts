package com.TestNGScript.file;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_OrganizationBL;
import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_HomePageBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_SA_Prod_OrganizationPage extends Base {

	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_LoginBL prodSALoginbl=PageFactory.initElements(driver, SK_LoginBL.class);
	SK_LoginBL loginSafetyKuvrrBL = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_OrganizationBL organizationBL=PageFactory.initElements(driver, SK_OrganizationBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchApp() throws IOException, InterruptedException {

		chromeDriver();
	//	opendriver();
		String url = ExcelUtils.ReadExcel(LoginDataSheet, 1, 1);
		driver.get(url);
		Thread.sleep(5000);

	}

	@Test()

	public void TestOrganizationPage() throws InterruptedException, IOException {

		prodSALoginbl.loginProdSA();
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

		driver.quit();
	}
}

