package Managers;

import org.openqa.selenium.WebDriver;

import pom_page_Objects.AddCustomerPage;
import pom_page_Objects.LoginPage;
import pom_page_Objects.SearchCustomerPage;

public class PageObjectManager {

	private WebDriver driver;

	private LoginPage loginPage;
	private AddCustomerPage addCustomerPage;
	private SearchCustomerPage searchCustomerPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public AddCustomerPage getAddCustomerPage() {
		return (addCustomerPage == null) ? addCustomerPage = new AddCustomerPage(driver) : addCustomerPage;
	}

	public SearchCustomerPage getSearchCustomerPage() {
		return (searchCustomerPage == null) ? searchCustomerPage = new SearchCustomerPage(driver) : searchCustomerPage;
	}
	
}
