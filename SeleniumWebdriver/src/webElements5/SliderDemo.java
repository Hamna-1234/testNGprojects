package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions act =new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		

	}

}
//*[@id="slider"]/span