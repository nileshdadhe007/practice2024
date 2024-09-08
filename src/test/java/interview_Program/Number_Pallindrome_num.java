package interview_Program;

import java.util.Scanner;

public class Number_Pallindrome_num {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter no to check for palindrome");
	int no=scan.nextInt();
	int org=no;
	int rev=0;
	while(no>0) {
	rev=rev*10+no%10;
	no=no/10;
	}

	if(org == rev) {
		System.out.println("given number is pallindrome");
	}else
	{
		System.out.println("not an pallindrome");
	}
	}

}
