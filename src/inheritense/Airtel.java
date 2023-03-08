package inheritense;

public class Airtel implements Sim,SD{

	@Override
	public void dial() {
		// TODO Auto-generated method stub
		System.out.println("dialing with airtel");
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling with airtel");
		
	}

	@Override
	public void storage() {
		// TODO Auto-generated method stub
		System.out.println("poor Storage");
	}

}
