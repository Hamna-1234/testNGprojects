package webelement3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input"));		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"] ")).sendKeys("selenium");
		//driver.findElement(By("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).
        //Select dropdown =new Select(options);
      // System.out.println( dropdown.getOptions());
	}

}
