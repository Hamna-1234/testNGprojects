package extendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Author {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports =new ExtentReports();
		ExtentSparkReporter sparkreporter =new ExtentSparkReporter("C:\\Excel Files\\Extendreports");
		extentReports.attachReporter(sparkreporter);
		sparkreporter.loadXMLConfig(new File("./src/extendReports/Extent.xml"));
		extentReports.attachReporter(sparkreporter);
		//sparkreporter.config().setTheme(Theme.DARK);
		
		
		
		
		extentReports
		.createTest("screenshot test","this is my first screenshot test")
		.info("this is info msg");
		
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

		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("C:\\Excel Files\\Extendreports\\index.html").toURI());
        
	}
}
