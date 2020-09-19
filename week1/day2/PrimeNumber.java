package week1.day2.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 13;
		boolean flag = false;
				
		for(int i = 2; i < n; i++) {
		
			if(n % i == 0) {
				
				flag = true;				
			}
		}

		if(flag)	
		System.out.println(n + " is not a Prime Number");
		
		else					
		System.out.println(n + " is a Prime Number");
		
	}

}

