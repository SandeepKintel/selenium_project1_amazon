package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_AddToCartPageTest extends Amz_LaunchAndQuit
{
	@Test(dataProvider="inputvalue", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void AddToCartPageTest(String value1) throws InterruptedException, EncryptedDocumentException, IOException
	{
		AmazonDatasheet dt = new AmazonDatasheet();
		dt.getData();
		
		Amz_Homepage hp = new Amz_Homepage(driver);
		Amz_LoginPage lp = new Amz_LoginPage(driver);
		Amz_SearchingProduct sp=new Amz_SearchingProduct(driver);
		Amz_ProductDetailPage pd= new Amz_ProductDetailPage(driver);
		Amz_AddToCartPage atc = new Amz_AddToCartPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		hp.Navigate_To_AccountList();
		lp.Enter_Username();
		lp.Click_Continue();
		lp.Enter_Password();
		lp.Click_Signin();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		sp.SearchField(value1);
		pd.SearchAndClick();
		Set<String> windowtitle=driver.getWindowHandles();
		Iterator <String> i1=windowtitle.iterator();
		String ParentWidnow=i1.next();
		String ChildWindow=i1.next();
		System.out.println(ParentWidnow);
		System.out.println(ChildWindow);
		driver.switchTo().window(ChildWindow);
		js.executeScript("arguments[0].scrollIntoView(true)",pd.AddtoCartButton);
		pd.ClickAddtoCartButton();
		wait.until(ExpectedConditions.visibilityOf(atc.AddedCartText));
		Assert.assertTrue(atc.AddedCartText.isDisplayed());
		
		
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] data1()
	{
		return new Object[][]  {{"iphone 16"}};
	
	}

}
