package paramaterisation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sortingdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("udemy");
		
		
		
		
		
	/*	driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List <WebElement>list=driver.findElements(By.xpath("//*[@class=\"sa_sg\"]//span"));
		for(WebElement e:list)
		{
			if (e.getText().equals("selenium webdriver"))
			{
				e.click();
				break;
			}
		}
		
		////*[@id="sa_5003"]System.out.println("number of elements ="+list.size());
		
		*/
	}
}
