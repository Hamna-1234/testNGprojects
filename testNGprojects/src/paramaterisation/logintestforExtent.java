package paramaterisation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class logintestforExtent {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		 driver =new ChromeDriver();
	}
	@Test(priority=1)
	public void logintest() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(5000);
		
	}
	
	
	
	/*@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}*/
	@AfterMethod
	public void capturescreen(ITestResult result) throws IOException
	{
		System.out.println("hello");
		if(result.getStatus()==ITestResult.FAILURE)
		{
			 TakesScreenshot ts =(TakesScreenshot)driver;
			 File source =ts.getScreenshotAs(OutputType.FILE);
			 
			 File target=new File(System.getProperty("user.dir")+"/Screenshots/"+result.getName()+".png");
			 FileUtils.copyFile(source, target);
			 System.out.println("screenshot captured");
		}
		
	}
	
	

}
