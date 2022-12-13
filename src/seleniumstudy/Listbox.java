package seleniumstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.id("day"));
		Select s=new Select(Day);
		Thread.sleep(1000);
		s.selectByValue("29");
		//List<WebElement> DayOptions = s.getOptions();
		//System.out.println(DayOptions.size());
		//s.selectByValue("29");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Thread.sleep(1000);
		Select s1=new Select(month);
		s1.selectByIndex(7);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Thread.sleep(1000);
		Select s2=new Select(year);
		s2.selectByVisibleText("1989");
		Thread.sleep(2000);
		s2.deselectByVisibleText("1989");
	}

}
