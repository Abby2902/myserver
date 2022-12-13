package popupstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopupstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		al.accept();
		
		WebElement text = driver.findElement(By.xpath("//div[text()='Alerts']"));
		System.out.println("text on main page is "+text.getText());
	}

}
