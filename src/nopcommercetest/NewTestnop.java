package nopcommercetest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import nopcommercebase.Nopbase;
import nopcommercepom.Registerpage;
import nopcommercepom.homepage;
import nopcommerceutility.Noputility;

public class NewTestnop extends Nopbase {
	homepage home;
	Registerpage register;
	
	 @BeforeClass
	 
	 public void launchbrowser()
	 {
		 launchbrowernop();
		 home=new homepage(driver);
		 register=new Registerpage(driver);
		 
		 
	 }
	 
	 @BeforeMethod
	 public void registerpage()
	 {
		 
		 home.clickonregisterbutton();
		 
	 }
	 
	
	
	
	
	
	
	
  @Test
  public void registerchecking() {
	
	 Noputility.wait(driver, 0);
	  register.genderselection();
	  
	  
  }
}
