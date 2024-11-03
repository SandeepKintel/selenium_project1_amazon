package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_AddToCartPage 
{
   WebDriver driver;

   @FindBy(xpath="(//h4[contains(text(),'Added to cart')])[2]")
   WebElement AddedCartText;
   
   @FindBy(xpath=" //*[@id=\"attach-sidesheet-view-cart-button\"]")
   WebElement Cart;
   
   
   public void Click_Cart()
   {
	   Cart.click();
   }
   
   public Amz_AddToCartPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
}

