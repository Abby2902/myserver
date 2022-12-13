package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Digitpasscodepage {
	
	//declaration
	@FindBy(name="yob")private WebElement passcode;

	//initialization
	
	
	public Digitpasscodepage(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}
	//usage
public void enterpasscode(String ps) {
	
	passcode.sendKeys(ps);
	
	
}	

}
