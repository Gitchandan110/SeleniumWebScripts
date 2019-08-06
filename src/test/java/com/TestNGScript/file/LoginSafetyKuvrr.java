package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSafetyKuvrrBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class LoginSafetyKuvrr extends Base {
	LoginSafetyKuvrrBL loginSKbl=PageFactory.initElements(driver, LoginSafetyKuvrrBL.class);
	String LoginDataSheet = "Login";
	


	@BeforeMethod

	public void launchSK() throws IOException {

	
		chromeDriver();
	    String url=ExcelUtils.ReadExcel(LoginDataSheet, 1, 0);
		driver.get(url);		
		
	}

	@Test

	public void loginSafetyKuvrr() throws IOException {
		
		
		loginSKbl.fillEmail();
		loginSKbl.fillPassword();
		loginSKbl.clickContinue();
	}

	@AfterMethod

	public void closeBrowser() {

	driver.quit();
	}

}
