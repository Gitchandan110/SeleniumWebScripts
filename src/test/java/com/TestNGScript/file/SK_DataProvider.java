package com.TestNGScript.file;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_DataProviderBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Excel2DArray;
import com.Commonutills.file.ExcelUtils;

public class SK_DataProvider extends Base {

	SK_DataProviderBL dataproviderbl = PageFactory.initElements(driver, SK_DataProviderBL.class);

	@BeforeMethod
	public void launchSKApp() throws IOException {

		chromeDriver();
		String url = ExcelUtils.ReadExcel("Login", 1, 1);
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
