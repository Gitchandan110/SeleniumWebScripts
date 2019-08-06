package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class MakeMyTripHomePagePL extends Base {

	public WebElement BtnFromCity() {

		By btnfromcity = By.cssSelector("input[id='fromCity'][type='text']");
		return driver.findElement(btnfromcity);

	}

	public WebElement FrameFromCity() {

		// By frameFromCity= By.xpath("//div[@class='locationFilter
		// autocomplete_from']");

		By frameFromCity = By.xpath(
				"//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']");
		return driver.findElement(frameFromCity);

	}

	public WebElement FieldFromCity() {

		By fieldFromCity = By.cssSelector("input[type='text'][placeholder='From']");

		return driver.findElement(fieldFromCity);

	}

	public WebElement ListSuggestionBox() {

		By listSuggestionBox = By.cssSelector(" ul[role='listbox'][class='react-autosuggest__suggestions-list']");
		return driver.findElement(listSuggestionBox);
	}

	public WebElement CalendarContainer() {

		By calendarContainer = By.xpath("//div[@class='datePickerContainer']");

		return driver.findElement(calendarContainer);
	}

	public WebElement BtnNextMonth() {

		By btnNextMonth = By.xpath("//span[@role='button'][@aria-label='Next Month']");

		return driver.findElement(btnNextMonth);

	}

	public WebElement BtnCalendar() {

		By btnCalendar = By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']//label[@for='departure']");
		return driver.findElement(btnCalendar);

	}

	public WebElement Calendar() {

		By calendar = By.xpath("//div[@class='dayPickerFlightWrap']");
		return driver.findElement(calendar);

	}

	public WebElement CalendarMonth() {

		By calendarMonth = By.xpath("//div[@class='DayPicker-Months']//div//div");

		return driver.findElement(calendarMonth);
	}

	public WebElement DayPicker() {

		By dayPicker = By.xpath("//div[@class='DayPicker-Day'][@aria-label='Sun Sep 29 2019']");
		return driver.findElement(dayPicker);

	}

	public WebElement CalendarDate() {

		By calendarDate = By.xpath("//div[@class='DayPicker-Body']");

		return driver.findElement(calendarDate);
	}

	public WebElement BtnToCity() {

		// By btnToCity=By.cssSelector("div[class='fsw_inputBox searchToCity
		// inactiveWidget activeWidget']");
		By btnToCity = By.cssSelector("input[id='toCity'][type='text']");
		return driver.findElement(btnToCity);
	}

	public WebElement FrameToCity() {

		By frameFromCity = By.xpath(
				"//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']");
		return driver.findElement(frameFromCity);

	}

	public WebElement FieldToCity() {

		By fieldFromCity = By.cssSelector("input[type='text'][placeholder='To']");

		return driver.findElement(fieldFromCity);

	}

	public WebElement SelectCity() {

		By selectCity = By.xpath("");
		return driver.findElement(selectCity);

	}
	
	public WebElement BtnTravellerClass() {
		
		By btnTravellerClass=By.xpath("//div[@class='fsw_inputBox flightTravllers inactiveWidget ']");
		return driver.findElement(btnTravellerClass);
		
	}
	
	public WebElement FrameTraveller() {
		
		By frameTraveller=By.xpath("//div[@class='travellers']//div");
		return driver.findElement(frameTraveller);
		
	}
	
	
	
	
	public WebElement AdultTraveller() {
		
		By adultTC=By.xpath("//ul[@class='guestCounter font12 darkText'][1]");
		return driver.findElement(adultTC);
		
	}
	
	public WebElement ChildTraveller() {
		
		By childTC=By.xpath("//ul[@class='guestCounter font12 darkText'][2]");
		return driver.findElement(childTC);

}
	
	public WebElement InfantsTraveller() {
		
		By infantsTC=By.xpath("//ul[@class='guestCounter font12 darkText'][3]");
		return driver.findElement(infantsTC);
	
}
	
	public WebElement TravellerClass() {
		
		By travellerClass=By.xpath("//ul[@class='guestCounter classSelect font12 darkText'][1]");
		return driver.findElement(travellerClass);

}
	
	public WebElement ButtonApply() {
		
		By buttonApply=By.xpath("//div[@class='travellers']//button[@type='button'][contains(text(),'APPLY')]");
		return driver.findElement(buttonApply);
		
	}
	

	public WebElement BtnSearchFlight() {
		
		By btnSearchFlight=By.xpath("//p[@class='makeFlex vrtlCenter ']//a[contains(text(),'Search')]");
		return driver.findElement(btnSearchFlight);
	}
	
	
	public WebElement FlightDetails() {
		
	By flightDetails=By.xpath("//div[@class='fli-intl-lhs pull-left']//div[@class='fli-intl-lhs pull-left']//div");
		
	return driver.findElement(flightDetails);
		
	
	}
	
	public WebElement FlightList() {
		
		By flightList=By.xpath("//div[@class='fli-intl-lhs pull-left']//div[@class='fli-intl-lhs pull-left']//div[@class='pull-left airways-info-sect']");
		return driver.findElement(flightList);
	}
	
	
	
	public WebElement TicketPrice() {
		
		By ticketPrice=By.xpath("//div[@class='fli-intl-lhs pull-left']//*[@class='pull-left price']");
		return driver.findElement(ticketPrice);
		
	}
	
	
	
}	
