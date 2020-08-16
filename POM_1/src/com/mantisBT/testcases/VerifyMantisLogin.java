package com.mantisBT.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mantisBT.LoginPage;

public class VerifyMantisLogin {

	@Test
	public void verifyValidLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php");

		LoginPage login = new LoginPage(driver);
		login.typeUsername();
		login.typePassword();
		login.typeLogin();

		driver.quit();
	}
}
