package com.MantisBT.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersFactory {

	static WebDriver driver;

	public static WebDriver BrowsersLaunch(String browserName, String url) {

		if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
			System.out.println("firefox pass");
		} else {
			System.out.println("fail");
		}
		driver.manage().window().maximize();
		driver.get(url);

		return driver;

	}

}