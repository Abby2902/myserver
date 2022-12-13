package popupstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);

		WebElement cust = driver.findElement(By.name("cusid"));
		
		cust.click();
		cust.sendKeys("abhay");
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			Alert alt = driver.switchTo().alert();
			
			alt.accept();
			Thread.sleep(1000);
			Alert al = driver.switchTo().alert();
			al.accept();
		
			String text = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
			
			System.out.println(text);
	}

}
