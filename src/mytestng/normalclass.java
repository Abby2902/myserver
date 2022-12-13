package mytestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class normalclass {
  @Test
  public void velocity() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  
	  
  }
}
