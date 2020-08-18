package com.mantisBT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
public LoginPage(WebDriver driver1) {
		
		this.driver=driver1;
	}
	By username=By.xpath("//input[@name='username']");
	
	By password=By.xpath("//input[@name='password']");

	By login=By.xpath("//input[@class='button']");
	
	
	
	public void typeUsername() {
		
		driver.findElement(username).sendKeys("edward");
		
	}
	public void typePassword() {
		
		driver.findElement(password).sendKeys("qwerty123");
	}
	public void typeLogin() {
		
		driver.findElement(login).click();
	}
}
