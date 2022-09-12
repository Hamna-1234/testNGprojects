package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();

		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollBy(0,4000)","");
		
		WebElement flag =driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
	
		js.executeScript("arguments[0].scrollIntoView();",flag);
	}

}
