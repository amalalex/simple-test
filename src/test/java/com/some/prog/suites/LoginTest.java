package com.some.prog.suites;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.some.prog.pages.HomePage;
import com.some.prog.pages.LoginPage;

public class LoginTest {

	private static WebDriver webDriver;

	@BeforeClass
	public static void init() {
		
		System.out.println("init() ");
		 System.setProperty("webdriver.chrome.driver", "C:\\temp\\simple-test\\src\\test\\resources\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		webDriver.get("https://opensource-demo.orangehrmlive.com/");
		
	
	}

	@Before
	public void prepare() {

		// Load spreadsheet - create test data

	}

	@Test
	public void loginTest() {

		System.out.println("Login Test ");
		
		LoginPage loginPage = new LoginPage(webDriver);
		String title = loginPage.login("Admin", "admin123");
		assertEquals("OrangeHRM", title);
		
		HomePage homePage = new HomePage(webDriver);
		
		String userName = homePage.getUserName();
		
		assertEquals("Welcome Admin", userName);
		
		String signPageTitle = homePage.logout();
		
		assertEquals("OrangeHRM", signPageTitle);

	}

	@AfterClass
	public static void cleanup() {
		webDriver.quit();
	}

}
