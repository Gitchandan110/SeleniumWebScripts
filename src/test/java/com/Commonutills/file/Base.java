package com.Commonutills.file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Base {

	public static WebDriver driver;
	static String LoginDataSheet = "Login";

	public static WebDriver opendriver()  throws Exception{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.navigate().refresh();
	//	driver.navigate().to(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		return driver;

	}

	public static WebDriver chromeDriver()  throws Exception{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		return driver;

	}

	public static void openSKApp() throws Exception {
		
	try {	
		chromeDriver();
		
	//	Red5 URL
	//	String url = ExcelUtils.ReadExcel(LoginDataSheet, 3, 1);
		
	//Test URL	
		
		String url = ExcelUtils.ReadExcel(LoginDataSheet, 2, 1);
		
	//Prod URL
		
	// String url = ExcelUtils.ReadExcel(LoginDataSheet, 1, 1);
	
		
		driver.get(url);
		System.out.println("Starting SK App");
		Thread.sleep(5000);

	} catch (Exception e) {
		e.printStackTrace();
	}
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
		js.executeScript("arguments[0].scrollIntoView();", element);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

	}

	public static void scrollEndofthePage(WebDriver driver) throws Exception{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public static void takeScreenShot(String ScreenName) throws Exception {

		String imageLocation = "C:\\Users\\Chandan\\Git\\ArtifactMaven\\Screenshots\\";
		// String screenName= obj.getTagName();

	
			TakesScreenshot ts = (TakesScreenshot) driver;
			File capturedImage = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(capturedImage, new File(imageLocation + ScreenName));
			System.out.println("Screenshot captured");
	}

	public static void FullPageScreenShot(String ScreenName) throws Exception {

	
			Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);

			ImageIO.write(fpScreenshot.getImage(), "png", new File(".\\FullPage_Screenshots\\" + ScreenName + ".png"));

			System.out.println("Screenshot captured");
		

	}
	
	public static void F12PrintScreen()  throws Exception {
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.F12).perform();
		System.out.println("F12PrintScreen() done");

	}
	
	public static void RobotPrintScreen()  throws Exception {
		
		
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_PRINTSCREEN);
		rob.keyRelease(KeyEvent.VK_PRINTSCREEN);
	
		System.out.println("RobotPrintScreen() done");
	
	}
	
	public static void waitFor30Seconds(WebElement element) {

		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
			System.out.println("Explicit Wait 30 seconds Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void waitFor180Seconds(WebElement element) {

		try {
			new WebDriverWait(driver, 180).until(ExpectedConditions.visibilityOf(element));
			System.out.println("Explicit Wait 180 seconds Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String SystemTime() {

		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String Time = dateFormat.format(date);
		return Time;

	}

	public static String SystemDateTime() {

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		String dateTime = dateFormat.format(date);
		return dateTime;

	}

	public static void manageChildWindow() throws Exception {

		// It will return the parent window name as a String
		String mainWindow = driver.getWindowHandle();
		System.out.println("Parent Window is :" + mainWindow);
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();
		System.out.println("Child window Strings Set are : "+ set);

		// Using Iterator to iterate with in windows

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String childWindow = itr.next();
			System.out.println("child Window is :" + childWindow);
			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Driver is switched to Child Window");
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				System.out.println(SystemTime());
				Base.FullPageScreenShot("Incident Screen");

			}

		}

	}

}
