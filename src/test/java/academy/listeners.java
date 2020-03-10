package academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Resource.Base;

public   class listeners implements ITestListener {
	Base b = new Base();
public void onTestStart(ITestResult result) {
		

		
	}
	
	public void onTestSuccess(ITestResult result) {
		
	
		
	}
 //(ITestResult result knows all the thongs 
	public void onTestFailure(ITestResult result) {
	System.out.println(result.getName());
		try {
			b.getScreenShot(result.getName());
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	public void onTestSkipped(ITestResult result) {
	
		
	}
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
		
	}
 
	public void onStart(ITestContext context) {
		
		
		
		
	}
 
	public void onFinish(ITestContext context) {
			
	
	}


}
