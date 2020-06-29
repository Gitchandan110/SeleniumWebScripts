package com.BussinessFlow.file;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_LoginPO;

public class SK_LoginBL extends SK_LoginPO {

	String LoginDataSheet = "Login";
	String SanitySheet = "Sanity_SK";

	public void loginSA() throws IOException, InterruptedException {

		try {
			if (Email().isDisplayed()) {
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
				System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
			}

			else {
				System.out.println("Email not entered");
			}
			if (Password().isDisplayed()) {
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 3));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}

			if (BtnContinue().isDisplayed()) {
				Base.FullPageScreenShot("LoginScreen_SA");
				BtnContinue().click();
				Thread.sleep(5000);

			}

			if (errorLoginFail().isDisplayed()) {
				Base.FullPageScreenShot("LoginFail_SA");
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 1, 1, "Fail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loginLA() throws IOException, InterruptedException {

		try {
			if (Email().isDisplayed()) {
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 4));
				System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 4));
			}

			else {
				System.out.println("Email not entered");
			}

			if (Password().isDisplayed()) {

				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 5));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}

			if (BtnContinue().isDisplayed()) {
				Base.FullPageScreenShot("LoginScreen_LA");
				BtnContinue().click();
				Thread.sleep(5000);

			}

			if (errorLoginFail().isDisplayed()) {
				Base.FullPageScreenShot("LoginFail_LA");
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 21, 2, "Fail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loginObserver() throws IOException, InterruptedException {

		try {
			if (Email().isDisplayed()) {
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 6));
				System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 6));
			}

			else {
				System.out.println("Email not entered");
			}

			if (Password().isDisplayed()) {
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 7));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}

			if (BtnContinue().isDisplayed()) {
				Base.FullPageScreenShot("LoginScreen_Observer");
				BtnContinue().click();
				Thread.sleep(3000);

			}

			if (errorLoginFail().isDisplayed()) {
				Base.FullPageScreenShot("LoginFail_Observer");
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 3, 1, "Fail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
