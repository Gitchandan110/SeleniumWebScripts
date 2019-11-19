package com.BussinessFlow.file;

import com.PageObjectRepository.file.SK_LoginPL;

public class SK_DataProviderBL extends SK_LoginPL{
	
	
		
	public void login(String Email, String Password) {
		
		Email().sendKeys(Email);
		Password().sendKeys(Password);
		BtnContinue().click();
		
		
	}
	

}
