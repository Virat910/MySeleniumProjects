package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.MantisBT.TestCases.BrowsersFactory;

public class MainClass {
	WebDriver driver;

	@Test
	public void VerifiedLogin() {
		driver = BrowsersFactory.BrowsersLaunch("firefox", "http://apps.qaplanet.in/bugtracker/my_view_page.php");

		Login2 lg = PageFactory.initElements(driver, Login2.class);

		lg.Open_MantisBT("edward", "qwerty123");
	}
}
