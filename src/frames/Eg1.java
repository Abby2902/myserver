package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		WebElement animals = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		
		Select s=new Select(animals);
		
		s.selectByValue("big baby cat");
		
		
		
		

	}

}
