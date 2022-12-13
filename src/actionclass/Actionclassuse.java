package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement homepage = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(homepage).perform();
//		act.click().perform();
		act.moveToElement(homepage).click().perform();
	//act.click(homepage).perform();
//		act.moveToElement(homepage).perform();
//		act.contextClick().perform();
//		act.moveToElement(homepage).contextClick().perform();
		
	act.contextClick(homepage).perform();
	}

}
