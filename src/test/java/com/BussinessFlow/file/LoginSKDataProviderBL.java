package com.BussinessFlow.file;

import com.PageObjectRepository.file.LoginSafetyKuvrrPL;

public class LoginSKDataProviderBL extends LoginSafetyKuvrrPL{
	
	
		
	public void login(String Email, String Password) {
		
		Email().sendKeys(Email);
		Password().sendKeys(Password);
		BtnContinue().click();
		
		
	}
	

}
