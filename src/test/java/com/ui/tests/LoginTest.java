package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest {
	HomePage homePage;

	@BeforeMethod(description = "Load the home page of the website")
	public void setup() {
		homePage = new HomePage(CHROME);
	}

	@Test(description = "Verifies whether the valid user is able to login to the application", groups = { "e2e",
			"sanity" })
	public void loginTest() {
		assertEquals(homePage.goToLoginPage().doLoginWith("kolov59119@hazhab.com", "Password").getUserName(),
				"Abhija Patil");

	}

}