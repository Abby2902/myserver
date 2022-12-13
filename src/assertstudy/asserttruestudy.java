package assertstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttruestudy {
  @Test
  public void testtrue() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	  
	  WebElement check = driver.findElement(By.id("checkBoxOption1"));
	  
	  //check.click();
	  Assert.assertTrue(check.isSelected(),"tc is failed check box is not selected");
  }
}
