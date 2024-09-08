package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners

public class Listeners implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result)
	{
		//screenshot code
		System.out.println("i ran after testng execution fails ");
		System.out.println("@"+result.getName());
	}
}
