package asserts_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("This method got executed because a Test was started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("This method got executed because a Test was Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This method got executed because a Test was Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("This method will be executed if any Tests were skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
