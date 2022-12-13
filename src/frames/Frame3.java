package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	WebElement mainpage = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
	System.out.println(mainpage.getText());
	Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		
WebElement parentframe = driver.findElement(By.xpath("//body[text()='Parent frame']"));

System.out.println(parentframe.getText());
Thread.sleep(1000);
//driver.switchTo().frame(14);
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
 Thread.sleep(2000);
 WebElement childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']"));

 System.out.println(childtext.getText());
 driver.switchTo().defaultContent();
 System.out.println(mainpage.getText());


	}

}
