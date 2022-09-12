package excelRead;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excelwrite11 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://www.easycalculation.com/simple-interest.php");
	driver.manage().window().maximize();
	
	
	String path ="C://Excel Files/bank.xlsx";
	
	int rowcount =XLUtils.getRowCount(path,"sheet1");
	
	for(int r=1;r<=rowcount;r++)
	{
		int princi=Integer.parseInt(XLUtils.getCellData(path,"sheet1", r, 0));
		System.out.println(princi);
		int rate =Integer.parseInt(XLUtils.getCellData(path,"sheet1", r, 1));
		int year=Integer.parseInt(XLUtils.getCellData(path,"sheet1", r, 2));
		int simpleinterest=Integer.parseInt(XLUtils.getCellData(path,"sheet1", r, 3));
		System.out.println(princi);

		driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[2]/input")).sendKeys(String.valueOf(princi));
		driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[3]/span[1]/input")).sendKeys(String.valueOf(rate));
		driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[4]/span[1]/input")).sendKeys(String.valueOf(year));
		//driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[5]/input")).getAttributevalue("dd");
		
	}
	
	
	}

}
