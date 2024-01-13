package Day4_11223;

import org.testng.annotations.Test;

@Test(groups = "classLevelGroup")
public class GroupsDemo {
	
	@Test(priority = 1, groups = {"Smoke"})
	public void testMethod1()
	{
		System.out.println("Test Method 1, Smoke");
	}

	@Test(priority = 2, groups = {"Sanity"})
	public void testMethod2()
	{
		System.out.println("Test Method 2, Sanity");
	}

	@Test(priority = 3, groups = {"Smoke ","Sanity"})
	public void testMethod3()
	{
		System.out.println("Test Method 3, Smoke and Sanity");
	}

	@Test(priority = 4, groups = {"linux.Regression"})
	public void testMethod4()
	{
		System.out.println("Test Method 4, Regression");
	}

	@Test(priority = 5, groups = {"Sanity", "Regression"})
	public void testMethod5()
	{
		System.out.println("Test Method 5, Sanity and Regression");
	}

	@Test(priority = 6, groups = {"Sanity","Smoke","Regression"})
	public void testMethod6()
	{
		System.out.println("Test Method 6,  Sanity, Smoke and Regression");
	}

	@Test(priority = 7, groups = {"Smoke", "Regression"})
	public void testMethod7()
	{
		System.out.println("Test Method 7, Smoke and Regression");
	}

	@Test(priority = 8, groups = {"Sanity", "Regression"})
	public void testMethod8()
	{
		System.out.println("Test Method 8, Sanity and Regression");
	}

	@Test(priority = 9, groups = {"mac.Sanity"})
	public void testMethod9()
	{
		System.out.println("Test Method 9, Sanity");
	}
	@Test(priority = 10, groups = {"window.Smoke"})
	public void testMethod10()
	{
		System.out.println("Test Method 10, Smoke");
	}

}
