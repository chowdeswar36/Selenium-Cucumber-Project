package Managers;

import java.io.IOException;

import DataProviders.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager FileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		return FileReaderManager;
	}

	public ConfigFileReader getConfigFileReader() throws IOException {
		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}
}
