package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Commonutills.file.Base;

public class LoginAmazonPL extends Base {


	public WebElement BtnSignIn() {
		
		By btnSignIn=By.cssSelector("a[data-nav-role='signin'][data-nav-ref='nav_ya_signin'][id='nav-link-yourAccount']");
		
		return driver.findElement(btnSignIn);

	}

	public WebElement Email() {
		By email = By.xpath("//*[@id='ap_email'][@type='email']");
		return driver.findElement(email);
	}
	
	
	public WebElement Password() {
	By password=By.xpath("//input[@id='ap_password'][@type='password']");
	return driver.findElement(password);
	
	}
	
	public WebElement BtnLogin() {
	By btnLogin=By.cssSelector("input[id='signInSubmit'][type='submit']");	
	return driver.findElement(btnLogin);
		
		
	}

	public WebElement LogoAmazon() {

		By logoAmazon = By.xpath("//i[@class='a-icon a-icon-logo']");
		return driver.findElement(logoAmazon);
	}

	public WebElement BtnContinue() {

		By btnContinue = By.cssSelector("input[id='continue'][type='submit']");
		return driver.findElement(btnContinue);

	}

}
