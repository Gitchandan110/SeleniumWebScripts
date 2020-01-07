package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_VisitorsPL extends Base {

	public WebElement pageManageVisitors() {

		try {
			By pageName = By.xpath("//*[@class='col-md-8' and contains(text(),'Manage Visitors')]");
			return driver.findElement(pageName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterLastName() {

		try {
			By LastName = By.xpath("//input [@id='last_name']");
			return driver.findElement(LastName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement filterFirstName() {

		try {
			By FirstName = By.xpath("//input [@id='first_name']");
			return driver.findElement(FirstName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement filterEmail() {

		try {
			By Email = By.xpath("//input [@id='email_id']");
			return driver.findElement(Email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement filterMobileNumber() {

		try {
			By MobileNumber = By.xpath("//input [@id='phone']");
			return driver.findElement(MobileNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement ddType() {

		try {
			By status = By.xpath("//select[@id='is_app_user']");
			return driver.findElement(status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement typeWithApp() {

		try {
			By withApp = By.xpath("//option[@value='Yes']");
			return driver.findElement(withApp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddActiveStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement typeWithoutApp() {

		try {
			By withoutApp = By.xpath("//option[@value='No']");
			return driver.findElement(withoutApp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddInactiveStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement btnFilter() {

		try {
			By FilterButton = By.cssSelector("input[type='submit'][name='filter']");
			return driver.findElement(FilterButton);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnClear() {

		try {
			By FilterButton = By.xpath("//input [@name='cancel']");
			return driver.findElement(FilterButton);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement linkDetails() {

		try {
			By details = By.linkText("Details");
			return driver.findElement(details);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnCancelDetails() {

		try {
			By cancel = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains (text(),'Cancel')]");
			return driver.findElement(cancel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnNewVisitor() {

		try {
			By btnNewVisitor = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'New Visitor')]");
			return driver.findElement(btnNewVisitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnCountryCode() {

		try {
			By btnNewVisitor = By.xpath("//select[@id='mobile_country_code']");
			return driver.findElement(btnNewVisitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement CountryCodeIndia() {

		try {
			By CCIndia = By.xpath("//option[@value='IN']");
			return driver.findElement(CCIndia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtMobile() {

		try {
			By mobile = By.xpath("//input[@id='mobile_number'][@ng-model='vm.mobile_number']");
			return driver.findElement(mobile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnSubmit() {

		try {
			By submit = By.xpath("//input[@type='submit'][@name='search']");
			return driver.findElement(submit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtFirstName() {

		try {
			By firstName = By.xpath("//input[@id='first_name'][@ng-model='vm.frm.first_name']");
			return driver.findElement(firstName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtLastName() {

		try {
			By lastName = By.xpath("//input[@id='last_name'][@ng-model='vm.frm.last_name']");
			return driver.findElement(lastName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtCompanyName() {

		try {
			By companyName = By.xpath("//input[@id='company_name'][@ng-model='vm.frm.company_name']");
			return driver.findElement(companyName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement ddHost() {

		try {
			By Host = By.xpath("//input[@type='search'][@placeholder='Select or search a host']");
			return driver.findElement(Host);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement selectHost() {

		try {
			By selectHost = By.xpath("//div[@class='option ui-select-choices-row-inner']");
			return driver.findElement(selectHost);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtEmail() {

		try {
			By Email = By.xpath("//input[@id='email'][@ng-model='vm.frm.email']");
			return driver.findElement(Email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}