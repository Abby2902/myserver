package actionclass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Multipleimageselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	
	Actions act=new Actions(driver);
	
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

	
	act.sendKeys("iphone 14").sendKeys(Keys.ENTER).build().perform();
	
	
	driver.findElement(By.className("iJ1Kvb")).click();
	
     List<WebElement> images = driver.findElements(By.tagName("img"));
	
     
  System.out.println("images present on webpage "+images.size());
// for(WebElement i:images) {
//	  
//	  System.out.println(i);
//  
//  }
 
 Iterator<WebElement> it = images.iterator();
 
 while(it.hasNext()) {
	 
	 System.out.println(it.next());
 }
    
     
	}
}

