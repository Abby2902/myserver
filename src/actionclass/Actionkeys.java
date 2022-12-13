package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionkeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		WebElement month = driver.findElement(By.id("month"));
		
		month.click();
		 
		Actions act=new Actions(driver);
		
		for(int i=0;i<8;i++) {
			
			act.sendKeys(Keys.ARROW_UP).perform();
			
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement day = driver.findElement(By.id("day"));
		
		day.click();
		
		Actions a=new Actions(driver);
		
		for(int i= 0;i<26;i++) {
			
			a.sendKeys(Keys.ARROW_UP).perform();
			
			
		}
		
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		Actions b=new Actions(driver);
		
		for(int i=0;i<32;i++) {
			b.sendKeys(Keys.ARROW_DOWN).perform();
	
			
		}
		b.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		name.click();
		Actions d=new Actions(driver);
		
		//d.sendKeys("abhay").perform();
		//d.moveToElement(name).sendKeys("abhay").build().perform();
		
		d.moveToElement(name).keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("wati").build().perform();
	}

}
