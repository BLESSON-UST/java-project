package banking;

public class Savings extends Account{
	private double minbal ;

	public Savings(int accno, Customer custmorobj, double accbal, double minbal) {
		super(accno, custmorobj, accbal);
		this.setMinbal(minbal);
	}

	@Override
	public boolean withdraw(double amount) {
		
		// TODO Auto-generated method stub
		if(accbal - amount> minbal)
		{
			
			accbal=accbal-amount;
			return true;
		
		}
		else {
			return false;
		}
		
	}

	public double getMinbal() {
		return minbal;
	}

	public void setMinbal(double minbal) {
		this.minbal = minbal;
	}
	
	

}
