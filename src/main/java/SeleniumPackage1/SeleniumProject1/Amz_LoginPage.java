package SeleniumPackage1.SeleniumProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_LoginPage extends AmazonDatasheet
{
	static WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement UsernameField;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement PasswordField;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SigninButton;
	
	@FindBy(xpath="//span[@class='a-button-inner']/a")
	WebElement CreateAccount_Button;
	
	@FindBy(xpath="//span[contains(text(),'Deliver to Sandeep')]")
	WebElement SuccessfulLoginText;
	
	@FindBy(xpath="(//div[@class='a-alert-content'])[4]")
	WebElement InvalidUser;
	
	@FindBy(xpath="//span[contains(text(),'Enter verification code')]")
	WebElement VarificationCode;
	
	@FindBy(xpath="//div[@class='a-row a-spacing-small']/span/span/input")
	WebElement SubmitButton;
	
	
	public void Enter_Username()
	
	{
		UsernameField.sendKeys(username);
	}
	
	public void Click_Continue()
	
	{
		ContinueButton.click();
	}
	
	public void Enter_Invalid_Email(String invalidun)
	{
		UsernameField.sendKeys(invalidun);
		ContinueButton.click();
		Assert.assertTrue(InvalidUser.isDisplayed());
	}
	
	
	public void Enter_Password()
	
	{
		PasswordField.sendKeys(password);
	}
	
	public void Click_Signin() throws InterruptedException
	
	{
		SigninButton.click();
		Thread.sleep(5000);
//		if(VarificationCode.isDisplayed()) {
//			Thread.sleep(10000);
//			SubmitButton.click();			
//		}else {
//		
//			Assert.assertTrue(SuccessfulLoginText.isDisplayed());
//			
//		}
		
	}
	
	
	public void Click_CreateAccount()
	
	{
		CreateAccount_Button.click();
	}
	
	
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		

}
