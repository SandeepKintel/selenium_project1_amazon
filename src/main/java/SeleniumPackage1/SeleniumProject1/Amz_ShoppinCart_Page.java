package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ShoppinCart_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//h2[contains(text(),'Shopping Cart')]")
	WebElement ShoppingCartText;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement AddItem;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-remove']")
	WebElement MinusItem;
	
	@FindBy(xpath="(//span[contains(text(),'₹79,900.00')])[2]")
	WebElement ProductPrice;
	
	@FindBy(xpath="//span[@id='sc-subtotal-amount-buybox']")
	WebElement Subtotal;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement DeleteItem;
	
	@FindBy(xpath="//span[@class='a-size-base sc-list-item-removed-msg-text-delete']")
	WebElement ItemRemoveMsg;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement ProceedToBuyButton;

	
	public void Click_AddItem()
	{
		AddItem.click();
	}
	
	public void Click_DeleteItem() 
	{
		DeleteItem.click();
	}
	
	public void ClickProceedToBuyButton()
	{
		ProceedToBuyButton.click();
	}
	
	public Amz_ShoppinCart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
