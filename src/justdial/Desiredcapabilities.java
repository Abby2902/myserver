package justdial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Desiredcapabilities {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		
		
		
		
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("-disable-notifications");
	//opt.addArguments("incognito");
	
	
//	opt.addArguments("start-maximized");
//	
//	opt.addArguments("-disable-notifications");
	opt.addArguments("headless");
	
	WebDriver driver1= new ChromeDriver(opt);
	
	
		driver1.get("https://www.justdial.com/");
		
		Thread.sleep(6000);
		
	}

}
