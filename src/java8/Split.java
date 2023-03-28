package java8;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount");
		int n=sc.nextInt();
		System.out.println("Enter the no: of people");
		int p=sc.nextInt();
		System.out.println("Enter the Choice");
		System.out.println("1. Equally");
		System.out.println("2. Unequally");
		int ch=sc.nextInt();
		if(ch==1)
		{
			int s=0;
			for(int i=0;i<p;i++)
			{
//				System.out.println("member " + i+ "have "+ n/p +" shares");
				s=n/p;
			}
			System.out.println("each member have " + s +" share");
		}
		if(ch==2)
		{
			double[] share = new double[p];
			double totalshare=0;
			for(int i=0;i<p-1;i++)
			{
				share[i]=Math.random()*(1-totalshare);
				totalshare=totalshare+share[i];
			}
			share[p-1]=1-totalshare;
			int[] amount = new int[p];
			for(int i=0;i<p;i++)
			{
				amount[i]=(int) (share[i]*n);
			}
			System.out.println("shares are " + Arrays.toString(amount));
		}

	}

}
