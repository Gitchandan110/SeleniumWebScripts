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
	SK_LoginBL loginSKbl=PageFactory.initElements(driver, SK_LoginBL.class);
	
	String LoginDataSheet = "Login";
	
	@BeforeMethod
	
	public void launchSKApp() throws InterruptedException, IOException {
		
		
		openProdSKApp();
	//	openTestSKApp();
	//	openIntSKApp();
			
	}
	
	
    @Test(priority=1)
	
	public void launchSafetyApp() throws IOException {
		
    	//loginSKbl.loginSA();
    	//loginSKbl.loginLA();
    	loginSKbl.loginObserver();
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
