package interview_Program;

import java.util.Scanner;

public class String_noOfWordsIn {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' ) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
