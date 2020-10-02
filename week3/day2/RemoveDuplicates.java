package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] value = text.split(" ");
		
		Set<String> newValue = new LinkedHashSet<String>();
		
		for (String tempVal : value) { 
			
			newValue.add(tempVal);
		}
		System.out.println("Duplicate strings as removed: ");
		for (String tempVal2 : newValue) {
			System.out.print(tempVal2 + " ");
		}
	}

}
