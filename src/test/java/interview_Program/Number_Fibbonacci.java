package interview_Program;

public class Number_Fibbonacci {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<6;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
	}

}
