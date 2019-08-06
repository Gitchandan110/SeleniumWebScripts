package com.Commonutills.file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan\\git\\repository\\ArtifactMaven\\Test Data\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    String url="https://safety-test.kuvrr.com/observer/";
		driver.get(url);
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


}



