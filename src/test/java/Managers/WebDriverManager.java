package Managers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverManager {

	public static WebDriver driver;

	public WebDriver createdriver() throws Exception {
		String environmenttype = FileReaderManager.getInstance().getConfigFileReader().getEnvironmentType();
		switch (environmenttype) {
		case "local":
			driver = createLocalDriver();
			break;
		case "remote":
			driver = createRemoteDriver();
			break;
		case "cloud":
			driver = createCloudDriver();
			break;
		}
		return driver;
	}

	private WebDriver createCloudDriver() throws Exception {
		throw new Exception("There is no implementation for cloud environment");
	}

	private WebDriver createRemoteDriver() throws Exception {
		throw new Exception("There is no implementation for Remote environment");
	}

	public WebDriver createLocalDriver() throws IOException {
		String browsername = FileReaderManager.getInstance().getConfigFileReader().getBrowserType();
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					FileReaderManager.getInstance().getConfigFileReader().getChromePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver",
					FileReaderManager.getInstance().getConfigFileReader().getEdgePath());
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		}
		return driver;
	}

	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
