package SeleniumPackage1.SeleniumProject1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_LoginFail_Test extends Amz_LaunchAndQuit
{
	@Test(dataProvider="inputvalue",retryAnalyzer=SeleniumPackage1.SeleniumProject1.IRetryAnalyzerPro.class)
	public void Login_Fail_Test(String invalidusername)
	{
		Amz_Homepage hp=new Amz_Homepage(driver);
		hp.Navigate_To_AccountList();
		Amz_LoginPage lp = new Amz_LoginPage(driver);
		lp.Enter_Invalid_Email(invalidusername);
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] dataset() throws IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\sandeep.kumar\\eclipse-workspace\\SeleniumProject1\\Confidential.xlsx");
	
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("negativecreds");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		String invalidusername=c1.getStringCellValue();
	
		Object[][] data =new Object[1][1];
		data[0][0]=invalidusername;
		
		return data;
		
		
	}

}
