package com.wipro.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wipro.utility.ConfigReader;

public class DriverInstance {

public static WebDriver driver;
	public static WebDriver startDriverInstance() {
		if(ConfigReader.readProjectConfiguration("BrowserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Driver//chromedriver1.exe");
			driver = new ChromeDriver(); 
		}
		else if(ConfigReader.readProjectConfiguration("BrowserName").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Driver//geckodriver.exe");
			driver = new ChromeDriver(); 
		}
		else {
			System.setProperty("webdriver.chrome.driver","./Driver//chromedriver1.exe");
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(ConfigReader.readProjectConfiguration("ApplicationURL"));
		return driver;
		
	}
	public static WebDriver closeDriverInstance() {
		driver.quit();
		return driver;
		
	}
	
	/*//Returning driver instance
	public static WebDriver getDriverInstance() {
		if(driver!=null) {
			return driver;
		}
		else {
			DriverInstance.startDriverInstance();
			return driver;
		}
	}
	
	//Setting driver instance to null
	public static void setDriverInstanceToNull() {
		driver = null;
	}*/
}
