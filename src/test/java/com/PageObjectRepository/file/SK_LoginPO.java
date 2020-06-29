package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_LoginPO extends Base {

	public WebElement Email() {

		By email = By.cssSelector("input[type='text'][id='email']");
		return driver.findElement(email);

	}

	public WebElement Password() {

		By password = By.cssSelector("input[type='password'][id='password']");
		return driver.findElement(password);

	}

	public WebElement BtnContinue() {

		By btnContinue = By.cssSelector("input[class='btn'][id='submit']");

		return driver.findElement(btnContinue);

	}

	public WebElement errorLoginFail() {

		By loginFail = By.xpath("//div[@class='alert alert-error']");
		return driver.findElement(loginFail);

	}
	
	public WebElement errorMessage() {

		By errorMessage = By.xpath("//p[@class='error' and contains (text(),'Invalid user name or password')]");
		return driver.findElement(errorMessage);

	}

	

}
