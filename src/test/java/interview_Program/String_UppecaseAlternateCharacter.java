package interview_Program;

public class String_UppecaseAlternateCharacter {

	public static void main(String[] args) {

		String str ="Automation";
		char[] ab=str.toCharArray();
		for(int i=0;i<ab.length;i=i+2) {
			ab[i]=Character.toUpperCase(ab[i]);
			
		}
		String str1=new String(ab);
		System.out.println(str1);
	}

}
