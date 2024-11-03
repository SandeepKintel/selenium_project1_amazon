package SeleniumPackage1.SeleniumProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Amz_ProductDetailPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Apple iPhone 16 (128 GB) - Black')]")
	WebElement Product;
	
	@FindBy(xpath="//div[@id='corePriceDisplay_desktop_feature_div']")
	WebElement Price;
	
	@FindBy(xpath="//h1[contains(text(),' About this item ')]")
	WebElement AboutProduct;
	
	@FindBy(xpath="//div[@class='_cr-ratings-histogram_style_star-rating__s2nPF']/div/div/div/div/h2")
	WebElement Review;
	
	@FindBy(xpath="(//input[@title='Add to Shopping Cart'])[2]")
	WebElement AddtoCartButton;
	
	
	public void SearchAndClick() throws InterruptedException
	{
		Product.click();
	}
	
	public void VerifyPrice()
	{
		Assert.assertTrue(Price.isDisplayed());
	}
	
	public void VerifyDescription()
	{
		Assert.assertTrue(AboutProduct.isDisplayed());
	}
	
	public void VerifyReview()
	{
		Assert.assertTrue(Review.isDisplayed());
	}
	
	public void ClickAddtoCartButton()
	{
		AddtoCartButton.click();
	}
	

	
	public Amz_ProductDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
