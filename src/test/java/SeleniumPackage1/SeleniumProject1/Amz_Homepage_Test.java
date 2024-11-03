package SeleniumPackage1.SeleniumProject1;

import org.testng.annotations.Test;


public class Amz_Homepage_Test extends Amz_LaunchAndQuit
{
	@Test(retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void Homepage_Test() throws InterruptedException
	{
		Amz_Homepage hp=new Amz_Homepage(driver);
		hp.Navigate_To_AccountList();
	}
	

}
