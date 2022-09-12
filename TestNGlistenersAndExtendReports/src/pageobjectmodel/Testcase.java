package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase {
	 WebDriver driver;
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		 driver =new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@Test
	void login()
	{
		Loginclass lc =new Loginclass(driver);
		lc.username("Admin");
		lc.password("admin123");
		lc.button();
		
	}

}
