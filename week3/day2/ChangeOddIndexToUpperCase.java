package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] charArray = test.toCharArray();
		
		int length = test.length();
		
		for (int j = 0; j < length; j++) {
			
			if(j %2 == 0) {
							
				System.out.println(Character.toUpperCase(charArray[j]));
			}
			else {
				System.out.println(Character.toLowerCase(charArray[j]));
			}
			
		}
		
		
		System.out.println("\n***Alternate Way***");
		
		  String input = "Hey you! There?";
		  
		  char[] charArray2 = input.toCharArray();
		  //store char array into char 
		  
		  for (char temp : charArray2) {
		  
			  if (temp % 2 == 1) {
		  
				  char upperCase = Character.toUpperCase(temp);
				  System.out.println(upperCase); 
				  
			  }
			  else {
				  
				  char lowerCase = Character.toLowerCase(temp);
				  System.out.println(lowerCase);
				  
			  }
			  
		  }
		 		 
	}

}
