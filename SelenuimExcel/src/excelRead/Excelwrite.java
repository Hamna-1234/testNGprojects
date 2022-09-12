package excelRead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelwrite {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String path ="C://Excel Files/login.xlsx";
		
		int rowcount =XLUtils.getRowCount(path,"sheet1");
		int columncount =XLUtils.getCellCount(path,"sheet1", rowcount);
		//System.out.println("username"+" "+"password");
		for(int r=1;r<=rowcount;r++)
		{
	
		String username=XLUtils.getCellData(path, "sheet1",r,0);
		String password=XLUtils.getCellData(path,"sheet1", r,1);
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
		{
			System.out.println("test passed");
			XLUtils.setCellData(path, "sheet1", r, 2,"passed");
			Thread.sleep(3000);
			driver.navigate().back();
		}
		else
		{
			System.out.println("test failed");
			XLUtils.setCellData(path, "sheet1", r, 2,"failed");
		}
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).clear();
		
		
		
		
		
		/*System.out.print(username+" ");
		System.out.print(password);
		System.out.println();*/
		}
	}
}