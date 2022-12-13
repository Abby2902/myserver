package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	driver.switchTo().frame("iframe-name");
	WebElement heading = driver.findElement(By.xpath("//span[text()='velocity_classes_pune@vctcpune.co.in']"));
	System.out.println(heading.getText());
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	WebElement main = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
System.out.println(main.getText());
	}

}
