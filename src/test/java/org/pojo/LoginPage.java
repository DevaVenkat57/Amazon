package org.pojo;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement txtUserName;

	@FindBy(id = "pass")
	WebElement txtPassword;

	@FindBy(name = "Login")
	WebElement btnLogin;

	@FindBy(id = "u_0_2")
	WebElement btnCreateNewAcct;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnCreateNewAcct() {
		return btnCreateNewAcct;
	}

	public void login(String name, String password) {
		
		type(getTxtUserName(), name);
		type(getTxtPassword(), password);
		click(getBtnLogin());

	}

	public void createAccount() {
		LoginPage page=new LoginPage();
		click(page.btnCreateNewAcct);

	}
}
