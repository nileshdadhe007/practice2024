package interview_Program;

public class String_removeSpaces {

	public static void main(String[] args) {
		String str ="My Name Is Nilesh";
		/*String[] ab=str.split(" ");
		String str1 = "";
		for(int i=0;i<ab.length;i++) {
			str1=str1+ab[i];
		}
		System.out.println(str1);
	*/
		System.out.println(str.replaceAll(" ", ""));
	}

}
