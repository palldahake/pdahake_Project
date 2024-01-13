package Day5_41223;

import org.testng.ITestListener;
import org.testng.ITestResult;



	public class ListernerTest implements ITestListener {
		
		  public void onTestStart(ITestResult result) {
			  System.out.println("Test Execution Started :  "+result.getName());
			  
			  }
			  public void onTestSuccess(ITestResult result) {
				  
				  System.out.println("Test Pass Successfully :  "+result.getName());
				  
			  }

			  
			  public void onTestFailure(ITestResult result) {
				  System.out.println("Oops Test got Failed :  "+result.getName());
				  
			    
			  }

			 
			  public void onTestSkipped(ITestResult result) {
				  System.out.println("Oh my god Test got Skipped :  "+result.getName());
				  
			  }

			   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
				  System.out.println("Let it be :  "+result.getName());
				  
			  }

			   public void onTestFailedWithTimeout(ITestResult result) {
			    onTestFailure(result);
			  }

			  public void onStart(ITestResult result) {
				  System.out.println("Execution Started");
	}
			  public void onFinish(ITestResult result) {
				  System.out.println("Execution Stooped");
	}	  
}
