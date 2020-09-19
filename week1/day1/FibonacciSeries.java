package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range = 8 & firstNum = 0, secNum = 1 in the series)
		int range = 8, firstNum = 0, secNum = 1;
		
		// Iterate from 1 to the range
		for(int i=1; i<=range; i++) {
			
			// Print first number
			System.out.print(firstNum + " ");
						
			// add first and second number
			int sum = firstNum + secNum;
								
			// Assign second number to the first number
			firstNum = secNum;
						
			// Assign sum to the second number
			secNum = sum;

		}

	}

}

