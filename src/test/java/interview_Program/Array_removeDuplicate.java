package interview_Program;

import java.util.LinkedHashSet;

public class Array_removeDuplicate {
	public static void main(String[] args) {
		int [] a= {5,2,6,8,6,7,5,2,8};
		LinkedHashSet<Integer> sorted= new LinkedHashSet<Integer>();
		for(int i=0;i<a.length-1;i++) {
			sorted.add(a[i]);
		}
		for(int print:sorted) {
			System.out.print(print+", ");
		}
	}

}
