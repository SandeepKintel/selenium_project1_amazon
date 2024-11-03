package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_CheckOutPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//h1[contains(text(),'Checkout')]")
	WebElement CheckoutText;
	
	@FindBy(xpath="(//input[@type='radio'])[5]")
	WebElement OfficeAddress;
	
	@FindBy(xpath="//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
	WebElement UseThisAddressButton;
	
	@FindBy(xpath="//span[contains(text(),'CREDIT & DEBIT CARDS')]")
	WebElement CardTypeText;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement SBIRadio;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement CreditOrDebitCard;
	
	@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")
	WebElement NetBanking;
	
	@FindBy(xpath="//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTNCTzRHR0JRRkY0MTE&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']")
	WebElement UPIMode;
	
	@FindBy(xpath="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']")
	WebElement EMIMode;
	
	@FindBy(xpath="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']")
	WebElement CODMode;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement EnterCodeField;
	
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
	WebElement CouponCodeApplyButton;
	
	@FindBy(xpath="//p[contains(text(),'The promotional code you entered is not valid.')]")
	WebElement CouponCodeValidationMsmg;
	
	@FindBy(xpath="//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
	WebElement UseThisPaymentButton;
	
	@FindBy(xpath="//h3[contains(text(),'Review items and delivery')]")
	WebElement ReviewItems;
	
	@FindBy(xpath="//h4[contains(text(),'Important message')]")
	WebElement ImportantMessage;
	
	@FindBy(xpath="//span[@id='subtotals-marketplace-spp-bottom']")
	WebElement Subtotal;
	
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[1]")
	WebElement PlaceOrderButton;
	

	
	public void ClickOfficeAddress()
	{
		OfficeAddress.click();
	}
	
	public void ClickUseThisAddress()
	{
		UseThisAddressButton.click();
	}
	
	public void ClickSBICardOption()
	{
		SBIRadio.click();
	}
	
	public void ClickUseThisPaymentButton()
	{
		UseThisPaymentButton.click();
	}
	
	
	public void ClickPlaceOrderButton()
	{
		PlaceOrderButton.click();
	}
	
	public void ClickCreditorDebitCardPaymentMode()
	{
		CreditOrDebitCard.click();
	}
	
	public void ClickNetBankingPaymentMode()
	{
		NetBanking.click();
	}
	
	public void ClickUPIPaymentMode()
	{
		UPIMode.click();
	}
	
	public void ClickEMIPaymentMode()
	{
		EMIMode.click();
	}
	
	public void ClickCODPaymentMode()
	{
		CODMode.click();
	}
	
	public void EnterPromoCode()
	{
		EnterCodeField.sendKeys("xfjdk12");
	}
	
	public void ClickApplyCode()
	{
		CouponCodeApplyButton.click();
	}
	
	public Amz_CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
