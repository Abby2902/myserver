package neostoxbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxutility.Newutility;
import neostoxutility.Utility;

public class Newbaseclass {

	protected static WebDriver driver;

	public void launchbrowser() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(Newutility.readdatafrompropertyfile("url"));
		driver.manage().window().maximize();
			Utility.wait(driver, 1000);
			
		
		

			
			
			
			
			
			
			
			
			
			
			
			//launch browser
			

		
	
		
		
		
		
		
		Reporter.log("launching browser with url", true);

		
		
	}
	
	
	
	
	
}
