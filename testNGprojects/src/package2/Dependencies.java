package package2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies {
	
	@Test(priority=1)
	void openURL()
	{
		System.out.println("url opened");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openURL"})
	void login()
	{
		System.out.println("login");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("search");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	void advancesearch()
	{
		System.out.println("advanced search");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void logout()
	{
		System.out.println("logout");
		Assert.assertTrue(true);
	}

}
