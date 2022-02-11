package DataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties = new Properties();

	public ConfigFileReader() throws IOException {
		FileInputStream fin = new FileInputStream("config\\config.properties");
		properties.load(fin);
	}

	public String getEnvironmentType() {
		String environment = properties.getProperty("environmenttype");
		return environment;
	}

	public String getBrowserType() {
		String browser = properties.getProperty("browsertype");
		return browser;
	}

	public String getChromePath() {
		String chromePath = properties.getProperty("chromepath");
		return chromePath;
	}

	public String getEdgePath() {
		String edgePath = properties.getProperty("edgepath");
		return edgePath;
	}

}
