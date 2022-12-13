package failedtestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  Reporter.log("my f testcase is running", true);
	  
  } @Test
  public void h() {
	  Assert.fail();
	  Reporter.log("my h testcase is running", true);
	  
	  
  }
  @Test
  public void j() {
	  
	  Reporter.log("my j testcase is running", true);
	  
	  
  }
  @Test
  public void i() {
	  
	  Reporter.log("my i testcase is running", true);
	  
	  
	  
  }
  
}
