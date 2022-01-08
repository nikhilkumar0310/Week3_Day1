package assignments.day5;

public class AxisBank extends BankInfo {
	
	public void deposit(int amt) {
		System.out.println("The amount deposited should always be "+amt);
	}
	
	void deposit(int amt, String nominee) {
		System.out.println("The deposite account should have "+amt+ " and also a nominee like "+nominee);
	}

	public static void main(String[] args) {
		
		AxisBank facilities = new AxisBank();
		
		facilities.saving();
		facilities.fixed();
		facilities.deposit();
		
		facilities.deposit(1200);
		facilities.deposit(1500, "Mother's Name");

	}

}
