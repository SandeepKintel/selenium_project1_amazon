package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amz_RegistrationPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement FirstName;
	
	@FindBy(xpath="//select[@name='countryCode']")
	WebElement CountryCode;
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement MobileNumber;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement VerifyMobileButton;
	
	public void Enter_Name(String name)
	{
		FirstName.sendKeys(name);
	}
	
	public void Select_Code()
	{
		Select s1=new Select(CountryCode);
		s1.selectByIndex(92);
	}
	
	public void Enter_MobileNumber(String num)
	{
		MobileNumber.sendKeys(num);
	}
	
	public void Enter_Pass(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void Click_VerifyButton(WebDriver driver) throws InterruptedException
	{
		VerifyMobileButton.click();
		Thread.sleep(2000);
		String actual=driver.getTitle();
		String expected="Authentication required";
		Assert.assertEquals(actual, expected);
	}
	
	public void Verify_Page_Title()
	{
		
	}
	
	public Amz_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}

