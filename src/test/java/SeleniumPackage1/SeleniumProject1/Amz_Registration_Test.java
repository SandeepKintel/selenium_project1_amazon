package SeleniumPackage1.SeleniumProject1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Amz_Registration_Test extends Amz_LaunchAndQuit
{
	@Test(dataProvider="input", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void Registration_Test(String name, String mobilenum, String password) throws InterruptedException
	{
		Amz_Homepage hp=new Amz_Homepage(driver);
		hp.Navigate_To_AccountList();
		Amz_LoginPage lp=new Amz_LoginPage(driver);
		lp.Click_CreateAccount();
		Amz_RegistrationPage reg=new Amz_RegistrationPage(driver);
		reg.Enter_Name(name);
		reg.Select_Code();
		reg.Enter_MobileNumber(mobilenum);
		reg.Enter_Pass(password);
		reg.Click_VerifyButton(driver);
		
		
	}
	
	@DataProvider(name="input")
	public Object[][] dataSet()
	{
		return new Object[][] {{"Sandeep Kumar", "9625036605", "India@4321"}};
		
	}

}
