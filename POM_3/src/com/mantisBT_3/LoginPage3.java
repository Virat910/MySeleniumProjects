package com.mantisBT_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage3 {

	WebDriver driver;

	public LoginPage3(WebDriver driver3) {

		this.driver = driver3;
	}

	By username = By.xpath("//input[@name='username']");

	By password = By.xpath("//input[@name='password']");

	By login = By.xpath("//input[@class='button']");

	public void LoginToMantis(String userid, String pass) {

		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
}
