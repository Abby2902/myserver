package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Notepadpractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s = RandomString.make(3);
		File dest=new File("D:\\screenshot\\Abhay"+s+".jpg");
		FileHandler.copy(src,dest);



	}

}
