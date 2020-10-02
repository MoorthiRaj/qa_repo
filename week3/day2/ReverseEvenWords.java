package week3.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String reverse = " ";
		
		String ans = " ";
		
		String[] value = test.split(" ");
		
		for (int i = 0; i < value.length; i++) {
			
			if (i%2 != 0) {
				
				//System.out.println(value[i]);
				String newValue = value[i];
				
				for (int j = newValue.length() - 1; j>=0; j--) {
					reverse = reverse + newValue.charAt(j);
				}
			ans = ans + reverse + " ";
			}	
			else {
				ans = ans + value[i];
			}
			
		}System.out.println(ans);

	}

}
