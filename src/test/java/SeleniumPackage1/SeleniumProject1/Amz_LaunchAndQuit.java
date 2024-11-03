package SeleniumPackage1.SeleniumProject1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;




@Listeners(ITestListenersPro.class)
public class Amz_LaunchAndQuit extends ITestListenersPro
{

	
	@BeforeMethod
	public void LaunchAmazon()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void QuitAmazon() throws InterruptedException
	{
       
       driver.quit();
	}

}
