package neostoxbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxutility.Utility;

public class Baseclass 
{protected WebDriver driver;

	public void launchbrowser() {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Utility.wait(driver, 1000);
		
		Reporter.log("launching browser with url", true);
		
		
	}
	
	
	
	
}
