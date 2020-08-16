package p1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lines2 {

	public static void main(String[] args) {
		String url;
		HttpURLConnection huc = null;

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:" + links.size());

		for (WebElement ele : links) {
			url = ele.getAttribute("href");
			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("url is either is not configure for anchor tag or it is empty");
				continue;
			}
			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();

				int respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + "is a broken link");
				} else {
					System.out.println(url + "is a valid link");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
