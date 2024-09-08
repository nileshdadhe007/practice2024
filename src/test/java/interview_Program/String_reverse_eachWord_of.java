package interview_Program;

public class String_reverse_eachWord_of {
	public static void main(String[] args) {
	    reverseEachWordsOfString("java is good programming language");
	    }
	    static void reverseEachWordsOfString(String inputString){
	        String[] words=inputString.split(" ");
	        String reverseString="";
	        for(int i=0;i<words.length;i++){
	           String word= words[i];
	           String revWord="";
	         for(int j=word.length()-1;j>=0;j--){
	             revWord=revWord+word.charAt(j);
	         }
	         reverseString=reverseString+revWord+" ";
	         
	        }
	        System.out.println(inputString);
	        System.out.println(reverseString);
	        
	    }
}
