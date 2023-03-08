package locker;

public class CurrentAccount extends Accounts implements MaintenanceCharge {

	public CurrentAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}
	
	public float calculateMaintenanceCharge(float noOfYears) {
		// TODO Auto-generated method stub
		float MaintenanceCharge=(100 * noOfYears)+200;
		// TODO Auto-generated method stub
		return MaintenanceCharge;
	}
	

}
