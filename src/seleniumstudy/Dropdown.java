package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cuppalabs.github.io/angular2-multiselect-dropdown/#/multipledropdowns");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement drop = driver.findElement(By.xpath("(//div[@class='c-btn'])[2]"));
		drop.click();
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	
	act.sendKeys(Keys.ARROW_UP).perform();
	
	act.click().perform();
	
		
		
		
	}

}
