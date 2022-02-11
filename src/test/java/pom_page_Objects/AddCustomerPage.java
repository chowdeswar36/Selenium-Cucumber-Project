package pom_page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	private WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class=\"nav-item has-treeview\"]/a/i[@class=\"nav-icon far fa-user\"]")
	private WebElement customer_Menu;
	@FindBy(xpath = "//li[@class=\"nav-item has-treeview menu-open\"]/ul/li")
	private WebElement customer_Menu_Item;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement btn_addNew;
	@FindBy(xpath = "//*[@id=\"Email\"]")
	private WebElement txt_email;
	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement txt_password;
	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	private WebElement txt_firstName;
	@FindBy(xpath = "//*[@id=\"LastName\"]")
	private WebElement txt_lastName;
	@FindBy(xpath = "//label[@class=\"form-check-label\" and @for=\"Gender_Male\"]")
	private WebElement rd_button_male;
	@FindBy(xpath = "//label[@class=\"form-check-label\" and @for=\"Gender_FeMale\"]")
	private WebElement rd_button_female;
	@FindBy(xpath = "//*[@id=\"DateOfBirth\"]")
	private WebElement txt_date_Of_Birth;
	@FindBy(xpath = "//*[@id=\"Company\"]")
	private WebElement txt_CompanyName;
	@FindBy(xpath = "//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")
	private WebElement customer_role;
	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	private WebElement customer_role_blank;
	@FindBy(xpath = "//select[@id=\"SelectedCustomerRoleIds\"]/option[contains(text(),'Guests')]")
	private WebElement Guest;
	@FindBy(xpath = "//button[@name='save']")
	private WebElement btn_save;
	@FindBy(tagName = "body")
	private WebElement msg_Sucess;

	///// Action methods for new Add customer////

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickCustomerMenu() throws InterruptedException {
		customer_Menu.click();
		Thread.sleep(2000);
	}

	public void clickCustomerMenuItem() throws InterruptedException {
		customer_Menu_Item.click();
		Thread.sleep(2000);
	}

	public void clickAddNew() {
		btn_addNew.click();
	}

	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}

	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void setFirstName(String firstName) {
		txt_firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		txt_lastName.sendKeys(lastName);
	}

	public void setGender(String gender) {
		if (gender.equals("Male")) {
			rd_button_male.click();
		} else if (gender.equals("Female")) {
			rd_button_female.click();
		}
	}

	public void setDateofBirth(String dateofbirth) {
		txt_date_Of_Birth.sendKeys(dateofbirth);
	}

	public void setCompanyName(String companyName) {
		txt_CompanyName.sendKeys(companyName);
	}

	public void setCustomerRole() {
		customer_role.click();
		customer_role_blank.click();
		Guest.click();
	}

	public void clickSaveButton() {
		btn_save.click();
	}

	public String sucessMsg() {
		return msg_Sucess.getText();
	}

}
