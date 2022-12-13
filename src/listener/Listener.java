package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listener implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC is completed successfully", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is Failed", true);	
		
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC is Skipped", true);
	}
	
	
}
