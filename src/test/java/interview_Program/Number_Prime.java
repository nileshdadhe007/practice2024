package interview_Program;

import java.util.Scanner;

public class Number_Prime {
	//prime numbers are those number which is divided by itself and 1
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter the number which you want to check for prime: ");
			int value = scan.nextInt();
			int count=0;
			if(value>1) {
			
			for(int i=1;i<=value;i++) {
				if(value%i==0){
					count++;
				}
			}
				if(count==2) {
					System.out.println("given number is prime number");
				}else
				{
					System.out.println("not a prime number");
				}
				
			}else
			
{
			System.out.println("not a prime number");
}
		}

}
}
