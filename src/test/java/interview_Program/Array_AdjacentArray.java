package interview_Program;

public class Array_AdjacentArray {
	public static void main(String[] args) {
		int[] a= {15,17,8,4,1};
		int dif=0;
		int max=0;
		//abs method from math class return + value of any integer positive or negative
		for(int i=0;i<a.length-1;i++) {
			 dif = a[i+1]-a[i];
			 if(Math.abs(dif)>max) {
					max=Math.abs(dif);
				}
		}
		System.out.println("max difference between two adjacent is: "+max);
		
	}

}
