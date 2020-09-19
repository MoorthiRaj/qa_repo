package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] input = {1,2,3,4,7,6,8};

		Arrays.sort(input);

		for (int i = 0; i < input.length; i++) {
			
			if (input[i] >= input.length) {
				
				System.out.println("Missed number is: " + i);
				
				break;
			}
		}
	}

}

