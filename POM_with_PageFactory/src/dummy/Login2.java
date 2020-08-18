package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login2 {

	WebDriver driver;

	public void login(WebDriver driver2) {
		this.driver = driver2;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	@CacheLookup
	WebElement userName;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	@CacheLookup
	WebElement pswrd;

	@FindBy(how = How.XPATH, using = "//input[@class='button']")
	@CacheLookup
	WebElement submit;

	public void Open_MantisBT(String uid, String pd) {

		userName.sendKeys(uid);

		pswrd.sendKeys(pd);

		submit.click();

	}

}
