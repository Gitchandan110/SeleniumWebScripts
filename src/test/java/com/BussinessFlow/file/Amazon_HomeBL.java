package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.Amazon_HomePL;
import com.PageObjectRepository.file.Amazon_SellPL;
import com.PageObjectRepository.file.TodaysDealsPL;

public class Amazon_HomeBL extends Amazon_HomePL{
	
	
	
	public void ClickOnBtnSell() {
		 Base.highLightElement(driver, BtnSell());
	     BtnSell().click();
	

	}
	
	
	public void TodaysDeals() {
		BtnTodaysDeals().click();
	
	}
	public boolean validateAmazonLogo() {
		return LogoAmazon().isDisplayed();

	}

	public String validateHomePageTitle() {
	return driver.getTitle();

	}

}
