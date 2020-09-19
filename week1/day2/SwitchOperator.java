package week1.day2.assignments;

public class SwitchOperator {

	public static void main(String[] args) {
		
		int a=2, b=3;
		String operations = "add";
		
		switch(operations) {
		
		case "add": System.out.println(a+b);
					break;
					
		case "sub": System.out.println(a-b);	
					break;
					
		case "mul": System.out.println(a*b);
					break;			
					
		case "div": System.out.println(a/b);
		            break;
		
		default : System.out.println("Invalid operations!");
					    break;
		}
	}
}

