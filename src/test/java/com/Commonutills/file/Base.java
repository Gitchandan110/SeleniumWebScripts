package com.Commonutills.file;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	static String LoginDataSheet = "Login";

	public static WebDriver opendriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		return driver;

	}
	
	
	public static WebDriver chromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		return driver;
	
	
	}
	
       public static void openProdSKApp() throws InterruptedException, IOException {
		
		chromeDriver();
		String urlProd=ExcelUtils.ReadExcel(LoginDataSheet, 1, 1);
		driver.get(urlProd);
		Thread.sleep(5000);
	
	}
       
       public static void openTestSKApp() throws InterruptedException, IOException {
   		
   		chromeDriver();
   		String urlTest=ExcelUtils.ReadExcel(LoginDataSheet, 2, 1);
   		driver.get(urlTest);
   		Thread.sleep(5000);
   	
   	}
	
       
       public static void openIntSKApp() throws InterruptedException, IOException {
   		chromeDriver();
   		String urlInt=ExcelUtils.ReadExcel(LoginDataSheet, 3, 1);
   		driver.get(urlInt);
   		Thread.sleep(5000);
   	
   	}   
	
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}
	
	

	public static void scrolltoElement(WebDriver driver, WebElement element) {
		
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",element );
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {

		System.out.println(e.getMessage());
	}
	
	}
	
	
	public static void takeScreenShot(String screenName) throws IOException {
		
		String imageLocation = "C:\\Users\\Chandan\\Git\\ArtifactMaven\\Screenshots\\";
		//String screenName= obj.getTagName();
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File capturedImage=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(capturedImage, new File(imageLocation + screenName));
			System.out.println("Screenshot captured");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
/*public static void screenShotWebElement(WebElement object) throws IOException {
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File imgObj=object.getScreenshotAs(OutputType.FILE);
		String newFileName = "C:\\Users\\Chandan\\Git\\ArtifactMaven\\Screenshots"+ ".jpg";
		FileUtils.copyFileToDirectory(imgObj, new File(newFileName));
		
	}*/


public static void waitFor30Seconds(WebElement element) {

	try {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
		System.out.println("Explicit Wait 30 seconds Done");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}


}



