package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_page_Objects.AddCustomerPage;

public class AddCustomerSteps extends WebDriverManager{

	private AddCustomerPage addPage;

///////////customer add feature step definitions///////

	@Then("user can view dashboard {string}")
	public void user_can_view_dashboard(String title) {
		addPage = new PageObjectManager(driver).getAddCustomerPage();
		Assert.assertEquals(title, addPage.getTitle());
	}

	@When("user clicks on the customer menu")
	public void user_clicks_on_the_customer_menu() throws InterruptedException {
		addPage.clickCustomerMenu();
	}

	@When("clicks on the customer tab")
	public void clicks_on_the_customer_tab() throws InterruptedException {
		addPage.clickCustomerMenuItem();
	}

	@When("clicks on the add new button")
	public void clicks_on_the_add_new_button() {
		addPage.clickAddNew();
	}

	@Then("user can view add new customer page {string}")
	public void user_can_view_add_new_customer_page(String title) {
		Assert.assertEquals(title, addPage.getTitle());
	}

	@When("user enters the all data")
	public void user_enters_the_all_data() {
		addPage.setEmail(BaseClass.generateEmail());
		addPage.setPassword("1234");
		addPage.setFirstName("xyz");
		addPage.setLastName("abc");
		addPage.setGender("Male");
		// addPage.setDateofBirth("17/03/1999");
		addPage.setCompanyName("acd");
	}

	@When("clicks on the save button")
	public void clicks_on_the_save_button() {
		addPage.clickSaveButton();
	}

	@Then("the user view the confirmation message {string}")
	public void the_user_view_the_confirmation_message(String title) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully."));
	}

}
