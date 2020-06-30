package com.BussinessFlow.file;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ERP_PO;
import junit.framework.Assert;

public class SK_ManageERPBL extends SK_ERP_PO {
	
	SK_HomePageBL homepageBL;
	SK_MenuListBL menulistBL;

	public void verifyERPListScreen() {

		try {
			if (titleListERP() != null && titleListERP().isDisplayed()) {
				Assert.assertEquals("List of Emergency Response Plans", driver.getTitle());
				System.out.println("Landed on List ERP Screen");
				
				if(btnFilter() !=null && btnFilter().isDisplayed()) {
				   btnFilter().click();
				   filterTitle().click();
				   filterTitle().sendKeys("Chemical Exposure");
				   btnSubmit().click();
				   Thread.sleep(3000);
				   Base.FullPageScreenShot("ERP Title Filter");
				   System.out.println("Title Filter Pass");
				   btnFilter().click();
				   filterTitle().clear();
				   btnSubmit().click();
				   Thread.sleep(3000);
				   btnFilter().click();
				   filterOrganization().click();
				   filterOrganization().sendKeys("OrgNCR");
				   Thread.sleep(2000);
				   Base.FullPageScreenShot("ERP Organization Filter");
				   btnSubmit().click();
			   	   Thread.sleep(3000);
			    	System.out.println("Organization Filter Pass");
				   btnFilter().click();
				   filterOrganization().clear();
				   Thread.sleep(2000);
				   btnSubmit().click();
				   Thread.sleep(3000);
				   btnFilter().click();
				   filterICon().click();
				   filterICon().sendKeys("https://s3.amazonaws.com/erp-icon/fire.png");
				   btnSubmit().click();
				   Thread.sleep(3000);
				   Base.FullPageScreenShot("ERP ICON Filter");
				   System.out.println("ICON Filter Pass");
				   btnFilter().click();
				   filterICon().clear();
				   btnSubmit().click();
				   Thread.sleep(3000);
				   linkDetails().click();
				   Base.FullPageScreenShot("ERP Details");
				   driver.navigate().back();
				   Thread.sleep(3000);
				   
				}
	}

			else {

				System.out.println("ERP Screen has issue");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void verifyEditERP() throws InterruptedException {
		
		int ErpRowCount=tableRow().size();
		System.out.println("Total Row Count is : "+ ErpRowCount);
		
//	WebElement buttonEdit=driver.findElement(By.xpath("//table[@summary='List of Emergency Response Plans']//tbody//tr//td[2]//a"));		
		
	//	for (int i=1; i <= ErpRowCount; i++) {
			
			int i=1;
			while(ErpRowCount >= i) {
				
				
		driver.findElement(By.xpath("//table[@summary='List of Emergency Response Plans']//tbody//tr["+ i +"]//td[2]//a")).click();
		Thread.sleep(3000);
		Base.scrolltoElement(driver, btnSortingKeys());
		btnSortingKeys().click();
		btnSortingKeys().clear();
		btnSortingKeys().sendKeys("5");
		btnSubmit().click();
		Thread.sleep(5000);
		driver.navigate().to("https://safety-test.kuvrr.com/erp/");
		Thread.sleep(5000);
        i++;
					
		}
		
		
		
	}
	
	
	
	

}
