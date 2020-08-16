package com.MantisBT.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyValidLogin {

	@Test
	public void checkValidUser() throws Exception {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		// This will launch specific browser and url
		WebDriver driver = BrowsersFactory.BrowsersLaunch("FireFox",
				"http://apps.qaplanet.in/bugtracker/my_view_page.php");

		// created page object using with pageFctory
		LoginPage1 lg = PageFactory.initElements(driver, LoginPage1.class);

		// method calling
		lg.Login_MantisBT("edward", "qwerty123");
	}

}
