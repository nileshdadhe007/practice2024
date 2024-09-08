package testng_practice;

import org.testng.annotations.Test;

public class Ex1_testng_basics4 {
	@Test(groups= {"smoke"})
	public void webloginHomeLoan()
	{
		System.out.println("webloginHomeLoan passed");
	}
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobileLoginHomeLoan pass"); 
	}
	@Test(dependsOnMethods = "webloginHomeLoan")
	public void loginAPIhomeLoan()
	{
		System.out.println("APILoginHomeLoan pass"); 
	}

}
