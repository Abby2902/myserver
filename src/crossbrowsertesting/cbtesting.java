package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cbtesting {
	 WebDriver driver = null;
	@Parameters("browsername")
	
	
	@Test
public void CBtest(String bname) {
		 WebDriver driver = null;
	  if(bname.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
			 driver=new ChromeDriver();  }
		  
			else if(bname.equals("firefox")) {
				

				  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
				   driver=new FirefoxDriver();
				
				
			}
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
		  
	  }
	  
	  
	  
	  
  }

