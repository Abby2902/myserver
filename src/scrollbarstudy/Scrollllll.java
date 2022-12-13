package scrollbarstudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollllll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 JavascriptExecutor j=((JavascriptExecutor)driver);
		 
		 j.executeScript("window.scrollBy(80,2000)");
		 Thread.sleep(2000);
		 j.executeScript("window.scrollBy(20,5000)");
		 Thread.sleep(2000);
		 j.executeScript("window.scrollBy(80,-5000)");
		
		j.executeScript("window.scrollTo(100,100)");
		
		
	}

}
