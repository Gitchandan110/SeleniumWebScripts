package com.TestNGScript.file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.MakeMyTripHomePageBL;
import com.Commonutills.file.Base;

public class MakeMyTripHomePage extends Base {

	MakeMyTripHomePageBL MMTHomePagebl=PageFactory.initElements(driver, MakeMyTripHomePageBL.class);
	
	
	
	@BeforeMethod
	
	public void openMMT() throws InterruptedException {
		
		opendriver();
	//	chromeDriver();
		String url="https://www.makemytrip.com/flights/";
		driver.get(url);
       
		
	}	
	
	@Test
		
    public void BookTicket() throws InterruptedException {

		
	String HomepageTitle=MMTHomePagebl.validateHomePageTitle();
	System.out.println("HomepageTitle is :" + HomepageTitle);
	
	
	MMTHomePagebl.Btn_FromCity();
	MMTHomePagebl.List_FromCity();
	MMTHomePagebl.Enter_FromCity();
	MMTHomePagebl.List_SuggestedFromCity();
	MMTHomePagebl.Select_City();
	MMTHomePagebl.Month_Departure();
	MMTHomePagebl.Date_Departure();
	MMTHomePagebl.Traveller$Class();
	MMTHomePagebl.Adult_Traveller();
	MMTHomePagebl.Child_Traveller();
	MMTHomePagebl.Traveller_Class();
	MMTHomePagebl.Search_Flight();
	MMTHomePagebl.Flight_Details();
	MMTHomePagebl.Flight_List();
	MMTHomePagebl.Ticket_Price();

	}

	
	@AfterMethod
	
	public void CloseApp() {
		
		/*driver.close();
		driver.quit();*/
		
		
		
			
		}
		
		
	}
	
	
	
		


	


