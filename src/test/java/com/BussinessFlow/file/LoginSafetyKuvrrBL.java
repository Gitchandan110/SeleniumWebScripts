package com.BussinessFlow.file;


import java.io.IOException;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.PageObjectRepository.file.LoginSafetyKuvrrPL;

public class LoginSafetyKuvrrBL extends LoginSafetyKuvrrPL {
	
	String LoginDataSheet="Login";
	
public void fillEmail() {

	try {
			if (Email().isDisplayed()) {
				System.out.println("Email Found");
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 1));
				System.out.println("Email is:"+ ExcelUtils.ReadExcel(LoginDataSheet, 1, 1));
				System.out.println("Email entered");
			}

			else {
				System.out.println("Email not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Email:" + ex.getMessage());
			System.out.println("StackTrace in Email:" + ex.getStackTrace());
			System.out.println("ExceptionCause in Email:" + ex.getCause());
		}

	}

	public void fillPassword() {

		try {

			if (Password().isDisplayed()) {
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Password:" + ex.getMessage());
		}

	}
	
	public void clickContinue() {
		
		if (BtnContinue().isDisplayed()){
			
			BtnContinue().click();
		}
		
		
	}
	

}
