package interview_Program;

public class String_reverseEachWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
	    String inputString="java is good programming language";
	    String reverseString="";
	    String[]words =inputString.split(" ");
	    for(int i=0;i<words.length;i++){
	        String word=words[i];
	        String revword="";
	        for(int j=word.length()-1;j>=0;j--){
	        revword=revword+word.charAt(j);            
	            
	        }
	        reverseString=reverseString+revword+" ";
	    }
	    System.out.println(inputString);
	    System.out.println(reverseString);

	}

}
