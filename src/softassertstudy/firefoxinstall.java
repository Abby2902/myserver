package softassertstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxinstall {
  @Test
  public void firefox() {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
	  
	  
	  
  }
}
