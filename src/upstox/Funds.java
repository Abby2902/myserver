package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Funds {

	@FindBy(xpath="((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")private WebElement availablefunds;
	
	
	public Funds(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void availablefundsinaccount() {
		
		String myfund = availablefunds.getText();
		
		System.out.println(myfund);
		
	}
}
