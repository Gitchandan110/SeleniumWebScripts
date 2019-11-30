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

	public void launchSKApp() throws InterruptedException, IOException {

		openProdSKApp();
		//	openTestSKApp();
		//	openIntSKApp();

	}

	@Test(priority=1)

	public void loginLASafetyKuvrr() throws IOException {
		
		
		loginSKbl.loginLA();

		
	
	}
	
	@Test(priority=2)

	public void loginSASafetyKuvrr() throws IOException {
		
		
		loginSKbl.loginSA();
		
		
	
	}
	
	@Test(priority=3)

	public void loginObsSafetyKuvrr() throws IOException {
		
		
	
		loginSKbl.loginObserver();
		
	
	}


	@AfterMethod

	public void closeBrowser() {

   	driver.quit();
	}

}
