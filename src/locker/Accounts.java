package locker;

public class Accounts  {
	private String accountNumber;
	private String customerName;
	private double balance;
	public Accounts(String accountNumber, String customerName, double balance) {
		super();
		this.setAccountNumber(accountNumber);
		this.setCustomerName(customerName);
		this.setBalance(balance);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	

}
