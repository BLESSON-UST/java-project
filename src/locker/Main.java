package locker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CurrentAccount c=new CurrentAccount(null, null, 0);
		SavingsAccount s=new SavingsAccount(null, null, 0);
		System.out.println("1. Current Account" + "\n");
		System.out.println("2. Savings Account" + "\n");
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter Acc no:");
			c.setAccountNumber(sc.next());
			System.out.println("Enter customer name");
			c.setCustomerName(sc.next());
			System.out.println("Enter balance amount");
			double b=sc.nextDouble();
			c.setBalance(b);
			System.out.println("enter the no: of years");
			float noOfyears=sc.nextFloat();
			
			System.out.println("Customer name" + c.getCustomerName());
			System.out.println("Account no:" + c.getAccountNumber());
			System.out.println("Account balance" + c.getBalance());
			float result = c.calculateMaintenanceCharge(noOfyears);
			System.out.println("Maintenance charge for current account is "+ result);
		}
		
		if(ch==2)
		{
			System.out.println("Enter Acc no:");
			s.setAccountNumber(sc.next());
			System.out.println("Enter customer name");
			s.setCustomerName(sc.next());
			System.out.println("Enter balance amount");
			double b=sc.nextDouble();
			s.setBalance(b);
			System.out.println("enter the no: of years");
			float noOfyears=sc.nextFloat();
			
			System.out.println("Customer name" + s.getCustomerName());
			System.out.println("Account no:" + s.getAccountNumber());
			System.out.println("Account balance" + s.getBalance());
			float result = s.calculateMaintenanceCharge(noOfyears);
			System.out.println("Maintenance charge for savings account is  " +result);
		}
	
		

	}

}
