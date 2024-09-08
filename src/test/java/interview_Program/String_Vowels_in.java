package interview_Program;

public class String_Vowels_in {
	public static void main(String[] args) {
		String str ="my name is nilesh";
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}			
		}
		System.out.println(count);
	
	}

}
