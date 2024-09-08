package interview_Program;

public class String_Reverse {
	public static void main(String[] args) {
		String org="krishna";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);	
		}
		System.out.println("original String: "+org);
		System.out.println("reverse String: "+rev);
	}

}
