package excelREad;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		//Thread.sleep(3000);
		driver.get(" http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		
		

	}

}
