package popupstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Childpopupstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		

		Thread.sleep(1000);

		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
	Set<String> ids = driver.getWindowHandles();
		
	System.out.println(ids);	
	
Iterator<String> it = ids.iterator();

String mainpage = it.next();
String childpage=it.next();

driver.switchTo().window(childpage);

WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

Select s=new Select(dropdown);

Thread.sleep(1000);

s.selectByValue("option2");

Thread.sleep(1000);

driver.switchTo().window(mainpage);
Thread.sleep(2000);

driver.switchTo().frame("courses-iframe");

String text = driver.findElement(By.xpath("(//div[@class='et_pb_text_inner'])[1]")).getText();

System.out.println(text);
	}

}
