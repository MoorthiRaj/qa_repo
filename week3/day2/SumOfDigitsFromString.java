package week3.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		//declare a string
		String text = "Tes12Le79af65";
		
		//declare a int variable
		int sum = 0;
		
		System.err.println("\t***METHOD ONE***");
		
		//replace all the non-digits into ""
		String replaceAll = text.replaceAll("[^A-z.]", "");
		
		
		//convert the String into array
		char[] charArray = replaceAll.toCharArray();
		
		//Iterate over the array and get each character
		System.out.print("\nThe characters are: ");
		for (char ch : charArray) {
			System.out.print(ch);
			int numericValue = Character.getNumericValue(ch);
			
			//Add the values to sum
			sum = sum + numericValue;
		}

		System.out.println(); // to print a line or we can also use \n
		
		//print the sum
		System.out.print("The numeric value is " + sum);
		
		System.err.println("\n \t***METHOD TWO***");
		
		String text1 = "Tes12Le79af65";
		int sum1 = 0;
		
		char[] charArray2 = text1.toCharArray();
		
		//Iterate an  array over the String
		for (char temp : charArray2) {
		
			//Get each character and check if it is a number using Character.isDigit()
			boolean num = Character.isDigit(temp);
			
			//covert char to int using Character.getNumericValue() and add it to sum
			sum1 = sum1 + Character.getNumericValue(temp);
		}
		
		System.out.println("The numeric value is " + sum1);
	}

}
