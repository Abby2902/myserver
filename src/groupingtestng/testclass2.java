package groupingtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testclass2 {
  @Test(groups="sanity")
  public void f() {
	  
	  Reporter.log("test f is running", true);
	  
  }@Test(groups="regression")
  public void g() {
	  Reporter.log("test g is running", true);
	  
  }@Test(groups="sanity")
  public void h() {
	  Reporter.log("test h is running", true);
	  
	  
  }@Test(groups="regression")
  public void i() {
	  
	  Reporter.log("test i is running", true);
  
	  
  }  
@Test
public void p() {
	  
	  Reporter.log("test i is running", true);

	  
}
}
