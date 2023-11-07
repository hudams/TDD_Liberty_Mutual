package liberty.mutual.insurance.utils;

import java.io.IOException;
import java.util.Properties;

import liberty.mutual.insurance.constants.KeyConfig;

public class ReadConfig {
	Properties properties;

	public ReadConfig() {
		loadProperties();
	}

	// public static void main(String[] args) {
	// properties.get("url");
	// }

	private void loadProperties() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("configuration.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getValue(KeyConfig key) {
		return properties.getProperty(key.toString());
	}
}
