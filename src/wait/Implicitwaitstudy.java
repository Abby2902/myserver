package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwaitstudy {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(3000));
		w.until(ExpectedConditions.visibilityOf(signin));
		
		signin.click();
		
		Thread.sleep(2000);
WebElement otp = driver.findElement(By.xpath("//button[text()='Get OTP']"));

System.out.println(otp.isSelected());


	}

}
