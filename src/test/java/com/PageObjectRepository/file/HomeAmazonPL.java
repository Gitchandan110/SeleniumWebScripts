package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Commonutills.file.Base;

public class HomeAmazonPL extends Base {


	public WebElement BtnSell() {

		By btnSell = By.xpath("//a[@class='nav-a'][contains(text(),'Sell')]");
		return driver.findElement(btnSell);

	}

	

	public WebElement BtnAmazonPay() {

		By btnAmazonPay = By.xpath("//a[contains(text(),'Amazon Pay')]");
		return driver.findElement(btnAmazonPay);

	}

	

	public WebElement BtnTodaysDeals() {
		By btnTodaysDeals = By.xpath("//a[contains(text(),\"Today's Deals\")]");
		return driver.findElement(btnTodaysDeals);

	}

	

	public WebElement LogoAmazon() {

		By logoAmazon = By.xpath("//a[@class='nav-logo-link'][@aria-label='Amazon']");
		return driver.findElement(logoAmazon);

	}

	

}