package org.stepdefinition;

import org.base.LibGlobal;
import org.pojo.LoginPage;
import org.pojo.SignUpPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MainClassSteps extends LibGlobal {
	LoginPage loginPage;
	SignUpPage signupPage;

	@Given("User is on the facebook page")
	public void user_is_on_the_facebook_page() {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximizeWindow();
		implicitWait();
	}

	@When("User Should click the create new Acct button")
	public void user_Should_click_the_create_new_Acct_button() {
		loginPage = new LoginPage();
		loginPage.createAccount();

	}

	@When("User Should Sign up using {string} ,{string} , {string}")
	public void user_Should_Sign_up_using(String firstname, String lastname, String phno) {
		signupPage = new SignUpPage();
		signupPage.signUp(firstname, lastname, phno);

	}

}
