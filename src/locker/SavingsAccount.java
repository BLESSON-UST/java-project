package locker;

public class SavingsAccount extends Accounts implements MaintenanceCharge {

	public SavingsAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float MaintenanceCharge=(50 * noOfYears)+50;
		// TODO Auto-generated method stub
		return MaintenanceCharge;
	}
	
	
	

}
