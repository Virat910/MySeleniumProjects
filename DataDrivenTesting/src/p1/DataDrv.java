package p1;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class DataDrv {
	@Test(dataProvider = "LoginCredentials")
	public void f(String uid, String pd) {
		

		WebDriver bo = new FirefoxDriver();
		bo.get("https://www.instagram.com/");
		
		bo.findElement(By.xpath("//input[@name='username']")).sendKeys(uid);
        bo.findElement(By.xpath("//input[@name='password']")).sendKeys(pd);
        bo.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
	}

	@DataProvider
	public Object[][] LoginCredentials() {
		Object[][] cred = new Object[2][2];

		cred[0][0] = "9885353910";
		cred[0][1] = "Virat910";

		cred[1][0] = "9885353910";
		cred[1][1] = "Virat910";

		return cred;
	}
}
