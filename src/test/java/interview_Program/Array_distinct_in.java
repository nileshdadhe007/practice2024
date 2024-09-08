package interview_Program;

public class Array_distinct_in {

	public static void main(String[] args) {
		int[] a= {1,2,2,4,5,4,7,9,9,10};
		for(int i=0;i<a.length;i++) {
			boolean flag=false;

			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					flag=true;
					break;
				}	
			}
			if(!flag) {
				System.out.println(a[i]);
			}
		}
	}

}
