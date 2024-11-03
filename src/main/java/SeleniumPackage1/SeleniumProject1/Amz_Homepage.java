package SeleniumPackage1.SeleniumProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Amz_Homepage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='nav-line-1-container']")
	WebElement AccountList;
	
	@FindBy(xpath="//h1[contains(text(),'Sign in')]")
	WebElement SignText;
	
	@FindBy(xpath="//span[@class='nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content']")
	WebElement CartIconAddedItem;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement CartIcon;
	
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement ViewOrder;
	
	
	
	public void Navigate_To_AccountList()
	{
		AccountList.click();

		Assert.assertTrue(SignText.isDisplayed());
	}
	
	public void HoverOver_AccountList(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(AccountList).perform();

	}
	
	public void ClickToAddedCartItem()
	{
		CartIconAddedItem.click();
	}
	
	public void ClickToCartIcon()

	{
		CartIcon.click();
	}
	
	public void ClickViewOrder()

	{
		ViewOrder.click();
	}
	
	

	public Amz_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
