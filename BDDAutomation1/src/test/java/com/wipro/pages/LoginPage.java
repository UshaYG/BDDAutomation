package com.wipro.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wipro.base.DriverInstance;
import com.wipro.utility.ConfigReader;
//ConfigReader.readElementLocators("login_page_tab_xpath"))
public class LoginPage extends DriverInstance{

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	public void clickOnLoginTab() {
		System.out.println("in login pg");
		driver.findElement(By.xpath(ConfigReader.readElementLocators("login_page_tab_xpath"))).click();
	}
	public void enterUserName(String uname) throws IOException, InterruptedException {
		
		driver.findElement(By.xpath(ConfigReader.readElementLocators("login_username_name"))).sendKeys(uname);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(ConfigReader.readElementLocators("login_username_name"))));
	}
	public void enterPassword(String pwd) throws IOException {
		driver.findElement(By.xpath(ConfigReader.readElementLocators("login_password_xpath"))).sendKeys(pwd);
	}
	public void clickOnLoginButton() throws IOException {
		driver.findElement(By.xpath(ConfigReader.readElementLocators("login_login_buton_xpath"))).click();
	}
	public void userIsOnLoginPage() throws IOException, InterruptedException {
		Assert.assertTrue(driver.findElement(By.xpath(ConfigReader.readElementLocators("login_page_heading_xpath"))).isDisplayed());
		//Thread.sleep(3000);
	}
	public void clickOnLogoutButton() throws IOException {
		driver.findElement(By.xpath(ConfigReader.readElementLocators("logout_button_xpath"))).click();
	}
	public void userLoggedOut() throws IOException, InterruptedException {
		Assert.assertTrue(driver.findElement(By.xpath(ConfigReader.readElementLocators("logout_success_xpath"))).isDisplayed());
		//Thread.sleep(3000);
	}
}
