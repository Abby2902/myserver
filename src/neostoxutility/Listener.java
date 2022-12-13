package neostoxutility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neostoxbase.Newbaseclass;


public class Listener extends Newbaseclass  implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC"+result.getName()+" is completed successfully", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+"is Failed", true);	
		
		try {
			Newutility.takeSceenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC"+result.getName()+" is Skipped", true);
	}
	
	
}
