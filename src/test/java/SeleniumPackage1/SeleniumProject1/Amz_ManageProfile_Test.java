package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Amz_ManageProfile_Test extends Amz_LaunchAndQuit
{
	@Test(retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void ManageProfile_Test() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amz_Homepage hp=new Amz_Homepage(driver);
		Amz_LoginTest lt = new Amz_LoginTest();
		lt.LoginTest();
		hp.HoverOver_AccountList(driver);
		Amz_ManageProfile mp=new Amz_ManageProfile(driver);
		Thread.sleep(2000);
		mp.Click_On_ManageProfile();
		mp.ClickView();
		mp.ClickEditIcon();
		mp.Editname();
		mp.Click_ContinueButton();
		
	}

}
