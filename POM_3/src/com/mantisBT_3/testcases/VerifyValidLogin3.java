package com.mantisBT_3.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mantisBT_3.LoginPage3;

public class VerifyValidLogin3 {

	@Test
	public void verifyLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php");

		LoginPage3 login = new LoginPage3(driver);
		login.LoginToMantis("edward", "qwerty123");

		driver.quit();
	}
}
