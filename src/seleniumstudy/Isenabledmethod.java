package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		 WebElement signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		 signin.click();
		WebElement getotp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	boolean result = getotp.isEnabled();
	System.out.println("getotp button is enabled or not "+result);
	WebElement mono = driver.findElement(By.id("mobileNumber"));
	mono.sendKeys("8262002959");
	getotp.click();
	}

}
