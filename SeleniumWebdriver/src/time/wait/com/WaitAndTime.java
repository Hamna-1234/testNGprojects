package time.wait.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitAndTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://goo.gl/RVdKM9");
	    
	    driver.manage().window().maximize();//maximize window
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    
	    for(WebElement e:links)
	    {
	    	System.out.println(e.getText());
	    }
	    
	    
	    

	}

}
