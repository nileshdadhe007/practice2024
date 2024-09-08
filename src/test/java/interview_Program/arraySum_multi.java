package interview_Program;

public class arraySum_multi {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int sum=arraySum(a);
		//create a method which accept array and return sum of the element
		System.out.println(sum);
		//create method which multiply two variable without using multiplication operator
		int mul=multi(5,10);
		System.out.println(mul);
		
		
	}

	public static int multi(int a, int b) {
		int sum=0;
		
		for(int i=1;i<=b;i++) {
			 sum = sum+a;
		}
		return sum;
	}

	public static int arraySum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			 sum=sum+a[i];
		}
		return sum;
	}

}
