package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amz_LastProductRatingTest extends Amz_LaunchAndQuit
{
	@Test(retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void ProductRatingTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		AmazonDatasheet dt = new AmazonDatasheet();
		dt.getData();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Amz_Homepage hp = new Amz_Homepage(driver);
		Amz_YourOrderPage yo = new Amz_YourOrderPage(driver);
		Amz_OrderDetailPageTest odpage = new Amz_OrderDetailPageTest(driver);
		Amz_ProductReviewPage pr = new Amz_ProductReviewPage(driver);
		Amz_LoginPage lp = new Amz_LoginPage(driver);
		
		hp.Navigate_To_AccountList();
		lp.Enter_Username();
		lp.Click_Continue();
		lp.Enter_Password();
		lp.Click_Signin();
		hp.ClickViewOrder();
		wait.until(ExpectedConditions.visibilityOf(yo.YourOrderText));
		Assert.assertTrue(yo.YourOrderText.isDisplayed());
		yo.ClickViewLastOrder();
		wait.until(ExpectedConditions.visibilityOf(odpage.OrderInfo));
		Assert.assertTrue(odpage.OrderInfo.isDisplayed());
		odpage.ClickProductReview();
		wait.until(ExpectedConditions.visibilityOf(pr.CreateReviewText));
		Assert.assertTrue(pr.CreateReviewText.isDisplayed());
		pr.ClickFourStar();
		wait.until(ExpectedConditions.visibilityOf(pr.ReviewSubmitted));
		Assert.assertTrue(pr.ReviewSubmitted.isDisplayed());
		
		
	}

}
