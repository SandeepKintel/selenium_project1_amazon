package SeleniumPackage1.SeleniumProject1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_SearchingProduct 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement SearchField;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")
	WebElement VerifySearchResult;
	
	@FindBy(xpath="//*[@id=\"n/1983577031\"]/span/a/span")
	WebElement Category1;
	
	@FindBy(xpath="//div[@class='a-section s-range-input-container s-lower-bound aok-relative']")
	WebElement Slider;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement GoButton;
	

	

	
	
	
	
	public void SearchField(String value1)
	{
		SearchField.sendKeys(value1+Keys.ENTER);
		Assert.assertTrue(VerifySearchResult.isDisplayed());
	}
	
	public void ScrollDown(WebDriver driver) throws InterruptedException
	{
		Point p1=Category1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
	}
	
	public void ClickCategory()
	{
		Category1.click();
	}
	
	public void SetPriceRange(WebDriver driver) throws InterruptedException
	{
		Point p2=Slider.getLocation();
		int x=p2.getX();
		int y=p2.getY();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");

	}
	
	public void SlideSlider(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.clickAndHold(Slider).moveByOffset(200, 0).release().perform();
	}
	
	public void ClickGoButton()
	{
		GoButton.clear();
		
	}
	
	public Amz_SearchingProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
