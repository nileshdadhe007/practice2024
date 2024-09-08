package interview_Program;

public class String_Reverse_sentense {
	public static void main(String[] args) {
		String str="this is a sentence";
		String rev="";
		String[] a =str.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			if(i==0) {
				rev=rev+a[i];
			}else
			{
				rev=rev+a[i]+" ";
			}
		}
		System.out.println(rev);
	}

}
