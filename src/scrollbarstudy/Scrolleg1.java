package scrollbarstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolleg1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ref = driver.findElement(By.xpath("//strong[text()='Our Vision']"));
		
WebElement ref1 = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
		
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		
		j.executeScript("arguments[1].scrollIntoView(true);",ref1);
		
		
		

	}

}
