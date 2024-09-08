package testng_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex1_testng_basics3 {
	@Test(groups= {"smoke"})
	public void webloginCarLoan()
	{
		System.out.println("webloginCarLoan");
	}
	@Test(enabled = false)
	public void mobileLoginCarLoan()
	{
		System.out.println("mobile login"); 
	}
	@Test(dependsOnMethods = "mobileLoginSigninCarLoan")
	public void loginAPICarLoan()
	{
		System.out.println("loginAPIcarLoan "); 
	}
	@Test
	public void mobileLoginSigninCarLoan()
	{
		System.out.println("mobileLoginCarLoan"); 
	}
	@Test(dataProvider = "getdata")
	public void mobileLoginSignoutCarLoan(String username,String password)
	{
		System.out.println("mobileLoginCarLoan"); 
		System.out.println(username);

		System.out.println(password);
}
	@DataProvider
	public Object[][] getdata()
	{
		//1st combination - username password-good credit history
		//2nd row -usrname password-no credit history
		//3rd row username password froudulent
		
		Object[][] data= new Object[3][2];
		data[0][0]="username1";
		data[0][1]="password";
		data[1][0]="username2";
		data[1][1]="password2";
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
		
	}
}
