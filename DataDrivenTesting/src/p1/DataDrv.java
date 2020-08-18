package p1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataDrv {
	WebDriver bo;

	@Test(dataProvider = "LoginCredentials")
	public void f(String uid, String pd) throws InterruptedException {

		bo = new FirefoxDriver();
		bo.manage().window().maximize();
		bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bo.get("http://apps.qaplanet.in/bugtracker/login_page.php");

		bo.findElement(By.xpath("//input[@name='username']")).sendKeys(uid);

		bo.findElement(By.xpath("//input[@name='password']")).sendKeys(pd);

		bo.findElement(By.xpath("//input[@class='button']")).click();

		Thread.sleep(3000);
		//String t=bo.getTitle();
		//System.out.println(t);
		Assert.assertTrue(bo.getTitle().contains("My View - MantisBT"), "user is not able to access-invalid credentials");
		System.out.println("page title is verified-user is able to access");
	}
    @AfterMethod
    public void tearDown() {
    	bo.quit();
    }
	@DataProvider
	public Object[][] LoginCredentials() {
		Object[][] cred = new Object[2][2];

		cred[0][0] = "edward";
		cred[0][1] = "qwerty123";

		cred[1][0] = "9885353910";
		cred[1][1] = "Virat910";

		return cred;
	}
}
