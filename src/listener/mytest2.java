package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mytest2 {

	  @Test
	  public void D() {
		  
		  Reporter.log("TC D is Running", true);
	  }
	  @Test(dependsOnMethods="F")
	  public void E()
	{  
		  
		  Reporter.log("TC E is Running", true);
	  

	} 
	  @Test
	  public void F() 
	  {Assert.fail();
		  Reporter.log("TC F is Running", true);
		  
	  }
}
