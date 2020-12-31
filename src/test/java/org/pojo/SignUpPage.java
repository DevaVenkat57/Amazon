package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends LibGlobal {
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	WebElement txtFirstName;

	@FindBy(name = "lastname")
	WebElement txtLastName;

	@FindBy(name = "reg_email__")
	WebElement txtEmail;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void signUp(String firstname, String lastname, String phno) {
		type(getTxtFirstName(), firstname);
		type(getTxtLastName(), lastname);
		type(getTxtEmail(), phno);

	}
}
