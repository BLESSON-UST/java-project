package javaexamples;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the unit used");
		int u=sc.nextInt();
		double bill=0;
		if (u<=100)
		{
			bill=u*.50;
		}
		else if (u <= 300)
		{
			bill = 50 + (u - 100) * 0.75;
		} 
		else if (u <= 500)
		{
        
			bill = 200 + (u - 300) * 1.20;
		} 
		else 
		{
        
			bill = 380 + (u - 500) * 1.50;
		}
		System.out.println("Total bill is "+bill);
				
		

	}


}















