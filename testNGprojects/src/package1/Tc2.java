package package1;

import org.testng.annotations.*;

public class Tc2 {
	
	
	@Test(priority=3)
	void m3()
	{
		System.out.println("m3");
	}
	@Test(priority=4)
	void m4()
	{
		System.out.println("m4");
	}
	@BeforeTest
	void mm() {
		System.out.println("test begin");
	}

}
