package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class CrossBrowsing {
	WebDriver dd;
 @Test
  public void CrB(String ibr) {
	  if(ibr.equalsIgnoreCase("ff"));
	  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	  dd=new FirefoxDriver();
	  System.out.println("Running with FF");
  }
  
  {
	  System.setProperty("webdriver.chrome.driver", "‪D:\\chromedriver.exe");
	  dd=new ChromeDriver();
	  System.out.println("Running with Chrome");
}
  
}
