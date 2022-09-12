package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Tc1 {

	@Test(priority=1)
	void m1()
	{
		System.out.println("m1");
	}
	@Test(priority=2)
	void m2()
	{
		System.out.println("m2");
	}
	
	@AfterTest
	void mn() {
		System.out.println("test over");
	}
	
	
	
}
