package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_ManageProfile 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"selectProfileModalId\"]/div/div/div[2]")
	WebElement ManageProfile;
	
	@FindBy(xpath="//div[@class='sc-hmdomO qqYTW']/a")
	WebElement View;
	
	@FindBy(xpath="//div[contains(text(),'Your Profile')]")
	WebElement YourProfile;
	
	@FindBy(xpath="//span[@class='a-declarative']")
	WebElement EditIcon;
	
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement NameField;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement ContinueButton;
	
	public void Click_On_ManageProfile() throws InterruptedException
	{
		ManageProfile.click();
		Thread.sleep(1000);

	}
	
	public void ClickView() throws InterruptedException
	{
		View.click();	
		Thread.sleep(1000);
		Assert.assertTrue(YourProfile.isDisplayed());
	}
	
	public void ClickEditIcon()
	{
		EditIcon.click();
		
	}
	
	public void Editname() throws InterruptedException
	{
		NameField.sendKeys(" Kumar");
		Thread.sleep(2000);
		for(int i=0; i<6; i++) {
		NameField.sendKeys(Keys.BACK_SPACE);
		}
	}
	
	public void Click_ContinueButton()
	{
		ContinueButton.click();
	}
	
	public Amz_ManageProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
