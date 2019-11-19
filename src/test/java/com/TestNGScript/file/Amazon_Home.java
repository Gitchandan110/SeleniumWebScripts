package com.TestNGScript.file;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.Amazon_HomeBL;
import com.Commonutills.file.Base;
import com.PageObjectRepository.file.Amazon_SellPL;

public class Amazon_Home extends Base {
	
	Amazon_HomeBL homeAmazonbl=PageFactory.initElements(driver, Amazon_HomeBL.class);

	
	@BeforeMethod
	
	public void launchAmazon() {
		
		chromeDriver();
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
