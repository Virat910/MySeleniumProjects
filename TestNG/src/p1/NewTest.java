package p1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver bo;
	String bPath = "http://apps.qaplanet.in/bugtracker/login_page.php";

	@Test(enabled = true, priority = 1, groups = "login")
	public void Tc1() {
		bo.findElement(By.xpath("//input[@name='username']")).sendKeys("edward");
		bo.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123");
		bo.findElement(By.xpath("//input[@class='button']")).click();
		Assert.assertEquals(bo.getTitle(), "Minu vaade - MantisBT");

	}

	@Test(enabled = true, priority = 2, groups = "login")
	public void Tc2() {
		bo.findElement(By.xpath("//input[@name='username']")).sendKeys("dfghj");
		bo.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123");
		bo.findElement(By.xpath("//input[@class='button']")).click();
		// Assert.assertEquals(bo.getTitle(), "Minu vaade - MantisBT");
	}

	@Test(enabled = true, priority = 3, groups = "login")
	public void Tc3() {
		bo.findElement(By.xpath("//input[@name='username']")).sendKeys("edward");
		bo.findElement(By.xpath("//input[@name='password']")).sendKeys("sghjlk");
		bo.findElement(By.xpath("//input[@class='button']")).click();
		// Assert.assertEquals(bo.getTitle(), "Minu vaade - MantisBT");

	}

	@Test(enabled = true, priority = 4, groups = "login")
	public void Tc4() {
		bo.findElement(By.xpath("//input[@name='username']")).sendKeys("ehgfgjd");
		bo.findElement(By.xpath("//input[@name='password']")).sendKeys("sghjlk");
		bo.findElement(By.xpath("//input[@class='button']")).click();
		Assert.assertEquals(bo.getTitle(), "Minu vaade - MantisBT");
	}

	@BeforeMethod
	public void be() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		bo = new FirefoxDriver();
		bo.get(bPath);
	}

	@AfterMethod
	public void am() {
		bo.close();
	}
}
