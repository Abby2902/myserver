package assertstudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnotequals {
  @Test
  public void testnotequals() {
	  
	  String a="Abhay";
	  String b="Abhay";
	  
	 Assert.assertNotEquals(a, b, "tc is failed as a and b is equal");
	  
	
	  
	  
  }
}
