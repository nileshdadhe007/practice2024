package interview_Program;

import java.util.ArrayList;

public class String_CountDuplicateCharInString {

	public static void main(String[] args) {
		String str="learn java programming";
		char[] a = str.toCharArray();
		int count=0;
		ArrayList<Character>ab=new ArrayList<Character>();
		System.out.println("duplicate character in the string are:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] & a[i]!=' ' & !ab.contains(a[i])) {
					ab.add(a[j]);
					count++;
					System.out.print(a[j]+" ");
				}
				
			}
		}
		System.out.println();
		System.out.print("no of duplicate characters are: "+count);
	

}
}
