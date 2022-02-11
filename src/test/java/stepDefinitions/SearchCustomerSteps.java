package stepDefinitions;

import org.junit.Assert;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_page_Objects.SearchCustomerPage;

public class SearchCustomerSteps extends WebDriverManager {

	private SearchCustomerPage searchPage;

//////////customer search feature by email step definitions

	@Then("user can view the customer page {string}")
	public void user_can_view_the_customer_page(String title) {
		Assert.assertEquals(title, driver.getTitle());
		searchPage = new PageObjectManager(driver).getSearchCustomerPage();
	}

	@When("user enters a mail")
	public void user_enters_a_mail() {
		searchPage.setemail1("victoria_victoria@nopCommerce.com");
	}

	@When("clicks on the search button")
	public void clicks_on_the_search_button() {
		searchPage.clickSearch();
	}

	@Then("user can see the customer email details in table")
	public void user_can_see_the_customer_email_details_in_table() {
		searchPage.searchRecordByEmail();
	}

///////////// customer search feature by firstname and lastname step definitions
	@When("user enters a firstname as {string} and lastname as {string}")
	public void user_enters_a_firstname_as_and_lastname_as(String firstName, String lastName) {
		searchPage.setFirstName(firstName);
		searchPage.setLastName(lastName);
	}

	@Then("user can see the customer name details in table")
	public void user_can_see_the_customer_name_details_in_table() {
		searchPage.searchRecordByNames("Victoria", "Terces");
	}

}
