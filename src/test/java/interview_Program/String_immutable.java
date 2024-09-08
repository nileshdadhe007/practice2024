package interview_Program;

public class String_immutable {
	public static void main(String[] args) {
		String a="hello";
		String b="hello";
		//both object a and b refer to same memory address as content is same
		a.concat("world");
		System.out.println(a);
		String s =new String("hello");
		String s1= new String("hello");
		//we can see original object has not modified hence prove that string is immutable
		//to make string mutable stringBuffer and StringBuilder class are used
		
		System.out.println(a.equals(b));//true -equals method check for the content
		System.out.println(a==b);//true-== check for the reference comparison as it is same for a n b
		System.out.println(a.equals(s));//true- content is same
		System.out.println(a==s);//false-as both refer different reference object
		
		StringBuffer sb=new StringBuffer("hello");
		//StringBuffer is thread safe-synchronized
		//if no of test method try to access it will not allow once tc1 executed then only 2nd will go on
		sb.append("world");
		System.out.println(sb);
		//we can see that it is original object of string got change
		sb.insert(2, "she");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//StringBuilder is not thread safe-nonsyncronized -it will give access to all the method and may leads
		//test failure-as it is not thread safe it is faster that stringBuffer
	}

}
