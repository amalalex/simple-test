package com.some.prog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "txtUsername")
	private WebElement txtUsername;

	@FindBy(id = "txtPassword")
	private WebElement txtPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	private WebDriver driver;

	public LoginPage(WebDriver webDriver) {
		driver = webDriver;
		
		PageFactory.initElements(webDriver, this);
	}

	public String login(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();

		return driver.getTitle();

	}

}
