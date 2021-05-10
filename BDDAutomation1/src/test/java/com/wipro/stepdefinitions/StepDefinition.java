package com.wipro.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wipro.pages.LoginPage;
import com.wipro.base.DriverInstance;

import cucumber.api.java.en.*;

public class StepDefinition extends DriverInstance {

	public WebDriver driver;
	LoginPage login;  
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver=DriverInstance.startDriverInstance();
		login= new LoginPage(driver);
		System.out.println("driver instance");
		
		System.out.println("chrome launched");
		//Thread.sleep(5000);
		login.clickOnLoginTab();
		Thread.sleep(5000);
		System.out.println("login page");
	}
	
	@When("^user enters \"([^\"]*)\" username$")
	public void user_enters_username(String uname) throws Throwable {
		login= new LoginPage(driver);
		login.enterUserName(uname);
	}

	@And("^user enters \"([^\"]*)\" password$")
	public void user_enters_password(String pwd) throws Throwable {
		login= new LoginPage(driver);
		login.enterPassword(pwd);
	}

	@And("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	    login.clickOnLoginButton();
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    login.userIsOnLoginPage();
	}
	@Then("^User clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
	    login.clickOnLogoutButton();
	}

	@And("^User should be logged out$")
	public void user_should_be_logged_out() throws Throwable {
	    login.userLoggedOut();
	    login.closeDriverInstance();	
	    System.out.println("User logged out of the application successfuly");
	    }


	
	
}
