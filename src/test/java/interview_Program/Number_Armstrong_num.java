package interview_Program;
//armstrong is the number where sum of cube of each digit is equals to the number
public class Number_Armstrong_num {
public static void main(String[] args) {
	int number=153;
	int temp,rem;
	temp=number;
	int arm=0;
	while(number>0) {
		rem=number%10;
		arm=arm+(rem*rem*rem);
		number=number/10;
	}
	System.out.println(arm);
	if (temp==arm) {
		System.out.println("given number is armstrong number");
	}else {
		System.out.println("not an armstrong number");
	}
}
}
