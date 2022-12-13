package mytestngserialparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serial {
  @Test
  public void paytm() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.phonepe.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(0);
	  
	  
	  
  }
}
