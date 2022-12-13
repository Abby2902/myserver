package groupingtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testclass {
  @Test(groups="sanity")
  public void a() {
	  
	  Reporter.log("test a is running", true);
	  
  }@Test(groups="regression")
  public void b() {
	  Reporter.log("test b is running", true);
	  
  }@Test(groups="sanity")
  public void c() {
	  Reporter.log("test c is running", true);
	  
	  
  }@Test(groups="regression")
  public void d() {
	  
	  Reporter.log("test d is running", true);
  }@Test(groups="regression")
  public void e() {
	  
	  Reporter.log("test e is running", true);
	  
  }
}
