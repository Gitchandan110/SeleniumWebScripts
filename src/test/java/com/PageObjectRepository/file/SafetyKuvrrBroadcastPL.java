package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SafetyKuvrrBroadcastPL extends Base {

	public WebElement BtnBroadcast() {

		By btnBroadcast = By.xpath("//a[@class='broadcast-btn']");
		return driver.findElement(btnBroadcast);

	}

	public WebElement TextboxBroadcast() {

		By textboxBroadcast = By.xpath("//textarea[@id='message'][@name='message']");
		return driver.findElement(textboxBroadcast);

	}

	public WebElement BtnSubmit() {

		By btnSubmit = By.xpath("//input[@type='submit'][@id='submit']");

		return driver.findElement(btnSubmit);
	}

	public WebElement BtnCancel() {

		By btnCancel = By.xpath("//a[@class='btn cancel'][@id='cancel']");

		return driver.findElement(btnCancel);
	}

}
