package bankassignmentw3d1;

public class AxisBank {
	

	public void deposit(int amnt2) {
		
		System.out.println(" Deposit amnt for axis : " +amnt2);

}
	
	public static void main (String[] args) {
		
		AxisBank depamnt = new AxisBank();
		depamnt.deposit(250000);
		
		BankInfo depamnt2 = new BankInfo();
		depamnt2.deposit(150000);
		
		
	}
	
	
	
	
}
