package webElement4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

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
        int columns=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td")).size();
        System.out.println(columns);
        
        
        for(int r=1;r<=rows;r++)
        {
        	for(int c=2;c<=columns;c++)
        	{
        
               String value=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[" +r+ "]/td[" +c+ "]")).getText();
               System.out.print(value+"        " );
        }
        	System.out.println();
	}
       driver.quit();
	}

      }
