package SeleniumPackage1.SeleniumProject1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_SearchingProduct_Test extends Amz_LaunchAndQuit
{
	@Test(dataProvider="inputvalue", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void SearchProduct(String value1)
	{
		Amz_SearchingProduct sp=new Amz_SearchingProduct(driver);
		sp.SearchField(value1);
		
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] data1()
	{
		return new Object[][]  {{"shoe"}};
	
	}

}
