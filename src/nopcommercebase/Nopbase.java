package nopcommercebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxutility.Utility;

public class Nopbase {
protected WebDriver driver;
	public void launchbrowernop() 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Utility.wait(driver, 1000);
		
		
		
		
		
		
		
	}
	
	
}
