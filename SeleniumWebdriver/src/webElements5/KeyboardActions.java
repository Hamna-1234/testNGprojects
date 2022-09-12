package webElements5;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		
driver.quit();
	}

}
