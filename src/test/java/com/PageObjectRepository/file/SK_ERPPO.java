package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ERPPO extends Base{
	
	public WebElement dropdownERP() {

		try {
			By ddErp = By.xpath("//a[@class='dd-selected']");
			return driver.findElement(ddErp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement erpEarthquick() {

		try {
			By earthQuick = By.xpath("//label[@class='dd-option-text' and contains(text(),'Earthquick')]");
			return driver.findElement(earthQuick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement erpEvacuation() {

		try {
			By earthQuick = By.xpath("//label[@class='dd-option-text' and contains(text(),'Evacuation')]");
			return driver.findElement(earthQuick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	


}
