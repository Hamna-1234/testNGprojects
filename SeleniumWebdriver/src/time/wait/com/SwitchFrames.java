package time.wait.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		driver.manage().window().maximize();
	}

}
