package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_MapPL extends Base{
	
	public WebElement dropdownMAP() {

		try {
			By ddmap = By.xpath("//select[@id='map-list']");
			return driver.findElement(ddmap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement mapNetsutra() {

		try {
			By mapNetsutra = By.xpath("//select[@id='map-list']//option [contains(text(),'Netsutra')]");
			return driver.findElement(mapNetsutra);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement btnMapBox() {

		try {
			By MapBox = By.xpath("//button[@class='mapboxgl-ctrl-icon mapbox-gl-draw_line']");
			return driver.findElement(MapBox);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	


}
