package extendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreport1 {
	
	public static void main(String[] args) throws IOException {
		
	
	
	ExtentReports extentReports =new ExtentReports();
	ExtentSparkReporter sparkreporter =new ExtentSparkReporter("C:\\Excel Files\\Extendreports");
	extentReports.attachReporter(sparkreporter);
	ExtentTest test1 =extentReports.createTest("Test1");
	test1.pass("Test1  is passed");
	ExtentTest test2 =extentReports.createTest("Test2");
	test2.log(Status.FAIL,"Test2 is failed");
	ExtentTest test3 =extentReports.createTest("Test3").skip("Test3 is skipped");
	
	
	extentReports.flush();
	Desktop.getDesktop().browse(new File("C:\\Excel Files\\Extendreports\\index.html").toURI());

	}
}
