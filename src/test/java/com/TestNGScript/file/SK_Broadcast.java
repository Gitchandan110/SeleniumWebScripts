package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_BroadcastBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_Broadcast extends Base{
	SK_BroadcastBL broadcastbl=PageFactory.initElements(driver, SK_BroadcastBL.class);
	SK_LoginBL loginSafetyKuvrrBL=PageFactory.initElements(driver, SK_LoginBL.class);
	
	String LoginDataSheet = "Login";
	
	@BeforeMethod
	
	public void launchSKApp() throws InterruptedException, IOException {
		
		chromeDriver();
		String url=ExcelUtils.ReadExcel(LoginDataSheet, 1, 0);
		driver.get(url);
		Thread.sleep(5000);
	
		
			
	}
	
	
    @Test(priority=1)
	
	public void launchSafetyApp() throws IOException {
		
		loginSafetyKuvrrBL.fillEmail();
		loginSafetyKuvrrBL.fillPassword();
		loginSafetyKuvrrBL.clickContinue();
		broadcastbl.verifyBroadcastBtn();
		broadcastbl.verifyBroadcastMessage();
		broadcastbl.verifyBtnSubmit();
	//	broadcastbl.verifyBtnCancel();
		
    }
		

	
	
	@AfterMethod
	
	public void closeBrowser() {
		
		driver.quit();
	}
	

}
