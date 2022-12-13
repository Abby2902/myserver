package mytestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngkeywords {
  @Test
  public void otp() throws InterruptedException {
  Thread.sleep(3000);
  Reporter.log("otp should be send five times",true);
  
  }
}
