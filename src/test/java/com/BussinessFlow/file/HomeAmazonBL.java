package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.HomeAmazonPL;
import com.PageObjectRepository.file.SellAmazonPL;
import com.PageObjectRepository.file.TodaysDealsPL;

public class HomeAmazonBL extends HomeAmazonPL{
	
	
	
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
