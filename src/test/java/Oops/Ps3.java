package Oops;

import org.testng.annotations.Test;

public class Ps3 {
	int a;
	public Ps3(int a)
	{
		
		this.a=a;
	}
	@Test
	public int multiplyTwo()
	{
		a=a*2;
		return a;
	}
	@Test
	public int multiplyThree()
	{
		a=a*3;
		return a;
	}

}
