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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

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
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		return driver;
	
	
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
	
	
	public static void takeScreenShot() throws IOException {
		
		//TakeScreenShot is a interface in java so its Object can not be created. 
		//So We need to type cast takescreen shot by writing it under small bracket like this (TakeScreenshot).
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File capturedImage=ts.getScreenshotAs(OutputType.FILE);
		
		String newFileName = "C:\\Users\\Chandan\\Git\\ArtifactMaven\\Screenshots"+ ".jpg";
		
	//	FileUtils.copyFile(capturedImage, new File(""));
		FileUtils.copyFileToDirectory(capturedImage, new File(newFileName));
		System.out.println("Screenshot captured");
		
	}


}



