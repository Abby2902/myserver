package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsmethodsyudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_accountmenu_re_signout%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%2526ref_%253Dnavm_accountmenu_re_signout%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnavm_accountmenu_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		
		WebElement search = driver.findElement(By.xpath("//input[@id='ap_email']"));
		
		search.sendKeys("swati");
		
		Thread.sleep(1000);
		search.clear();
search.sendKeys("8262002959");
driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
	

WebElement text = driver.findElement(By.className("a-row"));
String actualresult = text.getText();
System.out.println("my actual text is  "+actualresult);

String expected="Your name";
if(actualresult.equals(expected)) {
	System.out.println("true");
}else {
	System.out.println("false");
}
	}

}
