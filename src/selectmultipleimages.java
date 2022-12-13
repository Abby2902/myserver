import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmultipleimages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	WebElement input = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

	Thread.sleep(100);
	input.sendKeys("iphone 14");
	
	input.sendKeys(Keys.ENTER);
	
     List<WebElement> images = driver.findElements(By.tagName("img"));
	
     
     for(WebElement i:images) {
    	 
    	 
    String st = i.getText();
    System.out.println(st);
     }
	
	
	
	}

}
