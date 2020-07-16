package com.BussinessFlow.file;

import java.util.Set;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_Maps_PO;
import com.PageObjectRepository.file.SK_MenuListPO;


public class SK_MapsBL extends SK_Maps_PO {
	
	

	/*public void ViewMap() {

		try {

			if (btnMAP() != null && btnMAP().isDisplayed()) {
				Base.highLightElement(driver, btnMAP());
				String parentWindowId = driver.getWindowHandle();
				System.out.println("Parent Window ID is: " + parentWindowId);
				btnMAP().click();
				Thread.sleep(5000);
	String parentWindowId = driver.getWindowHandle();
	System.out.println("Parent Window ID is: " + parentWindowId);
	btnMAP().click();
	Thread.sleep(5000);

	// To iterate over all open windows

	Set<String> allWindows = driver.getWindowHandles();

	// To get the count of all open window

	int windowCount = allWindows.size();
	System.out.println("Total Map window count is :" + windowCount);

	// Apply enhanced For loop to get the window id of all open window.
	// Window id will help to uniquely identified the all open window.

	for (String childWindowId : allWindows) {
		if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
			driver.switchTo().window(childWindowId);
			Thread.sleep(5000);
			Base.FullPageScreenShot("MapScreen");

			if (mapPl.dropdownMAP() != null && mapPl.dropdownMAP().isDisplayed()) {
				Base.highLightElement(driver, mapPl.dropdownMAP());
				mapPl.dropdownMAP().click();
				mapPl.mapNetsutra().click();
				driver.manage().window().maximize();
				Thread.sleep(15000);
				Base.FullPageScreenShot("MapNetsutra");
				mapPl.btnMapBox().click();
				Thread.sleep(3000);
				driver.close();

			} else {

				System.out.println("MAP not found");
			}
		}

		driver.switchTo().window(parentWindowId);

	}
}
} catch (Exception ex) {

System.out.println("Exception in MAP : " + ex.getStackTrace());
}

}*/

	
	

	
	
}
