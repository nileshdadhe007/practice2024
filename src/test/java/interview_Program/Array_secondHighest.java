package interview_Program;

import java.util.Arrays;

public class Array_secondHighest {

	public static void main(String[] args) {
		
		int ar[]= {2,5,4,8,9,3};
		Arrays.sort(ar);
		System.out.println(ar[ar.length-2]);
		
	}

}
