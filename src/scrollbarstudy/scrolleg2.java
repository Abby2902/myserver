package scrollbarstudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolleg2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(1500,500);

		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
	}

}
