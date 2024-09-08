package interview_Program;

public class Number_Reverse {
	public static void main(String[] args) {
		int num=1234;
		int rev = 0;
		/*
		 * for(int i=0;i<num;i++) { rev=rev*10+num%10; num=num/10;
		 * 
		 * }
		 */
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
