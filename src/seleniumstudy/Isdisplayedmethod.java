package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayedmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
WebElement text = driver.findElement(By.xpath("//input[@id='displayed-text']"));
WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
Thread.sleep(5000);
hidebutton.click();
WebElement showbutton = driver.findElement(By.id("show-textbox"));
Thread.sleep(2000);
showbutton.click();
Thread.sleep(2000);
text.sendKeys("good morning");

if(showbutton.isDisplayed()) {
	text.sendKeys("good morning");
}
else {
	showbutton.click();
	text.sendKeys("good night");
	
	
	
}
}
		
	}


