package com.ui.tests;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;

public class LoginTest3 {

	public static void main(String[] args) {
		
		HomePage homePage = new HomePage(EDGE);
		String userName = homePage.goToLoginPage().doLoginWith("kolov59119@hazhab.com", "Password").getUserName();		
		System.out.println(userName);
		
		
	}

}