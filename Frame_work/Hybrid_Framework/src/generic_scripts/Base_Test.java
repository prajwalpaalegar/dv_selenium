package generic_scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements FrameWorkConst
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(Gecko_Key,Gecko_value);
		driver=new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_Shot.getPhoto(driver);
		}
		driver.close();
		
	}
}
