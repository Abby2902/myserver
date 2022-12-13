package dyanamicelementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bulletongoogle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        Thread.sleep(1000);
        
        WebElement search = driver.findElement(By.name("q"));
        
        search.click();
        search.sendKeys("bullet");
        Thread.sleep(2000);
      List<WebElement> bulletinfo = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]/li)"));
    
      System.out.println(bulletinfo.size());
      
      for(WebElement b:bulletinfo) {
    	  
    	  System.out.println(b.getText());
    	  
    	  String exp="bullet bike";
    	  String actual=b.getText();
    	  if(exp.equals(actual)) {
    		  
    		  b.click();
    		  break;
    		  
    	  }
    	  
    	  
    	  
    	  
      }
      
      driver.findElement(By.linkText("Images")).click();
      
      
	}

}
