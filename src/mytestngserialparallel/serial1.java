package mytestngserialparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serial1 {
  @Test
  public void paytm() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://paytm.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(0);
	  
	  
	  
  }
}
