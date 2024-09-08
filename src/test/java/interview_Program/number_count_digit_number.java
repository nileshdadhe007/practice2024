package interview_Program;

import java.util.Scanner;

public class number_count_digit_number {
//program to count no of digit from the number
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		
			if(num<0) {
				num=num*-1;
			}else if(num==0) {
				num=1;
			}
			
			while(num>0){
				num=num/10;
				count++;
			}
		
		System.out.println("no of digit in the given number are: "+count);
	}

}
