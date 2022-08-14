package Basic_program;

public class ReverseString {
	public static void main(String[] args) {
		
		String S ="kailas Arbat";
	     int len=S.length();
	     
	     for (int i=len-1;i>=0;i--) {
	    	 char ch=S.charAt(i);
	    	 System.out.print(ch);
	     }
	}

}
