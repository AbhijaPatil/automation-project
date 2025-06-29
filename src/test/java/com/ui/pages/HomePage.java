package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {
	
	private static final By SIGN_IN_LINK_LOCATOR= By.xpath("//a[contains(text(),\"Sign in\")]");
	
	public HomePage(Browser browserName) {
		super(browserName); // to call parent class constructor from the child class constructor
		goToWebsite("http://www.automationpractice.pl/index.php?");
		
	}
	
	

	public LoginPage goToLoginPage() // Page Functions
	{
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
		
		
	}

}
