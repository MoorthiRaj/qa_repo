package week3.day2.assignments;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		
		char[] charArray = test.toCharArray();
		
		System.out.print("### Reversing the string using toCharArray ###");
		
		System.out.println("\n");
		
		for (int i = charArray.length-1; i >= 0; i--) {
			
			System.out.print(charArray[i]);
		}
		
		int length = test.length();
		
		System.out.println("\n");
		
		System.out.print("### Reversing the string using CharAt ###");
		
		System.out.println("\n");
		
		for (int i = length-1; i >= 0; i--) {
			
			System.out.print(test.charAt(i));
		}

	}

}
