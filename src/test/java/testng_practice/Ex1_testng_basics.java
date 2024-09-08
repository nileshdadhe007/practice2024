package testng_practice;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex1_testng_basics {
	@Test(groups= {"smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	@Test
	public void demo2()
	{
		System.out.println("bye"); 
		Assert.assertTrue(false);
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("@BeforeTest: i will run before the classes which mention in testng.xml"); 
	}
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("@BeforeSuit: i will execute first of all annotation");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("@AfterSuits: i will execute after all annotations");
	}
	
}
