package scrollbarstudy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolleg3 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
//		
//	Point p=new Point(500,0);
//	
//		
//		driver.manage().window().setPosition(p);
//		
//		
		
	}

}
