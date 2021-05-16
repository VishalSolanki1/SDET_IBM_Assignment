package com.ibm.sdet.newapp.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ibm.sdet.newapp.hooks.Hooks;
import com.ibm.sdet.newapp.pagewebelements.PageWebElement;
import com.ibm.sdet.newapp.wrappers.Wrappers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionEmail extends Wrappers{

	WebDriver driver;
	String browser;

	@Given("^User should open the new application from \"([^\"]*)\"$")
	public void user_should_open_the_new_application_from(String browser) throws Throwable {
		//Open the application in browser
		this.browser = browser;
		driver = Hooks.setUpDriver(browser);
		driver.get(PageWebElement.APPLICATION_URL);
		driver.manage().window().maximize();
	}

	@Given("^User should login into with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_login_into_with_and(String username, String password) throws Throwable {
		
		enterById(driver, PageWebElement.USERNAME, username);	
		enterById(driver, PageWebElement.PASSWORD, password);
		clickById(driver,PageWebElement.LOGIN_BUTTON);
		waitForNextPage(driver);
	}

	@When("^User should verify login confirmation\\.$")
	public void user_should_verify_login_confirmation() throws Throwable {
		
		String expectedMessage = "Hello Vishal Solanki and welcome,";
		String actualmessage = getTextByXpath(driver, PageWebElement.ACTUAL_CONFIRMATION_MESSAGE);
        //Verify if the right user has successfully logged in
		Assert.assertEquals(actualmessage, expectedMessage);

	}

	@When("^User should verify user profile and click to send mail\\.$")
	public void user_should_verify_user_profile_and_click_to_send_mail() throws Throwable {
		
		clickByXpath(driver, PageWebElement.USER_IMAGE);
		waitForNextPage(driver);
		clickByXpath(driver, PageWebElement.USER_EMAIL);
		waitForNextPage(driver);
	}

	@When("^User should select \"([^\"]*)\"$")
	public void user_should_select(String receiptant) throws Throwable {

		enterByXpath(driver, receiptant, PageWebElement.SEND_TO_TEXT_BOX);
		clickByXpath(driver, PageWebElement.SELECT_EMAIL_ID);
		Thread.sleep(5000);
	}
	
	@When("^User should compose body \"([^\"]*)\" and subject \"([^\"]*)\"$")
	public void user_should_compose_body_and_subject(String body, String subject) throws Throwable {
		
		enterById(driver, PageWebElement.SUBJECT_LINE , subject);
		driver.findElement(By.tagName("iframe")).click();
		
		//Switch to frame on basis of browser selected
		if(browser.equalsIgnoreCase("chrome")) { driver.switchTo().frame(0);}
		else if(browser.equalsIgnoreCase("firefox")){driver.switchTo().frame(1);}
		
		enterByXpath(driver, body, PageWebElement.MESSAGE);
		driver.switchTo().defaultContent();
	}

	@When("^User should send mail$")
	public void user_should_send_mail() throws Throwable {

		clickById(driver, PageWebElement.SEND_MESSAGE_BUTTON);
		waitForNextPage(driver);
	}

	@Then("^User should verify the confirmation message\\.$")
	public void user_should_verify_the_confirmation_message() throws Throwable {

		String expectedConfirmMessage = "The message has been sent to Vishal Solanki (VishalSolanki3)";
		String actualConfirmMessage = getTextByXpath(driver, PageWebElement.ACTUAL_MAIL_SENT_CONFIRM_MESSAGE);
		Assert.assertTrue(actualConfirmMessage.equalsIgnoreCase(expectedConfirmMessage));
	}
}
