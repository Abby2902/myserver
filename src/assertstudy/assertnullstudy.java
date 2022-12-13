package assertstudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnullstudy {
  @Test
  public void testnull() {
	  
	  String a="hi";	  
	  
	  Assert.assertNull(a,"tc is failed a is not null ");
	  
	  
	  
  }
}
