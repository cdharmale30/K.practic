package Basic_program;


public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="My name is kailas";
/*
 * int count=0; 
 * for (char ch: str.toCharArray()) {
 *  if (ch==' ') { 
 *  count++; 
 *  }
 *   }
 * System.out.println(count);
 */
   getCharOccurence(str,'s');

	}
	
	public static void getCharOccurence(String str,char c) {
		
		  int count=0; 
		  for (char ch: str.toCharArray()) {
		   if (ch==c) { 
		   count++; 
		   }
		    }
		  System.out.println("count is "+ count);
		 
			/*
			 * long count1=str.chars().mapToObj(e-> String.valueOf(e)).filter(e->
			 * e.equals('a')).count(); System.out.println(count1);
			 */
	}
	 

}
