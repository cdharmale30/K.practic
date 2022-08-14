package Basic_program;

import java.util.HashMap;

public class CharacterOccuernceForAll {

	public static void main(String[] args) {
		 String Str ="kailas karbat ";
		 
		 HashMap<Character, Integer> count = new HashMap<>();
		 for (int i=0;i<Str.length();i++){
		
			 char ch=Str.charAt(i);
			 if (count.get(ch)!=null) {
				 count.put(ch, count.get(ch)+1);
			 }
			 else {
				 count.put(ch,1);
			 }
		 }
		 System.out.println(count);
	}

}
