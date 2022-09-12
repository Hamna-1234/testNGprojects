package webelement3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//String handlevalue=driver.getWindowHandle();
		//System.out.println(handlevalue);
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set<String>handlevalues=driver.getWindowHandles();
		
		for(String e:handlevalues)
		{
			String title= driver.switchTo().window(e).getTitle();
			System.out.println(title);
			if(title.equals("Selenium"))
			{
				driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
				
			}
			
		}

	}

}
