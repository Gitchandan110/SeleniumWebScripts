package com.TestNGScript.file;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginAmazonBL;
import com.Commonutills.file.Base;

//TEst

public class LoginAmazon extends Base{
	
	LoginAmazonBL loginAmz=PageFactory.initElements(driver, LoginAmazonBL.class);

	
	
	
	@BeforeMethod
	
	public void launchAmazon() throws InterruptedException {
		
		opendriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
		Thread.sleep(5000);
		
	}
	
	
	
	@Test
	public void TestLoginAmazon() throws InterruptedException {
		
		loginAmz.login();
		
		
	}
	
	
	@AfterMethod
	
	public void killApp() {
		
		driver.quit();
	}

}
