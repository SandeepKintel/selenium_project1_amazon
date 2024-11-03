package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ProductReviewPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Create Review')]")
	WebElement CreateReviewText;
	
	@FindBy(xpath="(//img[@class='ryp__review-stars__star ryp__star ryp__star--large'])[4]")
	WebElement FourStarRating;
	
	@FindBy(xpath="//div[@class='a-box a-alert-inline a-alert-inline-success']")
	WebElement ReviewSubmitted;
	
	public void ClickFourStar()
	{
		FourStarRating.click();
	}
	
	
	public Amz_ProductReviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
