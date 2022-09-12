package paramaterisation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Parameters({"a","b"})
	@Test
	public void m1(String s,String s2)
	{
		System.out.println(s+ s2);
	}
	//@Parameters("b")
	@Test
	public void m2()
	{
		System.out.println("hello");
	}


}
