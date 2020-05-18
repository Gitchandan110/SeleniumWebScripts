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
import com.BussinessFlow.file.SK_IssueVisitorPassBL;
import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_VisitorPassesBL;
import com.BussinessFlow.file.SK_MenuListBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_LA_VisitorPasses extends Base {

	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_MenuListBL menuList=PageFactory.initElements(driver, SK_MenuListBL.class);
	SK_VisitorPassesBL visitorPassesbl=PageFactory.initElements(driver, SK_VisitorPassesBL.class);
	SK_IssueVisitorPassBL issuePassbl=PageFactory.initElements(driver, SK_IssueVisitorPassBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws InterruptedException, IOException {

		 //   openProdSKApp();
	     //   openTestSKApp();
   	 	openIntSKApp();
	    
	}

	@Test(priority=1)

	public void MangaeVisitorPasses() throws IOException, InterruptedException {

		
    	loginSKbl.loginLA();
    	homePageMenuBL.verifyHamburgerMenu();
    	menuList.clickMenuVisitorManagement();
    	menuList.clickVisitorPasses();
    	visitorPassesbl.verifyManageVisitorPasses();
	}
	
	
	@Test(priority=2)

	public void IssueVisitorPass() throws IOException, InterruptedException {

		
		loginSKbl.loginLA();
    	homePageMenuBL.verifyHamburgerMenu();
    	menuList.clickMenuVisitorManagement();
    	menuList.clickVisitorPasses();
    	visitorPassesbl.clickIssueVisitorPass();
    	issuePassbl.verifyIssueVisitorPass();
	}

	
	
	

	@AfterMethod

	public void closeBrowser() {

    driver.quit();
	
	}

}