package ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCases are failed and details are:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCases are skipped and details are:"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCases are started and details are:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases are successed and details are:"+result.getName());
		
	}

}
