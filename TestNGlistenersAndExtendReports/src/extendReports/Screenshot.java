package extendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Screenshot {
	 static WebDriver driver=null;

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports =new ExtentReports();
		ExtentSparkReporter sparkreporter =new ExtentSparkReporter("C:\\Excel Files\\Extendreports");
		extentReports.attachReporter(sparkreporter);
		sparkreporter.loadXMLConfig(new File("./src/extendReports/Extent.xml"));
		extentReports.attachReporter(sparkreporter);
		
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		 driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		
		String Base64 =screenshot();
		String path=screenshot("oranghrm.jpg");
		
		
		extentReports
		.createTest("screenshot test 1","this is my  screenshot test")
		.info("this is info msg")
		.addScreenCaptureFromBase64String(Base64);
		
		extentReports
		.createTest("screenshot test 2","this is my  screenshot test")
		.info("this is info msg")
		.addScreenCaptureFromBase64String(Base64,"orangHrm");
		
		extentReports
		.createTest("screenshot test 3","this is my screenshot test")
		.info("this is info msg")
		.addScreenCaptureFromPath(path);
		
		extentReports
		.createTest("screenshot test 4","this is my  screenshot test")
		.info("this is info msg")
		.addScreenCaptureFromPath(path,"orangeHRM")
		.addScreenCaptureFromPath(path,"orangeHRM");
		
		extentReports
		.createTest("screenshot test 5","this is my  screenshot test")
		.info("this is info msg")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		
		
		
		
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("C:\\Excel Files\\Extendreports\\index.html").toURI());
        
     
	}
	
	public static String screenshot(String filename) {
		TakesScreenshot takesscreenshot =(TakesScreenshot)driver;
		File sourcefile =takesscreenshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./screenshots/"+filename);
		try {
			FileUtils.copyFile(sourcefile, destfile);
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
		
		System.out.println("screenshot done");
		return destfile.getAbsolutePath();
		
		
	}
	public static String screenshot() {
		TakesScreenshot takesscreenshot =(TakesScreenshot)driver;
		String Base64code=takesscreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("screenshot done");
		return Base64code;
		
		
	}
	

}
