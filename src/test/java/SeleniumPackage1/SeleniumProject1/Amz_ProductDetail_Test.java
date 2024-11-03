package SeleniumPackage1.SeleniumProject1;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_ProductDetail_Test extends Amz_LaunchAndQuit

{
	@Test(dataProvider="inputvalue", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void ProductDetail(String value1) throws InterruptedException
	{

		JavascriptExecutor js= (JavascriptExecutor) driver;
		Amz_SearchingProduct sp=new Amz_SearchingProduct(driver);
		sp.SearchField(value1);
		Amz_ProductDetailPage pd= new Amz_ProductDetailPage(driver);

		pd.SearchAndClick();
		Set<String> windowtitle=driver.getWindowHandles();
		Iterator <String> i1=windowtitle.iterator();
		String ParentWidnow=i1.next();
		String ChildWindow=i1.next();
		System.out.println(ParentWidnow);
		System.out.println(ChildWindow);
		driver.switchTo().window(ChildWindow);
		pd.VerifyPrice();
		js.executeScript("arguments[0].scrollIntoView(true);", pd.AboutProduct);
		pd.VerifyDescription();
		js.executeScript("arguments[0].scrollIntoView(true);", pd.Review);
		pd.VerifyReview();
	
		

		
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] data1()
	{
		return new Object[][]  {{"iphone 16"}};
	
	}

}
