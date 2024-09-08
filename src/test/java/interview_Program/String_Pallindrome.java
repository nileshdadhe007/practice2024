package interview_Program;

public class String_Pallindrome {
	public static void main(String[] args) {
		String name="madam";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("given string is pallindrome");
		}
		System.out.println(rev);
	}

}
