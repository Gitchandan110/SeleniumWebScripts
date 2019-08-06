package com.TestNGScript.file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Commonutills.file.Base;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.exceptions.TestFailedException;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolDemo {

	Eyes eyes = new Eyes();

	

	@Test
	public void applitool() {
		
	try {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan\\Desktop\\Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		eyes.setApiKey("Vydv6X47qrt108DUUt9ZI05abobzW8AadX1IWrGWGDidQ110");
	    eyes.open(driver, "appName","windowName", new RectangleSize(1366, 625));
		driver.get("https://demo.applitools.com/app.html");
		eyes.checkWindow("Login window");
		eyes.checkWindow("Username");
		eyes.checkWindow("Password");
		eyes.close();

		} catch (TestFailedException e) {
				 System.out.println("\n" + e + "\n");
				 
		} finally {
			
		}
		}

	
}