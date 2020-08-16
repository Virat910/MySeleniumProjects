package com.mantisBT_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {

	WebDriver driver;

	By username=By.xpath("//input[@name='username']");
	
	By password=By.xpath("//input[@name='password']");

	By login=By.xpath("//input[@class='button']");
	
	
	
	public LoginPage2(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void typeUsername(String uid) {
		
		driver.findElement(username).sendKeys(uid);
		
	}
	public void typePassword(String pass) {
		
		driver.findElement(password).sendKeys(pass);
	}
	public void typeLogin() {
		
		driver.findElement(login).click();
	
}
}
