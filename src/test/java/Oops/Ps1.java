package Oops;

import org.testng.annotations.Test;

public class Ps1 extends Ps{
	@Test
	public void testRun()
	{
		doThis();
		Ps2 ps2=new Ps2(3); //parameterised contructor 
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
	}
	//even though before test place in parent class it will run first then test class method 
	//all non imp code we can put in parent class so that test class is clear 

}
