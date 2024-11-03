package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_UpdatingAndRemovingCartItem extends Amz_LaunchAndQuit
{
	@Test(dataProvider="inputvalue", retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void UpdateItem(String value1) throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		AmazonDatasheet dt = new AmazonDatasheet();
		dt.getData();
		Amz_Homepage hp = new Amz_Homepage(driver);
		Amz_LoginPage lp = new Amz_LoginPage(driver);
		Amz_AddToCartPage atc = new Amz_AddToCartPage(driver);
		Amz_ShoppinCart_Page sc = new Amz_ShoppinCart_Page(driver);
		Amz_SearchingProduct sp=new Amz_SearchingProduct(driver);
		Amz_ProductDetailPage pd= new Amz_ProductDetailPage(driver);
		
		
		hp.Navigate_To_AccountList();
		lp.Enter_Username();
		lp.Click_Continue();
		lp.Enter_Password();
		lp.Click_Signin();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		/*try {
			//if(hp.CartIconAddedItem.isDisplayed()) {
				//hp.ClickToCartIcon();
			//hp.ClickToAddedCartItem();
			hp.CartIconAddedItem.click();
		
		}
	}
			catch(NoSuchElementException e) { 
			sp.SearchField(value1);
			pd.SearchAndClick();
			Set<String> windowtitle=driver.getWindowHandles();
			Iterator <String> i1=windowtitle.iterator();
			String ParentWidnow=i1.next();
			String ChildWindow=i1.next();
			System.out.println(ParentWidnow);
			System.out.println(ChildWindow);
			driver.switchTo().window(ChildWindow);
			js.executeScript("arguments[0].scrollIntoView(true)",pd.CartButton);
			pd.ClicktoCartButton();
			wait.until(ExpectedConditions.visibilityOf(atc.AddedCartText));
			Assert.assertTrue(atc.AddedCartText.isDisplayed());
			wait.until(ExpectedConditions.elementToBeClickable(atc.Cart));
			atc.Click_Cart();

		}*/
		
		
		if(hp.CartIconAddedItem.isDisplayed()) {
			hp.ClickToCartIcon();
		}
		
		/*else {
			sp.SearchField(value1);
			pd.SearchAndClick();
			Set<String> windowtitle=driver.getWindowHandles();
			Iterator <String> i1=windowtitle.iterator();
			String ParentWidnow=i1.next();
			String ChildWindow=i1.next();
			System.out.println(ParentWidnow);
			System.out.println(ChildWindow);
			driver.switchTo().window(ChildWindow);
			js.executeScript("arguments[0].scrollIntoView(true)",pd.CartButton);
			pd.ClicktoCartButton();

			wait.until(ExpectedConditions.elementToBeClickable(atc.Cart));
			atc.Click_Cart();
			wait.until(ExpectedConditions.visibilityOf(sc.ShoppingCartText));
			Assert.assertTrue(sc.ShoppingCartText.isDisplayed());
			
		}*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	
		sc.Click_AddItem();
		wait.until(ExpectedConditions.visibilityOf(sc.Subtotal));
		Assert.assertTrue(sc.ProductPrice!=sc.Subtotal);
		System.out.println("Item Quantity Updated successfuly");
		Thread.sleep(3000);
		sc.Click_DeleteItem();
		Assert.assertTrue(sc.ItemRemoveMsg.isDisplayed());
		System.out.println("Item Removed successfuly");
		Thread.sleep(2000);		
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] data1()
	{
		return new Object[][]  {{"iphone 16"}};
	
	}

}
