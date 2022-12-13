package nopcommercepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {
	
	@FindBy(id="gender-male")private WebElement gender;
	@FindBy(id="FirstName")private WebElement firstname;
	@FindBy(id="LastName")private WebElement lastname;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")private WebElement day;
	@FindBy(id="Email")private WebElement emailid;
	@FindBy(id="Password")private WebElement pass;
	@FindBy(id="ConfirmPassword")private WebElement cpass;
	
Select s=new Select(day);
public Registerpage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}

public void genderselection() 
{
	gender.click();
}


}
