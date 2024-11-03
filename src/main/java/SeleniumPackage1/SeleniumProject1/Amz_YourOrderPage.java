package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_YourOrderPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//h1[contains(text(),'Your Orders')]")
	WebElement YourOrderText;
	
	@FindBy(xpath="//a[@id='a-autoid-4-announce']")
	WebElement ViewLastItem;
	
	
	public void ClickViewLastOrder()
	{
		ViewLastItem.click();
	}
	
	public Amz_YourOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
