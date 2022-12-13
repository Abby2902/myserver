package assertstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertequals {
  @Test
  public void testequals() {
	  
	  String a="Abhay";
	  String b="Abha";
	  
	 Assert.assertEquals(a, b,"tc is failed as a and b is not equal");
	  
	  Reporter.log("tc is passed", true);
  }
}
