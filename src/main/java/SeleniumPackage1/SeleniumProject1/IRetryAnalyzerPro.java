package SeleniumPackage1.SeleniumProject1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerPro implements IRetryAnalyzer 
{

	
	public boolean retry(ITestResult result) 
	{
		int currentcount = 0;
		int retrycount = 2;
		if(currentcount<retrycount)
		{
			currentcount++;
			return true;
		}
		return false;
	}

}
