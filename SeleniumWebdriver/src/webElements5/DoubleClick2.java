package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://api.jquery.com/dblclick/#dblclick");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		Actions act =new Actions(driver);
		WebElement ele =driver.findElement(By.xpath("/html/body/div"));
		
		act.doubleClick(ele).build().perform();
		Thread.sleep(3000);
		
		act.doubleClick(ele).build().perform();
		Thread.sleep(3000);
		
		act.doubleClick(ele).build().perform();
		Thread.sleep(3000);

	}

}
