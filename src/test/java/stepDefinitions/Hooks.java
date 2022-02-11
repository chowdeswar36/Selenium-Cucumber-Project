package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Managers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends WebDriverManager {

	@After
	public void after(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			TakesScreenshot scrshot = (TakesScreenshot) driver;
			byte[] src = scrshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			driver.close();
		}
	}
}
