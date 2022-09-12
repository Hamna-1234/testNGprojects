package extendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Repotforfailed {

	public static void main(String[] args) throws IOException {
		ExtentReports extentreports=new ExtentReports();
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("alltext.html");
		ExtentSparkReporter sparkreporter_failed=new ExtentSparkReporter("failed.html");
		
		sparkreporter_failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		ExtentSparkReporter sparkreporter_skipped=new ExtentSparkReporter("skipped.html");
		extentreports.attachReporter(sparkreporter,sparkreporter_failed, sparkreporter_skipped);
		
		
		
		extentreports
		.createTest("Test5","new test")
		.assignAuthor("hamna")
		.assignCategory("smoke")
		.assignDevice("chrome")
		.fail("this is a failed test");
		
		extentreports
		.createTest("Test6","after new test")
		.assignAuthor("nihaz")
		.assignCategory("sanity")
		.assignDevice("chrome")
		.pass("this is a passed test");
		
		extentreports
		.createTest("Test7","after new test")
		.assignAuthor("heyza")
		.assignCategory("sanity")
		.assignDevice("chrome")
		.skip("this is a skipped test");
		
		
		
		
		
		
		
		
		
		extentreports.flush();
		Desktop.getDesktop().browse(new File("alltext.html").toURI());
		Desktop.getDesktop().browse(new File("failed.html").toURI());
		Desktop.getDesktop().browse(new File("skipped.html").toURI());
        
		
	}

}
