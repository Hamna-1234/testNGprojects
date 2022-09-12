package excelRead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadtry1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		String path = "C://Excel Files/data.xlsx";
		int rows=XLUtils.getRowCount(path,"sheet1");
		
		//for(int r=0;r<=rows;r++)
		//{
			String name =XLUtils.getCellData(path, "sheet1", 1, 1);
			String sname=XLUtils.getCellData(path, "sheet1", 1, 2);
			//System.out.println(name);
			//System.out.println(sname);
			driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys(name);
			driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']")).sendKeys(sname);
		//}
		
			//*[@id="RESULT_TextField-1"]
		
		
		
		
		

	}
}


