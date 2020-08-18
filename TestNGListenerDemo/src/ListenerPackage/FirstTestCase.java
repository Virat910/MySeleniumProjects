package ListenerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//When we have many testcases we want to use suite so we do not use this 
//@Listeners(ListenerPackage.TestNgListener.class)
public class FirstTestCase {

	@Test
	
	public void GoogleVerify() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.quit();
	}
	@Test
	public void titleMatch() {
		
		System.out.println("dummy");
		Assert.assertTrue(false);
	}
}
