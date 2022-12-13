package seleniumstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
driver.findElement(By.xpath("//a[text()='Help']")).click();

Set<String> allids = driver.getWindowHandles();
System.out.println(allids);

Iterator<String> i = allids.iterator();

String mainpageid = i.next();

System.out.println(mainpageid);

String childid = i.next();
System.out.println(childid);

driver.switchTo().window(childid);
Thread.sleep(1000);

driver.findElement(By.xpath("//i[@class='icon-close']")).click();








	}

}
