package upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxloginpage {
//variable declaration part
	@FindBy(id="userCode")private WebElement userid;
	
	@FindBy(name="password")private WebElement password;
	
	@FindBy(xpath="//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")private WebElement signinbutton;
	
	
	//initialization
	
	public Upstoxloginpage (WebDriver Driver) {
		
		
		PageFactory.initElements(Driver, this);
		
	}
	
	
	public void enteruserid(String ui) {
		
		
		userid.sendKeys(ui);
	}
	
	public void enterpassword(String pw) {
		
		password.sendKeys(pw);
		
	}
	 public void clickonsigninbutton() {
		 
		 signinbutton.click();
		 
	 }
	
	
	
}
