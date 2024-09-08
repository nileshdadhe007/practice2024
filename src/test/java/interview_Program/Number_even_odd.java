package interview_Program;

import java.util.Scanner;

public class Number_even_odd {

	public static void main(String[] args) {

		System.out.println("enter value to check for even and odd");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
	}

}
