package neostoxtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neostoxbase.Baseclass;
import neostoxpomclasses.Neostoxhomepage;
import neostoxpomclasses.Neostoxpasswordpage;
import neostoxpomclasses.Neostoxsignin;
import neostoxutility.Utility;

public class neostoxtestclass extends Baseclass{
 
	Neostoxsignin signin;
	Neostoxpasswordpage password;
	Neostoxhomepage home;
	
	
	@BeforeClass
	public void launchneostox() 
	{
	
	launchbrowser();
		signin=new Neostoxsignin(driver);
		password=new Neostoxpasswordpage(driver);
		home=new Neostoxhomepage(driver);
	}
	
	
	@BeforeMethod
	
	public void logintoneostox() throws EncryptedDocumentException, IOException, InterruptedException {
		
		signin.neostoxsigninpage(driver, Utility.readDataFromExcel(2, 0));
		
		Thread.sleep(3000);
		password.enterpassword(driver, Utility.readDataFromExcel(2, 1));
		password.submitbuttonclick();
		Thread.sleep(2000);
		home.popuphandle(driver);
		
	
	
	}
	
	
	
	@Test
  public void validateusername() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
	Assert.assertEquals(home.validateuserid(), Utility.readDataFromExcel(2, 2),"tc is failed as results are not matching");
		
		Utility.takeSceenshot(driver, home.validateuserid());
		
  }
	@Test
	public void validatefunds() 
	{
		home.availablebalance();
		Reporter.log("account balnce is"+home.availablebalance(), true);
	}
	
	@AfterMethod
	public void closingbrowser() 
	{
		
		home.loggingout(driver);
		
		
		
	}
	
	
}
