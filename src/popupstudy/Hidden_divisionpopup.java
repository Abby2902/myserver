package popupstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_divisionpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

WebElement s = driver.findElement(By.xpath("//input[@class='_3704LK']"));;

s.click();
s.sendKeys("electronics");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();



	}

}
