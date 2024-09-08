package interview_Program;

public class String_CountChar_in_string {
	public static void main(String[] args) {
	String name="aaabbva";
	int count=0;

	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='a') {
			count++;
		}
	}
	System.out.println(count);

}
}
