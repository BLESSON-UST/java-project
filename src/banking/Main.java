package banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(1,"blesson","gmail");
		Customer b=new Customer(2,"cristo","outlook");
		//Account a=new Account(1234,c,3000);
		Savings s=new Savings(1234,c,3000,1000);
		Savings t=new Savings(5678,b,4000,500);
		System.out.println(s.withdraw(2500));
		System.out.println(s.accbal);
		System.out.println(c.getC_name());
		System.out.println(t.withdraw(250)); 
        System.out.println(t.accbal); 
        System.out.println(b.getC_name());
	}

}
