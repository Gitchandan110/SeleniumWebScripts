package com.TestProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JC_21_ApiTestKuvrr {
	
	public static void main(String [] args) throws InterruptedException{
	
	
		
	//Set Chrome Browser Path		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Chandan/Desktop/Eclipse/Selenium/chromedriver.exe");
		
			
	// Open	new Chrome Browser    
	WebDriver driver = new ChromeDriver();
	
	
	// Open URL in Chrome Browser
	driver.manage().window().maximize();
	driver.get("https://api-test.kuvrr.com:9090/#/login");
	
	
	// Wait 
	 Thread.sleep(10000);
	
	//Enter User Name admin
	
	 driver.findElement(By.cssSelector("input[type=text]")).clear();
	driver.findElement(By.cssSelector("input[type=text]")).click();
	driver.findElement(By.cssSelector("input[type=text]")).sendKeys("admin");
	
	// Wait 
	  Thread.sleep(5000);
	
	
	//Enter admin Password
	  
	  driver.findElement(By.cssSelector("input[type=password]")).clear();
	  driver.findElement(By.cssSelector("input[type=password]")).click();
	  driver.findElement(By.cssSelector("input[type=password]")).sendKeys("S1nd@l02042018");
	  
	
	// Wait 
	Thread.sleep(5000);
	  
	  //Click on SignIn Button
	
	driver.findElement(By.cssSelector("button[type=submit]")).click();
	
	// Wait 
		Thread.sleep(5000);
		
	// Open URL in Chrome Browser
	driver.get("https://api-test.kuvrr.com:9090/#/user/list");
	System.out.println("User List Page Opened");
	Thread.sleep(10000);
	//Search Field
	
	driver.findElement(By.cssSelector("input[type=search]")).clear();
	driver.findElement(By.cssSelector("input[type=search]")).click();
	driver.findElement(By.cssSelector("input[type=search]")).sendKeys("android@yopmail.com");
		
	Thread.sleep(5000);
	
	driver.findElement(By.cssSelector("td[ng-bind=row.fullName]")).click();
	driver.findElement(By.cssSelector("td[ng-bind=row.fullName]")).click();
	
	}

}

