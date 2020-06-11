package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ReportsPL extends Base {

	public WebElement EventsReport() {

		By EventsReport =By.xpath("//div[@ng-click='category.isCollapse = !category.isCollapse'][@class='tableau-cat']");
		return driver.findElement(EventsReport);

	}

	public WebElement EventHistoryDay() {

		By EventHistoryDay = By.xpath("//div[contains (text(),'Events History By Day')]");
		return driver.findElement(EventHistoryDay);

	}

	public WebElement EventHistoryMonth() {

		By EventHistoryMonth = By.xpath("//div[contains (text(),'Events History By Month')]");
		return driver.findElement(EventHistoryMonth);

	}
	
	public WebElement btncloseReports() {

		By btnClosed = By.xpath("//i[@class='icon-remove-sign'][@onclick='close_popup_forms()']");
		return driver.findElement(btnClosed);

	}
	
	

}
