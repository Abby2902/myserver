package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		 String title1 = driver.getTitle();
		 System.out.println("paytm title is"+title1);
	     String myurl1= driver.getCurrentUrl();
		 System.out.println("my current url is"+myurl1);
		Thread.sleep(1000);
		//driver.close();//close method to close current tab
		//driver.manage().window().maximize();//maximize method to maximize current tab
	   // Thread.sleep(1000);
	   // driver.manage().window().minimize();//minimize method to minimize current tab
	    driver.navigate().to("https://www.phonepe.com/");//navigate method to navigate currentpage to another page
	    Thread.sleep(1000);
	   // driver.navigate().back();
	    //Thread.sleep(1000);
	    //driver.navigate().forward();
	    //Thread.sleep(1000);
	   // driver.navigate().refresh();
	    
	    String title = driver.getTitle();//gettitle method to get title of the page we have opened
	System.out.println("phonepe title is"+title);
	String myurl = driver.getCurrentUrl();
	System.out.println("my current url is"+myurl);
	
	
	}

}
