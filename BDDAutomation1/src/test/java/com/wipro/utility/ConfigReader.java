package com.wipro.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String readProjectConfiguration(String keyName) {
		String value = null;
		try {
			FileReader file = new FileReader(new File("./ConfigFiles//ProjectConfiguration.properties"));
			Properties readproperty = new Properties();
			readproperty.load(file);
			return readproperty.getProperty(keyName).trim();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw(new RuntimeException("***ERROR***: - Key with name" + keyName + " does not exists"));
		}
	}
	
	public static String readElementLocators(String keyName) {
		String value = null;
		try {
			FileReader file = new FileReader(new File("./ElementLocators//Locators.properties"));
			Properties readproperty = new Properties();
			readproperty.load(file);
			return readproperty.getProperty(keyName).trim();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw(new RuntimeException("***ERROR***: - Key with name" + keyName + " does not exists"));
		}
	}
	
	/*public static String readProjectConfiguration(String keyName) throws IOException {
		FileInputStream file = new FileInputStream("./ConfigFiles//ProjectConfiguration.properties");
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(keyName).toString();
	}
	
	public static String readElementLocators(String keyName) throws IOException {
		FileInputStream file = new FileInputStream("./ElementLocators//Locators.properties");
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(keyName).toString();
	}*/
}
