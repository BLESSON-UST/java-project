package banking;

public abstract class Account {
	protected int accno;
	protected Customer custmorobj;
	protected double accbal;
	public Account(int accno, Customer custmorobj, double accbal) {
		super();
		this.accno = accno;
		this.custmorobj = custmorobj;
		this.accbal = accbal;
	}
	
	public abstract boolean withdraw(double amount);
	

}
