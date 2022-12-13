package upstox;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {



	public static void screenshot1(WebDriver driver,String upstox ) throws IOException {
		
		
		
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String s=RandomString.make(2);
		File dest=new File("D:\\screenshot\\"+upstox+".jpg");
		FileHandler.copy(src, dest);
	}
	public static void scrolling(WebDriver driver,WebElement element) 
	{
		
	JavascriptExecutor j= ((JavascriptExecutor)driver);
	j.executeScript("arguments[1].scrollIntoView(true);",element);
	
		
	}
	
	public static void wait1(WebDriver driver,int w) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(w));
	}
	
	
	
	
}