package webElement4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
		
		int rows=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
        System.out.println(rows);
        int count =0;
        
        for(int r=1;r<=rows;r++)
        {
        	String status=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
        	
        	if(status.equals("Enabled"))
        	{
        		count++;
        	}
        	
        }
        System.out.println("Number of enabled employees :"+count);
        System.out.println("Number of disabled employess :"+( rows-count));
        
        
        driver.quit();
	}
	

}
