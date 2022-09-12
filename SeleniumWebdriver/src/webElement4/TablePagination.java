package webElement4;

import org.openqa.selenium.chrome.ChromeDriver;

public class TablePagination {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	}

}
