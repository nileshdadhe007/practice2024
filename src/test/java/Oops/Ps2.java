package Oops;

public class Ps2 extends Ps3 {
int a;

public Ps2(int a) {
	super(a);
this.a=a;
//this keyword suggest that take variable from current class 
}
public int increment()
{
	a=a+1;
	return a;
	
}
public int decrement()
{
	a=a-1;
	return a;
	
}
}
