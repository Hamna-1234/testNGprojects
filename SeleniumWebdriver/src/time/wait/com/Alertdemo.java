package time.wait.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();//closses popup by choosing ok
		
		
		
		
	}

}
