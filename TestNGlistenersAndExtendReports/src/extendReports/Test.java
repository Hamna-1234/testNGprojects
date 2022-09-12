package extendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class Test {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports =new ExtentReports();
		ExtentSparkReporter sparkreporter =new ExtentSparkReporter("C:\\Excel Files\\Extendreports");
		extentReports.attachReporter(sparkreporter);
		sparkreporter.loadXMLConfig(new File("./src/extendReports/Extent.xml"));
		extentReports.attachReporter(sparkreporter);
		sparkreporter.viewConfigurer().viewOrder().as(new ViewName[]{
			ViewName.CATEGORY,
			ViewName.DASHBOARD,
			ViewName.DEVICE
		}).apply();
			
			
			extentReports
			.createTest("Test5","new test")
			.assignAuthor("hamna")
			.assignCategory("smoke")
			.assignDevice("chrome")
			.pass("this is a passed test");
			
			extentReports
			.createTest("Test6","after new test")
			.assignAuthor("nihaz")
			.assignCategory("sanity")
			.assignDevice("chrome")
			.fail("this is a failed test");
			
			extentReports
			.createTest("Test7","after new test")
			.assignAuthor("heyza")
			.assignCategory("sanity")
			.assignDevice("chrome")
			.pass("this is a passed test");
			
			
			
			
				
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		 WebDriver driver =new ChromeDriver();
		Capabilities capability= ((RemoteWebDriver) driver).getCapabilities();
		System.out.println(capability.getBrowserName());
		System.out.println(capability.getBrowserVersion());
		
		extentReports.setSystemInfo("OS",System.getProperty("os.name"));
		extentReports.setSystemInfo("java",System.getProperty("java.version"));
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("C:\\Excel Files\\Extendreports\\index.html").toURI());
        
		

	}

}
