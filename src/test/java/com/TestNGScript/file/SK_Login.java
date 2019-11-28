package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_Login extends Base {
	SK_LoginBL loginSKbl=PageFactory.initElements(driver, SK_LoginBL.class);
	String LoginDataSheet = "Login";
	


	@BeforeMethod

	public void launchSK() throws IOException {

	
		chromeDriver();
	    String url=ExcelUtils.ReadExcel(LoginDataSheet, 1, 1);
		driver.get(url);		
		
	}

	@Test(priority=1)

	public void loginLASafetyKuvrr() throws IOException {
		
		
		loginSKbl.loginProdLA();

		
	
	}
	
	@Test(priority=2)

	public void loginSASafetyKuvrr() throws IOException {
		
		
		loginSKbl.loginProdSA();
		//	loginSKbl.loginProdObserver();
		
	
	}
	
	@Test(priority=3)

	public void loginObsSafetyKuvrr() throws IOException {
		
		
	
		loginSKbl.loginProdObserver();
		
	
	}


	@AfterMethod

	public void closeBrowser() {

   	driver.quit();
	}

}
