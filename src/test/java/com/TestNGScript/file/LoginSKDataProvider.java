package com.TestNGScript.file;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginSKDataProviderBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Excel2DArray;
import com.Commonutills.file.ExcelUtils;

public class LoginSKDataProvider extends Base {

	LoginSKDataProviderBL dataproviderbl = PageFactory.initElements(driver, LoginSKDataProviderBL.class);

	@BeforeMethod
	public void launchSKApp() throws IOException {

		opendriver();
		String url = ExcelUtils.ReadExcel("Login", 1, 0);
		driver.get(url);

	}

	@DataProvider

	public Object[][] getlogindata() throws FileNotFoundException {

		Object data[][] = Excel2DArray.getExcelData("ObsLogin");

		return data;

	}

	@Test(dataProvider = "getlogindata")

	public void loginSK(String Email, String Password) {

		dataproviderbl.login(Email, Password);

	}

	@AfterMethod

	public void closeApp() {

		driver.quit();

	}

}
