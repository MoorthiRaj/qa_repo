package week3.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		String value = "madam";
		
		String rev = "";
		
		
	  int length = value.length();
	  
	  for (int i = length-1; i >= 0; i--) {
	  
		  rev = rev + value.charAt(i);
	  
	  }
	  
	  if (value.equalsIgnoreCase(rev)) {
	  
		  System.out.println("Palindrome Number"); 
	  
	  }
		  
	  else {
		
		  System.out.println("Not a Palindrome");
	  }
	  
	}
	

}
