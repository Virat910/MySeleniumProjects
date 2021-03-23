package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Expv1 = "Primus Bank";
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// Launch
		driver.get("http://primusbank.qedgetech.com/");

		String Actv1 = driver
				.findElement(By
						.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span"))
				.getText();
		// Comparision
		if (Expv1.equalsIgnoreCase(Actv1)) {
			System.out.println("Application launched successfully");
		} else {
			System.out.println("Application launched to failed");
		}

		Thread.sleep(1000);

		// Login
		String Expv2 = "Welcome to Admin";
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		String Actv2 = driver
				.findElement(By.xpath(
						"/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font"))
				.getText();

		// Comparision
		if (Expv2.equalsIgnoreCase(Actv2)) {
			System.out.println("Admin login successfully");
		} else {
			System.out.println("Admin login failed");
		}
		Thread.sleep(1000);

		// Branches
		Expv1 = "Sucessfully";
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BtnNewBR']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"txtbName\"]")).sendKeys("Yogendra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtAdd1\"]")).sendKeys("Nellore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Txtadd2\"]")).sendKeys("Kavli");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtadd3\"]")).sendKeys("Jaladanki");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtArea\"]")).sendKeys("Kvl");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtZip\"]")).sendKeys("64768");
		Thread.sleep(1000);

		Select cntry = new Select(driver.findElement(By.xpath("//*[@id=\"lst_counrtyU\"]")));
		cntry.selectByVisibleText("INDIA"); // method1
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"lst_stateI\"]"))).selectByVisibleText("Andhra Pradesh");
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"lst_cityI\"]"))).selectByVisibleText("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btn_insert\"]")).click();
		Thread.sleep(1000);
		Actv1 = driver.switchTo().alert().getText();

		// Comparision
		if (Actv1.contains(Expv1)) {
			System.out.println("Branch created");
		} else {
			System.out.println("Branch already existed");
		}
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(
				"/html/body/form/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img"))
				.click();
		Thread.sleep(1000);
		// Roles
		Expv2 = "Successfully";
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnRoles\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtRname\"]")).sendKeys("RestApiTester");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtRDesc\"]")).sendKeys("sample");
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"lstRtypeN\"]"))).selectByVisibleText("E");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btninsert\"]")).click();
		Actv2 = driver.switchTo().alert().getText();
		if (Actv2.contains(Expv2)) {
			System.out.println("Role created successfully");
		} else {
			System.out.println("Role already existed");
		}
		driver.switchTo().alert().accept();

		// Employee
		Expv1 = "Successfully";
		driver.findElement(By.xpath(
				"/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"BtnNew\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtUname\"]")).sendKeys("ManoharSv");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtLpwd\"]")).sendKeys("Manohar910");
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"lst_Roles\"]"))).selectByVisibleText("RestApiTester");
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"lst_Branch\"]"))).selectByVisibleText("Yogendra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"BtnSubmit\"]")).click();
		Thread.sleep(1000);
		Actv1 = driver.switchTo().alert().getText();

		if (Actv1.contains(Expv2)) {
			System.out.println("Employee created");
		} else {
			System.out.println("Employee already existed");
		}
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(
				"/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img"))
				.click();
		Thread.sleep(1000);
		// LogOut
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img"))
				.click();
		System.out.println("Logout successfully");
	}

}
