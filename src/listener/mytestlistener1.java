package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listener.class)
public class mytestlistener1 {
  
  @Test
  public void A() {
	  
	  Reporter.log("TC A is Running", true);
  }
  @Test(dependsOnMethods="C")
  public void B()
{  
	  
	  Reporter.log("TC B is Running", true);
  

} 
  @Test
  public void C() 
  {Assert.fail();
	  Reporter.log("TC C is Running", true);
	  
  }
}
