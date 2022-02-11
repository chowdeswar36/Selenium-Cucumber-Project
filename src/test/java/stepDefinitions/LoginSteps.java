package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_page_Objects.LoginPage;

public class LoginSteps extends WebDriverManager {
	
	private LoginPage loginpage;

	@Given("user opens the browser")
	public void user_opens_the_browser() throws Exception {
		driver = createdriver();
		System.out.println("Hash code of the friver is :"+driver.hashCode());
	}

	@When("user opens the URL {string}")
	public void user_opens_the_URL(String url) {
		driver.get(url);
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		loginpage = new PageObjectManager(driver).getLoginPage();
		loginpage.enterEmail(email);
		loginpage.enterPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginpage.clickLoginBtn();
	}

	@Then("the page with title should be {string} is displayed")
	public void the_page_with_title_should_be_is_displayed(String title) throws Exception {
		if (driver.getTitle().equals(title)) {
			Assert.assertEquals(title, driver.getTitle());
		} else {
			System.out.println("Expected: " + title + "----------" + "Actual: " + driver.getTitle());
			throw new Exception("Invalid page with different title");
		}
	}

	@When("user clicks on the logout lik")
	public void user_clicks_on_the_logout_lik() throws Exception {
		loginpage.clickLogoutBtn();
	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String title) throws Exception {
		if (driver.getTitle().equals(title)) {
			Assert.assertEquals(title, driver.getTitle());
		} else {
			System.out.println("Excepted: " + title + "----------" + "Actual: " + driver.getTitle());
			throw new Exception("Invalid page with different title");
		}
	}

	@Then("close the browser")
	public void close_the_browser() throws IOException {
		driver.close();

	}
}