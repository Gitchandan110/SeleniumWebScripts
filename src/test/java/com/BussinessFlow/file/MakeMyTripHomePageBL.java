package com.BussinessFlow.file;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.Nullable;

import com.google.common.base.Predicate;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.MakeMyTripHomePagePL;

public class MakeMyTripHomePageBL extends MakeMyTripHomePagePL {

	public String validateHomePageTitle() {
		return driver.getTitle();

	}

	public void Btn_FromCity() {

		Base.highLightElement(driver, BtnFromCity());
		BtnFromCity().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void List_FromCity() {

		Base.highLightElement(driver, FrameFromCity());
		List<WebElement> listFromCity = FrameFromCity().findElements(By.tagName("li"));
		System.out.println("Number of FromCity are :" + listFromCity.size());
		for (int i = 0; i < listFromCity.size(); i++) {
			System.out.println(i + " " + listFromCity.get(i).getText());
			listFromCity = FrameFromCity().findElements(By.tagName("li"));
       break;
		}

	}

	public void Enter_FromCity() throws InterruptedException {

		Base.highLightElement(driver, FieldFromCity());
		FieldFromCity().click();
		FieldFromCity().clear();
		FieldFromCity().sendKeys("Delhi");
		Thread.sleep(3000);

	}

	public void List_SuggestedFromCity() throws InterruptedException {

		Base.highLightElement(driver, ListSuggestionBox());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> listSuggested = ListSuggestionBox().findElements(By.tagName("li"));
		System.out.println("Number of Suggested From City are :" + listSuggested.size());

		for (int i = 0; i < listSuggested.size(); i++) {

			System.out.println("List of Suggested City are: " + i + "  " + listSuggested.get(i).getText());
        break;
		}

	}

	public void Select_City() throws InterruptedException {

		Base.highLightElement(driver, ListSuggestionBox());
		Thread.sleep(3000);
		List<WebElement> listSuggestedFrom = ListSuggestionBox().findElements(By.tagName("li"));
		for (int i = 0; i < listSuggestedFrom.size(); i++) {

			if (listSuggestedFrom.get(i).getText().contains("Delhi, India")) {
				Actions actions = new Actions(driver);
				actions.moveToElement(listSuggestedFrom.get(i)).click().perform();
				System.out.println("Departure City get Selected");
          
			}

			else if (listSuggestedFrom.get(i).getText().contains("Puttaparthi, India")) {
				Actions actions = new Actions(driver);
				actions.moveToElement(listSuggestedFrom.get(i)).click().perform();
				System.out.println("Departure City get Selected");
				break;
			}

			FieldToCity().sendKeys("Patna");
			Base.highLightElement(driver, ListSuggestionBox());
			Thread.sleep(3000);

			List<WebElement> listSuggested = ListSuggestionBox().findElements(By.tagName("li"));
			System.out.println("Number of Suggested To City are :" + listSuggested.size());
			for (int x = 0; x < listSuggested.size(); x++) {

				if (listSuggested.get(x).getText().contains("Patna, India")) {
					Actions actions = new Actions(driver);
					actions.moveToElement(listSuggested.get(x)).click().perform();
					System.out.println("Arrival City Get Selected");
					break;
			}
				
			} 
			
		}
		
	}
	
	

	public void Month_Departure() throws InterruptedException {
		
		
		String ExpectedMonth = "September 2019";
		
/*		String currentMonth ="";
			while (!currentMonth.equals(ExpectedMonth)) {
				
				BtnNextMonth().click();
				Base.highLightElement(driver, CalendarMonth());
				System.out.println("Next Month is: "+ CalendarMonth().getText());
				currentMonth = CalendarMonth().getText();
				
			}
			
			String currentMonth ="";*/
			
			
			while (true) {
				
				BtnNextMonth().click();
				Base.highLightElement(driver, CalendarMonth());
				System.out.println("Next Month is: "+ CalendarMonth().getText());
				if(CalendarMonth().getText().equals(ExpectedMonth)) {
				DayPicker().click();
				break;
				}
				
			}
		}

	public void Date_Departure() {

		try {
		
			List<WebElement> departureDates = CalendarDate().findElements(By.tagName("div"));
			for (WebElement date: departureDates) {
			if	(date.getText().equals(DayPicker())) {
				date.click();
				System.out.println("Departure Date Selected");	
				
			}

				}

		} catch (Exception ex) {

			System.out.println(ex);

		}

	}

	public void Traveller$Class() {
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(BtnTravellerClass()));
		Actions action=new Actions(driver);
		action.moveToElement(BtnTravellerClass());
		Base.highLightElement(driver, BtnTravellerClass());
		BtnTravellerClass().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		actions.moveToElement(FrameTraveller());
		Base.highLightElement(driver, FrameTraveller());
		
		
	}
	
	public void Adult_Traveller() {
		
		
		Base.highLightElement(driver, AdultTraveller());
		List<WebElement> listAdult=AdultTraveller().findElements(By.tagName("li"));
		System.out.println("Adult count are :"+listAdult.size());
		System.out.println("Adult count start with :"+listAdult.get(0).getText());
	
		for(int i=0; i <listAdult.size() ; i++) {
			
			System.out.println("Adult count: "+listAdult.get(i).getText());
			
			listAdult.get(i).click();
		}
		
		listAdult.get(3).click();
		
	}	    
		    
	public void Child_Traveller() {
		
		Base.highLightElement(driver, ChildTraveller());
		List<WebElement> listChild=ChildTraveller().findElements(By.tagName("li"));
		System.out.println("Number of Child Traveller are:"+listChild.size());
		
		for (int i=0; i <listChild.size(); i++) {
			
			System.out.println("Child count :"+listChild.get(i).getText());
		
			listChild.get(i).click();
	}
		listChild.get(3).click();
		
	}	
		public void Traveller_Class() {
			
			Base.highLightElement(driver, TravellerClass());
			List <WebElement> listClass=TravellerClass().findElements(By.tagName("li"));
			System.out.println("Class count are:"+listClass.size());
			for(int i=0; i<listClass.size();i++) {
				System.out.println("Class are:"+listClass.get(i).getText());
				listClass.get(i).click();
				ButtonApply().click();
				System.out.println("Apply Button Clicked");
				break;
		}
			
	}		
		public void Search_Flight() {
			

	
	        Base.highLightElement(driver, BtnSearchFlight());
	        BtnSearchFlight().click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
		
		
		public void Flight_Details() {
			
			List<WebElement>listDetails=FlightDetails().findElements(By.xpath("//div[@class='fli-list one-way ']"));
		    System.out.println("Total Flight details are :"+listDetails.size());
		    for(int i=0; i<listDetails.size();i++) {
		   	if(!listDetails.get(i).getText().isEmpty())
		   	System.out.println("Flight Details are :"+ listDetails.get(i).getText());
		    
		    	
		    }
		}
		
		
		public void Flight_List() {
			
			
		List<WebElement> flightList=FlightDetails().findElements(By.tagName("p"));
		System.out.println("Total Number of Flights are:"+flightList.size());
		
		for (int i=0; i<flightList.size();i++) {
			
			if(!flightList.get(i).getText().isEmpty()) {
			
			System.out.println("Flight Lists are:"+flightList.get(i).getText());
		
			
		}
			
		}	
			
			
		}
		    
		 public void Ticket_Price() {
			 
		List<WebElement> priceList=TicketPrice().findElements(By.tagName("span"));
		
		for(int i=0; i<priceList.size();i++) {
			
	    System.out.println("Price List are :"+priceList.get(i).getText());
			
			 
	 /* //get all the prices from the table
	    List<WebElement> price = dr.findElements(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div/div[2]/div[2]/div[6]/p[1]/span[2]"));
	    System.out.println(price.size());
	    //put all the prices into array list and get the lowest prices
	    ArrayList<Integer> prices=new ArrayList<Integer>();
	    for(int i=0;i<price.size();i++){
	    //System.out.println(price.get(i).getText());
	    Integer priceInt = Integer.valueOf(price.get(i).getText().replace(",", ""));
	    prices.add(priceInt);
	    }
	    Integer minPrice = Collections.min(prices);
	    System.out.println("Min Price is "+minPrice);

	    //compare all the prices with lowest price and click the corresponding book button
	    List<WebElement> allBookbtn = dr.findElements(By.xpath("//*[@id='content']/div/div[5]/div[5]/div[2]/div/div[2]/div[2]/div[7]/p/a"));
	    Thread.sleep(3000);
	    for(int i=0;i<price.size();i++){
	    Integer priceInt1 = Integer.valueOf(price.get(i).getText().replace(",", ""));
	    //String price1 = price.get(i).getText();
	    System.out.println(priceInt1);
	    if(priceInt1==minPrice){
	    allBookbtn.get(i).click();
	    break;
	    }
	    } 
	    }
	    } 
		*/	 
			 
		 }
		    
		    
		    
			
			
		}
			
}
		    
		    
		    

	
	
