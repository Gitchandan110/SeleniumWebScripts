package com.BussinessFlow.file;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_LoginPL;

public class SK_LoginBL extends SK_LoginPL {

	String LoginDataSheet = "Login";
	String SanitySheet = "Sanity_SK";

	public void loginProdSA() throws IOException {

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
				BtnContinue().click();
				Thread.sleep(2000);

			}

			if (driver.getTitle().contains("Active Events")) {

				System.out.println("Page Title verified. Login successfull");
				ExcelWrite.writeSanitySheet(SanitySheet, 20, 2, "Pass");

			}

			if (errorLoginFail().isDisplayed()) {
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 20, 2, "Fail");
			}

		} catch (Exception ex) {

			System.out.println("Exception message:" + ex.getMessage());
			System.out.println("StackTrace error:" + ex.getStackTrace());
			System.out.println("ExceptionCause :" + ex.getCause());
		}

	}

	public void loginProdLA() throws IOException {

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
				BtnContinue().click();
				Thread.sleep(2000);

			}

			if (driver.getTitle().contains("Active Events")) {

				System.out.println("Page Title verified. Login successfull");
				ExcelWrite.writeSanitySheet(SanitySheet, 21, 2, "Pass");

			}

			if (errorLoginFail().isDisplayed()) {
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 21, 2, "Fail");
			}

		} catch (Exception ex) {

			System.out.println("Exception message:" + ex.getMessage());
			System.out.println("StackTrace error:" + ex.getStackTrace());
			System.out.println("ExceptionCause :" + ex.getCause());
		}

	}

	public void loginProdObserver() throws IOException {

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
				BtnContinue().click();
				Thread.sleep(2000);

			}

			if (driver.getTitle().contains("Active Events")) {

				System.out.println("Page Title verified. Login successfull");
				ExcelWrite.writeSanitySheet(SanitySheet, 22, 2, "Pass");

			}

			if (errorLoginFail().isDisplayed()) {
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 22, 2, "Fail");
			}

		} catch (Exception ex) {

			System.out.println("Exception message:" + ex.getMessage());
			System.out.println("StackTrace error:" + ex.getStackTrace());
			System.out.println("ExceptionCause :" + ex.getCause());
		}

	}

}
