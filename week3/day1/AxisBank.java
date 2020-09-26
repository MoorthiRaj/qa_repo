package week3.day1.assignments;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		
		System.out.println("Axis Bank Deposit");
	}
	
	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank();
		
		bank.deposit();

	}

}
