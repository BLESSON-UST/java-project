package array;

import java.util.Scanner;

public class Palnum {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num");
		int n = sc.nextInt();
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
				
		}
		System.out.println(sum);
		if(temp==sum)

		{
			System.out.println(temp+" is paleandrom");
		}
		else
		{
			System.out.println(temp +" is not a paleandrom");
		}
		
	}

}
