package com.TestNGScript.file;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.Amazon_LoginBL;
import com.Commonutills.file.Base;

//TEst

public class LoginAmazon extends Base{
	
	Amazon_LoginBL loginAmz=PageFactory.initElements(driver, Amazon_LoginBL.class);

	
	
	
	@BeforeMethod
	
	public void launchAmazon() throws InterruptedException {
		
		chromeDriver();
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
