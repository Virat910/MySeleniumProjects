package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/draggable/");

		Thread.sleep(3000);

		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		act.dragAndDropBy(driver.findElement(By.xpath("//p[contains(text(),'Drag me around')]")), 300, 150).perform();

	}
}