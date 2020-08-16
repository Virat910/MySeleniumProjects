package com.MantisBT.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage1 {

	WebDriver driver;

	public LoginPage1(WebDriver driver1) {

		this.driver = driver1;
	}

	// method:1
	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement userName;

	// method:2
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	@CacheLookup
	WebElement passWord;

	@FindBy(how = How.XPATH, using = "//input[@name='perm_login']")
	@CacheLookup
	WebElement check_box;

	@FindBy(how = How.XPATH, using = "//input[@class='button']")
	@CacheLookup
	WebElement submit;

	public void Login_MantisBT(String uid, String pass) throws Exception {

		userName.sendKeys(uid);
		Thread.sleep(2000);
		passWord.sendKeys(pass);
		Thread.sleep(2000);
		check_box.click();
		Thread.sleep(2000);
		submit.click();

	}

}
