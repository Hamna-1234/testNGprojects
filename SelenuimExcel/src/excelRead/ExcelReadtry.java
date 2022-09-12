package excelRead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ExcelReadtry {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get(" http://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
        driver.manage().window().maximize();
        
        String path ="C://Excel Files/Book1.xlsx";
        XLUtils.setExcelFile(path,"sheet1");
       int rowcount= XLUtils.getRowCount(path, "sheet1");
       int columncount =XLUtils.getCellCount(path, "sheet1", rowcount);
        for(int r=1;r<=rowcount;r++)
        {
        	
        		int princi=Integer.parseInt(XLUtils.getCellData(path, "sheet1", r, 0));
        		int rateofinterst=Integer.parseInt(XLUtils.getCellData(path, "sheet1", r, 1));
        		int per=Integer.parseInt(XLUtils.getCellData(path, "sheet1", r, 2));
        		String fre=XLUtils.getCellData(path, "sheet1", r, 3);
        		double exp_value=Integer.parseInt(XLUtils.getCellData(path, "sheet1", r, 4));
        		
        		driver.findElement(By.xpath("//*[@id=\"principal\"]")).sendKeys(String.valueOf(princi));
        		driver.findElement(By.xpath("//*[@id=\"interest\"]")).sendKeys(String.valueOf(rateofinterst));
        		driver.findElement(By.xpath("//*[@id=\"tenure\"]")).sendKeys(String.valueOf(per));
        		
        		WebElement drp =driver.findElement(By.xpath("//*[@id=\"tenurePeriod\"]"));
        		Select dropdown =new Select(drp);
        		
        		dropdown.selectByVisibleText("year(s)");
        		
        		WebElement simp=driver.findElement(By.xpath("//*[@id=\"frequency\"]"));
        		Select drop1=new Select(simp);
        		
        		drop1.selectByVisibleText("Simple Interest");
        		
        		
        		String act_mat=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
        		
        		
        		
        		driver.findElement(By.xpath("//*[@id=\'fdMatVal\']/div[2]/a[1]/img")).click();
        		
        		
        }
	}




	}


