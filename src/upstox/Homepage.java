package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement username;
	@FindBy(id="funds")private WebElement funds;
	
	@FindBy(xpath="//div[text()='Logout']")private WebElement logout;
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
		
		public void getusername()
		{
		String act = username.getText();	
			
		String exp="ex";
		
		
		if(act.equalsIgnoreCase(exp)) {
			
			System.out.println("testcase is passed");
		}
		
		else {
			
			System.out.println("test case is failed");
		}
		}	
			
		public void clickonfundstab() {
			
			
			funds.click();
		}
		
		public void logoutoption() {
			username.click();
			logout.click();
		}
		
	}

