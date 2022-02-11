package pom_page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='Email']")
	private WebElement txt_email;
	@FindBy(xpath = "//*[@id=\"Password\"]")
	private WebElement txt_password;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement btn_login;
	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto pl-2']/li[3]/a")
	private WebElement btn_logout;

	public void enterEmail(String email) {
		txt_email.clear();
		txt_email.sendKeys(email);
	}

	public void enterPassword(String password) {
		txt_password.clear();
		txt_password.sendKeys(password);

	}

	public void clickLoginBtn() {
		btn_login.click();

	}

	public void clickLogoutBtn() throws Exception {
		Thread.sleep(2000);
		btn_logout.click();
	}

}
