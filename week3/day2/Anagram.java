package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		
		//declare string variables
		String text1 = "stops";
		String text2 = "potss";
		
		//declare length of the strings
		int strL1 = text1.length();
		int strL2 = text2.length();
		
		//Check length of the strings are same
		System.out.print("The length of the strings are same: ");
		System.err.println(strL1 == strL2);
		
		//Convert both Strings in to characters
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		//sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//find length of the arrays
		int arrL1 = charArray1.length;
		int arrL2 = charArray2.length;
		
		////Check length of the arrays are same
		System.out.print("The length of the arrays are same: ");
		System.err.println(arrL1 == arrL2);
	}

}
