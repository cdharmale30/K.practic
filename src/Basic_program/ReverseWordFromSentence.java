package Basic_program;

public class ReverseWordFromSentence {
	
	public static void main (String [] argds) {
		
		String str= "My Name Is Kailas Arbat";
		System.out.println("original string is = "+ str);
		String[] Strword= str.split("\\s");
		String rev="";
		for(String sw : Strword) {
			StringBuilder sb=new StringBuilder(sw);
			sb.reverse();
			rev +=sb.toString()+ " ";
		}
			System.out.println("modified String is = " + rev.trim() );
	}

}
