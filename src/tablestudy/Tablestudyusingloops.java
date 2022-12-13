package tablestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablestudyusingloops {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
        Thread.sleep(1000);
       WebElement head = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[1]"));
		
       System.out.println(head.getText());
       System.out.println("================================================");
       
       for(int i=1;i<=3;i++) {
    	   
    	   
    	   WebElement data = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th["+i+"]"));
    	   
    	   System.out.print(data.getText()+"        ");
       }
       System.out.println();
       //for selecting particular row
       
       for(int i=1;i<=11;i++) {
    	   
    	   for(int j=1;j<=3;j++) {
    	   if(i==1) {
    		   
    		   System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText()+"          ");
    	   }else {
    	   WebElement data = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]"));
    	
    	   System.out.print(data.getText()+"          ");}
    	   }   System.out.println(); 	   
       }
       
       
       
       
       
      
       
       
	}

}
