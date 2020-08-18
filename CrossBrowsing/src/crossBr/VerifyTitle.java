package crossBr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyPage(String browserName) {

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Running with firefox");
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "‪D:\\IEDriverServer.exe");
			driver = new ChromeDriver();
			System.out.println("Runnig with ie");

		}
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=z3Ruc2bKnqI");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
