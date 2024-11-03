package SeleniumPackage1.SeleniumProject1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_SearchProductByCategory extends Amz_LaunchAndQuit
{
	@Test(dataProvider="inputvalue", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void SearchByCategory(String value1) throws InterruptedException
	{
		Amz_SearchingProduct sp=new Amz_SearchingProduct(driver);
		sp.SearchField(value1);
		sp.ScrollDown(driver);
		sp.ClickCategory();
		sp.SetPriceRange(driver);
		sp.SlideSlider(driver);
		//sp.ClickGoButton();
		
		
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] data1()
	{
		return new Object[][]  {{"shoe"}};
	
	}

}
