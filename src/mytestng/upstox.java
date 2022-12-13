package mytestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class upstox {
  @Test
  public void validateusername() {
	  
	  Reporter.log("Actual user name is matching expected username ", true);
	  
  }
  
  
  @BeforeMethod
  public void enterunpwdandpasscode() {
	  
	  Reporter.log("Enter User name and password", true);
	  Reporter.log("enter passcode and click", true);
	  Reporter.log("welcome page is visible and click on no iamgood", true);
	
  }
  

  @AfterMethod
  public void logout() {
	  
	  
	  Reporter.log("click on username and click on logout", true);
	  
  }

  @BeforeClass
  public void launchurl() {
	  
	  Reporter.log("launch url of upstox web application", true);
	  
  }

  @AfterClass
  public void closebrowser() {
	  
	  Reporter.log("close the browser by using driver.close method", true);
	  
	  
  }

}
