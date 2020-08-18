package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersFactory2 {
	
	 WebDriver driver;
	
	public BrowsersFactory2(String browserName,String url) {
		if(browserName.equalsIgnoreCase("ff")) {
			driver=new FirefoxDriver();
		System.out.println("pass");
	}else {
		System.out.println("Fail");
		
	}
	driver.manage().window().maximize();
  driver.get(url);
	}
}
