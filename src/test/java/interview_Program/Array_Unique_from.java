package interview_Program;

import java.util.ArrayList;

public class Array_Unique_from {
	public static void main(String[] args) {
	int [] a= {4,5,5,4,6,6,9};
	ArrayList<Integer> ab=new ArrayList<Integer>();
	
	for(int i=0;i<a.length;i++) {
		int k=0;
		if(!ab.contains(a[i])) {
			ab.add(a[i]);
			k++;
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]) {
		k++;
			}
		}
		System.out.print(a[i]);
		System.out.println("="+k);
		if(k==1) {
			System.out.println(a[i]+" is unique number");
		}
		}
	
	}
	}

}
