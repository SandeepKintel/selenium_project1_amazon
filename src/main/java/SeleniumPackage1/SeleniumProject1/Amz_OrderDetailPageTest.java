package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_OrderDetailPageTest 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Write a product review')]")
	WebElement ProductReview;
	
	@FindBy(xpath="//h2[contains(text(),'Order info')]")
	WebElement OrderInfo;
	
	public void ClickProductReview()
	{
		ProductReview.click();
	}
	
	public Amz_OrderDetailPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
