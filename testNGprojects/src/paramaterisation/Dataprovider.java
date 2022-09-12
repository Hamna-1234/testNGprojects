package paramaterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Dataprovider {
	WebDriver driver=null;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		  driver =new ChromeDriver();
		  Thread.sleep(3000);
	}
	@Test(dataProvider="users")
	void login(String usname,String passwrd) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	  Thread.sleep(3000);
		
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(usname);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(passwrd);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	}
	
	
	@DataProvider(name="users")
	String [][] logindata()
	{
	String data[][]=	{{"Admin","admin123"},{"min","a123"}};
	return data;
	}

	@AfterClass
	void logout() throws InterruptedException
	{
	Thread.sleep(3000);
	driver.close();
	Thread.sleep(3000);
	}
}
