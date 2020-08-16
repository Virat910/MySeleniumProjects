package com.mantisBT_2.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mantisBT_2.LoginPage2;

public class VerifyValidLogin2 {
	@Test
	public void verifyValidLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php");

		LoginPage2 login = new LoginPage2(driver);
		login.typeUsername("edward");
		login.typePassword("qwerty123");
		login.typeLogin();
        
		driver.quit();
}
}
