package testng_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex1_testng_basics2 {
	@Parameters({"URL","APIKEY"})
	@Test
	public void ploan(String urlname, String APIKEY)
	{
		System.out.println("have a ");
		System.out.println(urlname);
		System.out.println(APIKEY);
	}
	@Test(groups= {"smoke"})
	public void ploan2()
	{
		System.out.println("nice day"); 
	}
	@AfterTest
	public void deletecatche()
	{
		System.out.println("@AfterTest:i will run after classes which mention in testng.xml"); 
	}
	@BeforeClass
	public void beforeclas()
	{
		System.out.println("@BeforeClass : i run before class method run ");
	}
	@AfterClass
	public void afterclas()
	{
		System.out.println("@AfterClass : i run after all the method from class ");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("@beforeMethod:i will execute before every method execute from the class");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("@AfterMethod:i will execute after every method from the class");
	}
}
