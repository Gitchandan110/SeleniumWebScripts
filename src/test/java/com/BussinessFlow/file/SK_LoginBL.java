package com.BussinessFlow.file;

import java.io.IOException;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.PageObjectRepository.file.SK_LoginPL;

public class SK_LoginBL extends SK_LoginPL {

	String LoginDataSheet = "Login";

	public void fillEmail() {

		try {
			if (Email().isDisplayed()) {
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 3));
				System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 3));
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
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 4));
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

		if (BtnContinue().isDisplayed()) {

			BtnContinue().click();
		}

	}

}
