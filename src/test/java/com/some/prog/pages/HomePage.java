package com.some.prog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@id=\"welcome\"]")
	private WebElement userName;

	@FindBy(xpath = "//*[@id=\"welcome\"]")
	private WebElement userLink;

	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	private WebElement logout;

	private WebDriver driver;

	public HomePage(WebDriver webDriver) {
		driver = webDriver;

		PageFactory.initElements(webDriver, this);
	}

	public String getUserName() {

		return userName.getText();

	}

	public String logout() {

		userLink.click();

		logout.click();

		return driver.getTitle();

	}

}
