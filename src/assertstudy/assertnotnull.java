package assertstudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnotnull {
  @Test
  public void testnotnull() {
	  
	  
	  String a=null;	  
	  
	  Assert.assertNotNull(a,"tc is failed a is  null ");
	  
	  
	  
	  
  }
}
