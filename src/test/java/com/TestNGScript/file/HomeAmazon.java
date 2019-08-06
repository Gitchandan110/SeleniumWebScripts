package com.TestNGScript.file;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.HomeAmazonBL;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SellAmazonPL;

public class HomeAmazon extends Base {
	
	HomeAmazonBL homeAmazonbl=PageFactory.initElements(driver, HomeAmazonBL.class);

	
	@BeforeMethod
	
	public void launchAmazon() {
		
		opendriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
		
		
	}
	
  @Test(priority=1)
  
  public void TestHomePageTitle() {
	  String title=homeAmazonbl.validateHomePageTitle();
	  System.out.println("Title of Home Page is : " + title);
	  Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
  }
  
    
  @Test(priority=2)
  
  public void TestAmazonLogo() {
	  
	  boolean flag=homeAmazonbl.validateAmazonLogo();
	  Assert.assertTrue(flag);
  }
  
  
  
  @Test(priority=3)
  
  public void TestAmazonSell() {
	  
	  homeAmazonbl.ClickOnBtnSell();
  }
  
   
  @AfterMethod
  
  public void tearDown() {
	  
	  driver.quit();
  }
}
