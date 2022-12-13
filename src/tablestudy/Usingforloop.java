package tablestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingforloop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table-display']//tr"));

        for(WebElement r:rows) {
        	
        	System.out.println(r.getText()+"   ");
        	
        	
        }
	}

}
