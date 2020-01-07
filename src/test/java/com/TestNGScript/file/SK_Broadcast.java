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
import com.Commonutills.file.ExcelWrite;

public class SK_Broadcast extends Base{
	SK_BroadcastBL broadcastbl=PageFactory.initElements(driver, SK_BroadcastBL.class);
	SK_LoginBL loginSKbl=PageFactory.initElements(driver, SK_LoginBL.class);
	
	String SanitySheet="Sanity_SK";
	
	@BeforeMethod
	
	public void launchSKApp() throws InterruptedException, IOException {
		
		
       	openProdSKApp();
		   // openTestSKApp();
        	//	openIntSKApp();
			
	}
	
	 @Test(priority=1)
		
		public void testBroadcastLA() throws IOException {
			
	     	loginSKbl.loginLA();
	    	broadcastbl.verifyBroadcastBtn();
			broadcastbl.verifyBroadcastMessage();
			broadcastbl.verifyBtnSubmit();
			ExcelWrite.writeSanitySheet(SanitySheet, 5, 1, "Pass");
			
	    }
	
	
    @Test(priority=2)
	
	public void testBroadcastObserver() throws IOException {
		
    
    	loginSKbl.loginObserver();
		broadcastbl.verifyBroadcastBtn();
		broadcastbl.verifyBroadcastMessage();
		broadcastbl.verifyBtnSubmit();
		ExcelWrite.writeSanitySheet(SanitySheet, 4, 1, "Pass");
		
    }
		

	
	
	@AfterMethod
	
	public void closeBrowser() {
		
		driver.quit();
	}
	

}
