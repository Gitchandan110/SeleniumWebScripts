package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class LoginSafetyKuvrrPL extends Base{
	
	
	public WebElement Email() {
		
		By email=By.cssSelector("input[type='text'][id='email']");
		return driver.findElement(email);
		
		
	}
	
	
     public WebElement Password() {
    	 
    	 By password=By.cssSelector("input[type='password'][id='password']");
    	 return driver.findElement(password);
    	 
     }
     
     
     
     public WebElement BtnContinue() {
    	 
    	 By btnContinue = By.cssSelector("input[class='btn'][id='submit']");
    	 
    	 return driver.findElement(btnContinue);
    	 
     }
}
