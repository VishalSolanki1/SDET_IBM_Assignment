package com.ibm.sdet.newapp.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ibm.sdet.newapp.hooks.Hooks;
import com.ibm.sdet.newapp.pagewebelements.PageWebElement;
import com.ibm.sdet.newapp.wrappers.Wrappers;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionSignUp extends Wrappers {
	
	WebDriver driver;
	String userName;
	String email;
	
	@Given("^User should signup the new application from \"([^\"]*)\"$")
	public void user_should_signup_the_new_application_from(String browser) throws Throwable {
		
		driver = Hooks.setUpDriver(browser);
		driver.get(PageWebElement.APPLICATION_URL);
		driver.manage().window().maximize();
		clickByLinkText(driver, PageWebElement.SIGN_UP_LINK);
		waitForNextPage(driver);
	}
	
	@When("^User should enter firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
	public void user_should_enter_firstname_and_lastname(String firstname, String lastname) throws Throwable {
		
		userName = firstname + " " + lastname;
		enterById(driver, PageWebElement.FIRST_NAME_TEXT_BOX, firstname);	
		enterById(driver, PageWebElement.LAST_NAME_TEXT_BOX , lastname);
	}

	@When("^User should enter email \"([^\"]*)\"$")
	public void user_should_enter_email(String email) throws Throwable {
		this.email = email; 
		enterById(driver, PageWebElement.EMAIL_TEXT_BOX, email);
	}

	@When("^User should enter username \"([^\"]*)\"$")
	public void user_should_enter_username(String username) throws Throwable {
		
		enterById(driver, PageWebElement.USERNAME_TEXT_BOX, username);
	}

	@When("^User should enter and confirm \"([^\"]*)\"$")
	public void user_should_enter_and_confirm(String password) throws Throwable {
		
		enterById(driver, PageWebElement.PASSWORD_TEXT_BOX, password);
		enterById(driver, PageWebElement.CONFIRM_PASSWORD_TEXT_BOX, password);
	}

	@When("^User should submit registration form>$")
	public void user_should_submit_registration_form() throws Throwable {
		
		clickById(driver,PageWebElement.REGISTER_BUTTON);
		waitForNextPage(driver);
	}

	@Then("^User should verify the registration confirmation message$")
	public void user_should_verify_the_registration_confirmation_message() throws Throwable {
		
		String expectconfMessage = "Dear " + userName;
		String actualmessage = getTextByXpath(driver, PageWebElement.REGISTRATION_CONFIRM_MESSAGE);
        //Verify the registration successfully completed
		Assert.assertTrue(actualmessage.contains(expectconfMessage));
		System.out.println("The user has been verified and has been successfully registered");

	}
	
	@And("^User should validate email in userprofile$")
	public void user_should_validate_email_in_userprofile() throws Throwable {
		
		clickByXpath(driver, PageWebElement.USER_PROFILE_IMAGE);
		String actualEmail = getTextByXpath(driver, PageWebElement.USER_PROFILE_EMAIL_ID);
		//Verify the correct user email ID
		Assert.assertTrue(actualEmail.equalsIgnoreCase(email));
		//Close current window
		Hooks.closeBrowser(driver);
	}
}
