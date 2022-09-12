package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		//.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
		
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement usermgmnt=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(admin).moveToElement(usermgmnt).moveToElement(users).click().build().perform();
	}

}
