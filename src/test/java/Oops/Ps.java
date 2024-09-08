package Oops;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ps {
	@Test
	public void doThis()
	{
		System.out.println("i am here");
	}
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run me first");
	}
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me last");
	}

}
