package interview_Program;
//factorial of the number is multiplication of all the number starting from 1 to that number
import java.util.Scanner;

public class Number_factorial {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value to check for factorial");
		int number=scan.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of given number is:"+fact);
		
	}

}
