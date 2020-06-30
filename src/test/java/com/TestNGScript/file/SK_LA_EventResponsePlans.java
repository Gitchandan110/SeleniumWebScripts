package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BussinessFlow.file.SK_HomePageBL;
import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_ManageERPBL;
import com.BussinessFlow.file.SK_ManageTemplatesBL;
import com.BussinessFlow.file.SK_VisitorPassesBL;
import com.BussinessFlow.file.SK_MenuListBL;
import com.BussinessFlow.file.SK_ScheduleNotificationBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_LA_EventResponsePlans extends Base {

	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_MenuListBL menuList=PageFactory.initElements(driver, SK_MenuListBL.class);
	SK_ManageERPBL erpBL=PageFactory.initElements(driver, SK_ManageERPBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws InterruptedException, IOException {

		 //   openProdSKApp();
        openTestSKApp();
  //	openIntSKApp();
	    	
	}

	@Test()

	public void ManageTemplates() throws IOException, InterruptedException {

		
    	loginSKbl.loginLA();
      	homePageMenuBL.verifyHamburgerMenu();
    	menuList.clickEventResponsePlans();
    	menuList.clickManageERP();
    //	erpBL.verifyERPListScreen();
    	erpBL.verifyEditERP();
    	
	}

	@AfterMethod

	public void closeBrowser() {

       driver.quit();
	
	}

}