package bootstrapdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"justAnInputBox\"]")).click();
		
		
		
		List<WebElement> numbers=driver.findElements(By.xpath("//*[@id=\"comboTree56818DropDownContainer\"]/ul"));
		System.out.println(numbers.size());
		
		
		for(int i=0;i<numbers.size();i++)
		{
			driver.findElements(By.xpath("//*[@id=\"comboTree56818DropDownContainer\"]/ul/li[i]").g)
		}
	 
      // driver.quit();
	}

}
