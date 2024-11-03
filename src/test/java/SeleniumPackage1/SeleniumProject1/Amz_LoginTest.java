package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Amz_LoginTest extends Amz_LaunchAndQuit
{

	@Test(retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void LoginTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		AmazonDatasheet dt = new AmazonDatasheet();
		dt.getData();
		Amz_Homepage hp = new Amz_Homepage(driver);
		Amz_LoginPage lp = new Amz_LoginPage(driver);
		hp.Navigate_To_AccountList();
		lp.Enter_Username();
		lp.Click_Continue();
		lp.Enter_Password();
		lp.Click_Signin();

		
	}
}
