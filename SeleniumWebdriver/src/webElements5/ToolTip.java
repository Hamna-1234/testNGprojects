package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		WebElement agebox=driver.findElement(By.xpath("/html/body/p[1]/a"));
		
	String tooltip=agebox.getAttribute("title");
		System.out.println(tooltip);

	}

}
