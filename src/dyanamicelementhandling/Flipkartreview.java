package dyanamicelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartreview {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		WebElement s = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		s.click();
		s.sendKeys("iphone 14 pro max");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		 String rr = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])/span/span)[3]")).getText();
		
		System.out.println(rr);
		
		
		
		
		
		
		
		
	}

}
