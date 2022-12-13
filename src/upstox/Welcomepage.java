package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {

	//declaration
	
	@FindBy(xpath="//div[text()='No, I’m good']")private  WebElement noiamgoodbutton;
	
	//initialization
	
	
	public Welcomepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	//usage
	
	public void clickonnoiamgoodbutton() {
		
		noiamgoodbutton.click();
	}
	
	
	
	
}
