package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		//Thread.sleep(3000);
		Actions act =new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize,100,100).build().perform();
		Thread.sleep(3000);

		driver.quit();
	}

}
