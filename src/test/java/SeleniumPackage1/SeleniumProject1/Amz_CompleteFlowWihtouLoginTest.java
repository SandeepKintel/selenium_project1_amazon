package SeleniumPackage1.SeleniumProject1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_CompleteFlowWihtouLoginTest extends Amz_LaunchAndQuit
{
	@Test(dataProvider="inputvalue", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void CompleteFlowTest(String value1) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Amz_AddToCartPage atc = new Amz_AddToCartPage(driver);
		Amz_ShoppinCart_Page sc = new Amz_ShoppinCart_Page(driver);
		Amz_SearchingProduct sp = new Amz_SearchingProduct(driver);
		Amz_ProductDetailPage pd= new Amz_ProductDetailPage(driver);
		
		//Amz_CheckOutPage cp = new Amz_CheckOutPage(driver);
		
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
		atc.Click_Cart();
		wait.until(ExpectedConditions.visibilityOf(sc.ShoppingCartText));
		Assert.assertTrue(sc.ShoppingCartText.isDisplayed());
		sc.ClickProceedToBuyButton();
		
		// After this it requires Login in to the Application //
		
		/*wait.until(ExpectedConditions.visibilityOf(cp.CheckoutText));
		Assert.assertTrue(cp.CheckoutText.isDisplayed());
		cp.ClickOfficeAddress();
		Assert.assertTrue(cp.OfficeAddress.isSelected());
		cp.ClickUseThisAddress();
		wait.until(ExpectedConditions.visibilityOf(cp.CardTypeText));
		Assert.assertTrue(cp.CardTypeText.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(cp.SBIRadio));
		cp.ClickSBICardOption();
		wait.until(ExpectedConditions.elementToBeSelected(cp.SBIRadio));
		Assert.assertTrue(cp.SBIRadio.isSelected());
		cp.ClickUseThisPaymentButton();
		wait.until(ExpectedConditions.visibilityOf(cp.ReviewItems));
		Assert.assertTrue(cp.ReviewItems.isDisplayed());
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Assert.assertTrue(cp.Subtotal.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(cp.PlaceOrderButton));
		cp.ClickPlaceOrderButton();*/
		
		
	}
	
	
	@DataProvider(name="inputvalue")
	public Object[][] data1()
	{
		return new Object[][]  {{"iphone 16"}};
	
	}

}
