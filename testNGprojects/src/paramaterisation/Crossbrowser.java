package paramaterisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Crossbrowser {
	WebDriver driver=null;
	
	@Parameters("browser")
	@Test(priority=1)
	public void launchbrowser(String br) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
			System.out.println("login");
			System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
			 driver =new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C://Drivers//geckodriver-v0.31.0-win6//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		//System.out.println("dfndjg");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]"));
		//Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void register() throws InterruptedException
	{
		//Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(3000);
		}
	@Test(priority=4)
    public void logout() throws InterruptedException
    {
		Thread.sleep(3000);
    	driver.close();
    	Thread.sleep(3000);
    }
}
