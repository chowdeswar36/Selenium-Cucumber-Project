package pom_page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {

	private WebDriver driver;
	
	public SearchCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"SearchEmail\"]")
	private WebElement txt_email1;
	@FindBy(xpath = "//*[@id=\"search-customers\"]")
	private WebElement btn_search;
	@FindBy(xpath = "//*[@id=\"SearchFirstName\"]")
	private WebElement txt_firstName;
	@FindBy(xpath = "//*[@id=\"SearchLastName\"]")
	private WebElement txt_lastName;

	public void setemail1(String email) {
		txt_email1.sendKeys(email);
	}

	public void clickSearch() {
		btn_search.click();
	}

	public void searchRecordByEmail() {
		int rowSize = driver.findElements(By.xpath("//table[@id=\"customers-grid\"]/tbody/tr")).size();
		String record;
		for (int i = 1; i <= rowSize; i++) {
			record = driver.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr[" + i + "]/td[2]")).getText();
			if (record.equals("victoria_victoria@nopCommerce.com")) {
				System.out.println("Your search record is " + record);
			}
		}
	}

	public void setFirstName(String firstName) {
		txt_firstName.sendKeys(firstName);
	}

	public void setLastName(String LastName) {
		txt_lastName.sendKeys(LastName);
	}

	public void searchRecordByNames(String firstName, String lastName) {
		int rowSize = driver.findElements(By.xpath("//table[@id=\"customers-grid\"]/tbody/tr")).size();
		String record;
		for (int i = 1; i <= rowSize; i++) {
			record = driver.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr[" + i + "]/td[3]")).getText();
			if (record.equals(firstName + " " + lastName)) {
				System.out.println("Your search record is " + record);
			}
		}
	}
}
