package interview_Program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DEMO1 {
	public static void main(String[] args) {
		int a[]= {21,2,17,2,12,16,15,21,5,9,14,7};
		int mech[]= {8,38,12,2,7,49,19,5,1,2,1};
		Arrays.sort(a);
		Arrays.sort(mech);
		
		for(int sorted:a) {
			System.out.print(sorted+" ");
		}
		System.out.println();
		for(int sorted:mech) {
			System.out.print(sorted+" ");
		}
		
	}

}
