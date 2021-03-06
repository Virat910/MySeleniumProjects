package p3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataDriven {
	@Test(dataProvider = "loginCredentials")
	public void Tc1(String uId, String pd) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver bo = new FirefoxDriver();
		bo.get("https://manohar910-trials65141.orangehrmlive.com/auth/login");
		bo.findElement(By.xpath("//span[contains(text(),'Username')]")).sendKeys(uId);
		bo.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pd);
		bo.findElement(By.xpath("//input[@id='btnLogin']")).click();
		// Assert.assertEquals(bo.getTitle(), "Minu vaade - MantisBT");
		bo.close();
	}

	@DataProvider
	public Object[][] loginCredentials() {
		Object[][] cred = new Object[4][2];

		cred[0][0] = "admin";
		cred[0][1] = "9885353910";

		cred[1][0] = "admin";
		cred[1][1] = "dgjhlj";

		cred[2][0] = "jhslj";
		cred[2][1] = "9885353910";

		cred[3][0] = "gdsh";
		cred[3][1] = "hgdljk;";

		return cred;
	}
}
